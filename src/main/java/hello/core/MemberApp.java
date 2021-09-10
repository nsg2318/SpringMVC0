package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    //순수한 자바 메서드의 테스트코드 스프링 관련 X
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        //ApplicationContext 가 빈이든 뭐든 다 관리해준다. 이 구문이 스프링 컨테이너에 빈으로 등록해준다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

                                         //AppConfig의 메서드이름
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);

//        MemberService memberService = new MemberServiceImpl();
        Member member1 = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member1);

        Member findMember = memberService.findMember(1L);
        System.out.println("member1 = " + member1.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
