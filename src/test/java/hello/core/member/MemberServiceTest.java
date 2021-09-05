package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member2 = new Member(1L, "memberA", Grade.VIP);
        //when
        memberService.join(member2);
        Member findMember = memberService.findMember(1L);
        //then
        //org.assert.jcore? 와 비슷한 이름의 Assertions임
        Assertions.assertThat(member2).isEqualTo(findMember);
    }
}
