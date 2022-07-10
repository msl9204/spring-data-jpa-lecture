package study.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;
import java.util.UUID;

@EnableJpaAuditing
@SpringBootApplication
public class SpringDataJpaLectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaLectureApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorProvider() {
        // 여기서 Security Context 나 HttpSession 등에서 식별값을 꺼내와야함
        return () -> Optional.of(UUID.randomUUID().toString());
    }
}
