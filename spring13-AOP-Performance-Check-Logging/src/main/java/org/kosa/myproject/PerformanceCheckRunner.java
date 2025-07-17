package org.kosa.myproject;

import org.kosa.myproject.model.board.BoardService;
import org.kosa.myproject.model.member.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PerformanceCheckRunner implements CommandLineRunner{
	private final MemberService memberService;
	private final BoardService boardService;
	// @Autowired
	// 자동 DI
	public PerformanceCheckRunner(MemberService memberService, BoardService boardService) {
		super();
		this.boardService = boardService;
		this.memberService = memberService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		boardService.find();
		boardService.findAllList();
		memberService.findMember();
		memberService.findAllMember();
		try {
			memberService.register("java", "아이유");
		}catch (Exception e) {
			System.out.println("main: "+e.getMessage());
		}
	}
}
