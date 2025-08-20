package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.site.dto.Board;
import com.site.service.BService;

@Controller
public class BController {

	@Autowired BService bService;
	
	// 게시판
	@GetMapping("/board/bList")
	public String bList(Model model) {
		List<Board> list = bService.selectAll();
		model.addAttribute("list",list);
		return "board/bList";
	}
}
