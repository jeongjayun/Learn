package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

//        MemberService memberService = new MemberServiceImpl();

        // AppConfig 설정
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // Spring으로 전환하기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // ApplicationContext : 스프링 컨테이너
        // 스프링컨테이너는 XML 기반으로 만들 수도 있고, 애노테이션 기반의 자바 설정 클래스로 만들 수도 있다.
        // 스프링컨테이너는 BeanFactory or ApplicationContext로 구분해서 이야기한다. BeanFactory를 직접적으로 사용하는 일은 요즘 거의 없음. 일반적으로 ApplicationContext를 스프링 컨테이너라 한다.
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        //Long 타입이라서 1L
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member : " + member.getName());
        System.out.println("find member : " + findMember.getName());
    }
}
