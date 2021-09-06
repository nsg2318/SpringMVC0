package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA",Grade.VIP);
        memberService.join(member);

        Order result = orderService.createOrder(memberId,"itemA",10000);

        System.out.println("result =" + result.toString());

//        여기부터 인스턴스만 생성된 상태에서 강의 멈추고 혼자 해본 코딩
//        거의 똑같음 짝짝짝. 그러나 테스트코드로 짜야한다 이렇게 메인으로 돌리는건 좋지 않음
//        Member member = new Member(1L, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        Order result = orderService.createOrder(member.getId(),"aa",2500);
//        System.out.println(result.toString());
    }
}
