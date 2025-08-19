package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.site.dto.Member;
import com.site.service.MService;

@Controller
public class MController {
	
	@Autowired MService mService;
	
	// 회원리스트
	@GetMapping("/member/mList")
	public String mList(Model model) {
		List<Member> list = mService.selectAll();
		model.addAttribute("list",list);
		return "member/mList";
	}
	
	// 회원정보보기
	@GetMapping("/member/mView")
	public String mView(Model model) {
		Member member = mService.selectOne();
		model.addAttribute("member",member);
		return "member/mView";
	}
	
	
	// 회원가입
	@GetMapping("/member/member")
	public String member() {
		return "member/memberInput";
	}
	
	@PostMapping("/member/member")
	public String member(Member member, Model model) {
		
		mService.insertOne(member);
		return "redirect:/member/mList";
	}
	
}
