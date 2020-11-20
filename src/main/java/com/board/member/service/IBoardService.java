package com.board.member.service;

import java.util.List;

import com.board.member.vo.BoardVO;

public interface IBoardService {
	List<BoardVO> getBoardList();
	void insertBoard(BoardVO boardVO);
	BoardVO getBoardDetail(int board);
	void updateBoard(BoardVO boardVO);
}
