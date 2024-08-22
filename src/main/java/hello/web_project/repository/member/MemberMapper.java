package hello.web_project.repository.member;

import hello.web_project.domain.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    void save(Member member);

    Member findById(Long mId);
    Optional<Member> checkLoginId(String loginId);
    List<Member> findAll();
    }

