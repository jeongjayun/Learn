package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        /*basePackages = "hello.core.member",
        //탐색할 패키지의 시작 위치를 정해줄 수 있다.
        basePackageClasses = AutoAppConfig.class,
        default로 아무 설정도 하지 않으면 ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작위치가 된다.

        ** 권장하는 방법 **
        패키지 위치를 지정하지 않고 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것이다.
        최근 스프링 부트도 이 방법을 기본으로 제공한다.

        컴포넌트 스캔 기본 대상
        @Component : 컴포넌트 스캔에서 사용
        @Controller : 스프링 MVC 컨트롤러
        @Service : 스프링 비즈니스 로직 사용
        @Repository : 스프링 데이터 접근 계층에서 사용
        @Configuration : 스프링 설정정보에서 사용
        => 어노테이션은 상속관계라는 게 없음.
        */
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//ComponentScan : @Component 어노테이션 붙은 클래스를 모두 자동으로 스캔해서 스프링 빈으로 등록함.
//위처럼 필터를 걸어줄 수 있지만 실무에서는 필터 거는 일은 없다.
//Component + Autowired 까지 함께 씀

public class AutoAppConfig {
    /*@Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/
}
