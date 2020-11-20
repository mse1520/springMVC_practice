package com.board.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.member.service.IBoardService;
import com.board.member.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	IBoardService boardService;
	
	@RequestMapping(value="board/list")
	public String boardList(HttpSession session, Model model) {
		if(session.getAttribute("id") == null) {
			return "redirect:/";
		}
		
		List<BoardVO> boards = boardService.getBoardList();
		model.addAttribute("boards", boards);
		return "board/list";
	}
	
	@RequestMapping(value="board/detail/{boardnum}")
	public String boardDetail(HttpSession session, @PathVariable int boardnum, Model model) {
		BoardVO boardVO = boardService.getBoardDetail(boardnum);
		model.addAttribute("board", boardVO);
		return "board/detail";
	}
	
	@RequestMapping(value="board/update/{boardnum}", method=RequestMethod.GET)
	public String boardUpdate(HttpSession session, @PathVariable int boardnum, Model model) {
		String name = (String)session.getAttribute("id");
		if(name == null) {
			return "redirect:/";
		}
		BoardVO boardVO = boardService.getBoardDetail(boardnum);
		if (name.equals(boardVO.getName())) {
			model.addAttribute("board", boardVO);
			return "board/update";
		}
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="board/update/{boardnum}", method=RequestMethod.POST)
	public String boardUpdate(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "redirect:/board/detail/" + boardVO.getBoardnum();
	}
	
	@RequestMapping(value="board/insert", method=RequestMethod.GET)
	public String boardInsert(HttpSession session, Model model) {
		String name = (String)session.getAttribute("id");
		if(name == null) {
			return "redirect:/";
		}
		model.addAttribute("name", name);
		return "board/insert";
	}
	
	@RequestMapping(value="board/insert", method=RequestMethod.POST)
	public String boardInsert(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		
		return "redirect:/";
	}
	
}




