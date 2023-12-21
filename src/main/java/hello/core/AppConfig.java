package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정정보
public class AppConfig {

    //@Bean memberService -> new MemoryMemberRepository()
    //@Bean orderService -> memberRepository() -> new MemoryMemberRepository()

    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.memberRepository
    //call AppConfig.orderService
    //call AppConfig.memberRepository
    //우리 예상으로는 빈이 등록되고 각 메서드가 실행되려면 멤버레포지토리는 총 세번 호출이 될텐데
    //-------------------------------------------
    //실제로 테스트 돌려보면 멤버레포지토리는 1회만 출력됨.
    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.orderService

    @Bean(name = "memberService")
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    // 빈 이름
    // 메서드 이름을 사용한다. 위처럼 name ="" 으로 이름 지정해줄 수 있음.
    // 빈 이름은 항상 다른 이름을 부여해야 한다. 같은 이름을 부여하면 다른 빈이 무시되거나 기존 빈을 덮어버리는 등 설정에 따라 오류가 발생한다. 실무에서는 단순하고 명확하게 개발해야 한다.

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        System.out.println("call AppConfig.discountPolicy");
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
