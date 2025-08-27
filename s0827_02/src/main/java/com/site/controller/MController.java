package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.dto.Member;
import com.site.service.MService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MController {
	
	@Autowired MService mService;
	@Autowired HttpSession session;
	
	@GetMapping("/member/login")	// 로그인페이지 열기
	public String login() {
		return "member/login";
	}

	@PostMapping("/member/login")	// 로그인 확인
	public String login(HttpServletResponse response,
			RedirectAttributes redirect,
			Member m, Model model) {
		String url = "";
		System.out.println("id: "+m.getId());
		System.out.println("id: "+m.getPw());
		Member member = mService.findByIdAndPw(m.getId(),m.getPw());
		if (member.getId() == null) {
			System.out.println("아이디 또는 패스워드가 없습니다. 다시 입력하세요.");
			url = "redirect:/member/login";
		}else {
			System.out.println("로그인 성공");
			session.setAttribute("session_id", member.getId());
			session.setAttribute("session_name", member.getName());
			redirect.addFlashAttribute("flag","1");	// redirect시 변수전달가능
			url = "redirect:/";
		}
		System.out.println("member: "+member);
		
		return url;
	}
}
