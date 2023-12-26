package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

//    @Autowired // ac.getBean(MemberRepository.class);
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findeById(memberId);
    }
}
