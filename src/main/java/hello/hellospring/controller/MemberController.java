package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //MemberController가 생성될 때 스피링 빈에 등록되어있는 MemberService를 넣어줌 - DI
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
