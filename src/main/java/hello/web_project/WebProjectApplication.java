package hello.web_project;

import hello.web_project.config.MybatisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
@Slf4j
@Import(MybatisConfig.class)
@SpringBootApplication
public class WebProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
	}
}
