package com.board.member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpSession session) {
		String id = (String)session.getAttribute("id");
		if (id != null) {
			model.addAttribute("id", id);
			return "home_login";
		}
		return "home_logout";
	}
	
}
