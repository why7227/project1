package hello.web_project.repository.member;

import hello.web_project.domain.member.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository {
    Member save(Member member);
    Member findById(Long mId);
    Optional<Member> checkLoginId(String loginId);
    List<Member> findAll();
}
