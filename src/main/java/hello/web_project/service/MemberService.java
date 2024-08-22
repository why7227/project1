package hello.web_project.service;

import hello.web_project.domain.member.Member;
import hello.web_project.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member save(Member member) {
        return memberRepository.save(member);
    }
    Member findById(Long mId) {
        return memberRepository.findById(mId);
    }
    Optional<Member> checkLoginId(String loginId) {
        return memberRepository.checkLoginId(loginId);
    }
    List<Member> findAll() {
        return memberRepository.findAll();
    }
}