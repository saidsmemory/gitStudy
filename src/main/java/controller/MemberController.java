package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.dto.Member;
import spring.service.MemberService;

@Controller
@EnableTransactionManagement
public class MemberController {

	@Autowired
	MemberService ms;

	@Autowired
	Member mm;

	@RequestMapping("/main")
	public String memberSelect() {
		mm.setId("2");
		ms.print(mm);
		return "main";
	}

	@RequestMapping("/insert")
	public String memberInsert() {
		return "insert";
	}

	@RequestMapping("/insertPage")
	public String insertPage(Member member) {
		ms.add(member);
		return "insertPage";
	}

	@RequestMapping("/select")
	public String memberD() {
		return "select";
	}

	@RequestMapping("/selectdetail")
	public String memberDt(Member member, Model model) {
		
		Member kiki = ms.detail(member);
		model.addAttribute("nana", kiki);
		
		//model.addAttribute("nana", ms.detail(member));         //위에 두줄을 한줄로 줄이면 이렇게 가능 음 ms.detail(member)는 where로 추출된녀석에 name,id,password등등 모든 정보를 가지고있슴
		
		return "selectdetail";
	}

	@RequestMapping("/delete")
	public String memberDelete() {
		return "delete";
	}

	@RequestMapping("/deletePage")
	public String deletePage(Member member, Model model) {
		int i = ms.del(member);
		if (i == 1) {
			model.addAttribute("nana", i);
		}
		return "deletePage";
	}
	
	@RequestMapping("/update")
	public String update() {
		return "update";
	}

	@RequestMapping("/updatepage")
	public String updatepage(Member member, Model model) {
		ms.update(member);
		String msg = "update success";
		model.addAttribute("msgs", msg);
		return "updatepage";
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("controller!");
		return "home";
		
	}
	

}
