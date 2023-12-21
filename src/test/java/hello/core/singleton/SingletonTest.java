package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        //1. 조회 : 호출할 때마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();

        //2. 조회 : 호출할 때마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();

        //3. 참조값이 다른 것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        //memberService1 != memberService2
        assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용 ")
    void singletonServiceTest() {
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        assertThat(singletonService1).isSameAs(singletonService2);
        // same : 자바의 == 비교
        // equal : 자바의 equals
    }

    /*
     * 싱글톤 패턴 문제점
     * 1. 싱글톤 패턴을 구현하는 코드가 많이 들어간다.
     * 2. 의존관계상 클라이언트가 구체 클래스에 의존한다 -> DIP 위반
     * 3. 클라이언트가 구체 클래스에 의존해서 OCP 위반할 가능성이 높다.
     * 4. 테스트하기 어렵다.
     * 5. 내부 속성을 변경하거나 초기화 하기 어렵다.
     * 6. private 생성자로 자식 클래스를 만들기 어렵다.
     * 7. 결론적으로 유연성이 떨어진다.
     * 8. 안티패턴으로 불리기도 한다.
     * => 싱글톤 컨테이너(스프링 컨테이너) 는 위의 단점을 다 보완해준다.
     * */

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
//        AppConfig appConfig = new AppConfig();
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);


        MemberService memberService1 = ac.getBean("memberService", MemberService.class);

        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        // 참조값이 같은 것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        //memberService1 == memberService2
        assertThat(memberService1).isSameAs(memberService2);
    }
}
