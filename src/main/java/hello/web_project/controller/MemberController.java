package hello.web_project.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import hello.web_project.domain.member.Member;
import hello.web_project.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/add")
    public String addForm(@ModelAttribute("member") Member member, Model model) {
        model.addAttribute("member", member);
        return "member/addMemberForm";
    }

    @PostMapping("/add")
    public String save(@Valid @ModelAttribute("member") Member member, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "member/addMemberForm";
        }
        if(!member.getPassword().equals(member.getCheckPassword())) {
            bindingResult.rejectValue("password", "passwordIncorrect", "2개의 패스워드가 일치하지 않습니다.");
            return "member/addMemberForm";
        }
        memberService.save(member);
        return "redirect:/";
    }
}
