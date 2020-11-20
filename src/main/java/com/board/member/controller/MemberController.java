package com.board.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.member.service.IMemberService;
import com.board.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	IMemberService memberService;
	
	@RequestMapping(value="member/list")
	public String getMemberList(Model model, HttpSession session) {
		if (session.getAttribute("id") == null) {
			return "redirect:/login";
		}
		List<MemberVO> members = memberService.getMemberList();
		model.addAttribute("members", members);
		return "member/memberList";
	}
	
	@RequestMapping(value="member/insert", method = RequestMethod.GET)
	public String insertMember() {
		return "member/memberform";
	}
	
	@RequestMapping(value="member/insert", method = RequestMethod.POST)
	public String insertMember(MemberVO memberVO) {
		memberService.insertMember(memberVO);
		return "redirect:/member/list";
	}
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String loginPage() {
		return "member/login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String loginPage(MemberVO member, HttpSession session) {
		MemberVO result = memberService.getmember(member);
		if (result == null) {
			return "member/id_fail";
		} else {
			if (result.getPw().equals(member.getPw())) {
				session.setAttribute("id", member.getId());
				return "redirect:/";
			}
			return "member/pw_fail";
		}
	}
	
	@RequestMapping(value="member/delete", method = RequestMethod.GET)
	public String deleteMemeber(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
		if (id == null) {
			return "redirect:/login";
		}
		model.addAttribute("id", id);
		
		return "member/delete";
	}
	
	@RequestMapping(value="member/delete", method = RequestMethod.POST)
	public String deleteMemeber(HttpSession session, String pw, Model model) {
		
		String id = (String)session.getAttribute("id");
		MemberVO member = new MemberVO();
		
		member.setId(id);
		member = memberService.getmember(member);

		if(member.getPw().equals(pw)) {
			memberService.deleteMember(member);
			session.invalidate();
			return "redirect:/";
		}
		return "member/delete_fail";
	}
	
	@RequestMapping(value="logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
