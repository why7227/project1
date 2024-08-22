package hello.web_project.config;

import hello.web_project.exception.interceptor.LogInterceptor;
import hello.web_project.repository.item.ItemMapper;
import hello.web_project.repository.item.ItemRepository;
import hello.web_project.repository.item.MybatisItemRepository;
import hello.web_project.repository.member.MemberMapper;
import hello.web_project.repository.member.MemberRepository;
import hello.web_project.repository.member.MybatisMemberRepository;
import hello.web_project.service.ItemService;
import hello.web_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
//@Configuration 이 붙은 어노테이션은 애플리케이션 시작 시점에 실행되므로, 미리 필요한 Bean 을 생성하거나 설정할 수 있다.
@RequiredArgsConstructor
public class MybatisConfig {
    private final ItemMapper itemMapper;
    private final MemberMapper memberMapper;

    @Bean
    public ItemService itemService() {
        return new ItemService(itemRepository());
    }
    @Bean
    public ItemRepository itemRepository() {return new MybatisItemRepository(itemMapper);}
    public MemberService memberService() { return new MemberService(memberRepository());}
    public MemberRepository memberRepository() {return new MybatisMemberRepository(memberMapper);}


}


