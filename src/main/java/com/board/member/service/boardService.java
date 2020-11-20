package com.board.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.member.dao.IBoardDAO;
import com.board.member.vo.BoardVO;

@Service
public class boardService implements IBoardService{

	@Autowired
	IBoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}

	@Override
	public BoardVO getBoardDetail(int board) {
		boardDAO.hitPlus(board);
		return boardDAO.getBoardDetail(board);
	}

	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}

}
