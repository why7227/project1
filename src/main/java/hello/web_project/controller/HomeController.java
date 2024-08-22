package hello.web_project.controller;

import hello.web_project.domain.member.Member;
import hello.web_project.repository.member.MemberRepository;
import hello.web_project.session.SessionConst;
import hello.web_project.session.SessionManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final MemberRepository memberRepository;

    public String home() {
        return "index";
    }
    @GetMapping("/")
    public String homeLogin(
            @SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false) Member loginMember, Model model) {

        //세션에 회원 데이터가 없으면 index
        if(loginMember == null) {
            return "index";
        }

        //세션이 유지되면 loginHome 으로 이동
        model.addAttribute("member", loginMember);
        return "loginHome";
    }
}
