package hello.web_project.repository.member;

import hello.web_project.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisMemberRepository implements MemberRepository{
    private final MemberMapper memberMapper;

    @Override
    public Member save(Member member) {
       memberMapper.save(member);
       return member;
    }
    @Override
    public Member findById(Long mId) {
        return memberMapper.findById(mId);
    }
    @Override
    public Optional<Member> checkLoginId(String loginId) {
        return memberMapper.checkLoginId(loginId);
    }
    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }
}
