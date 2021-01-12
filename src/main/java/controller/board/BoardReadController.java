package controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.dto.Board;
import spring.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardReadController {
	
	@Autowired
	MemberService ms;
	
	
	@GetMapping("/list")
	public String boardList(Model model, Board board) {
		//board 파라미터값 변수
		model.addAttribute("list", ms.boardList(board));
		return "/board/boardList";
	}
}
