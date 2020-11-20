package com.board.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.board.member.vo.BoardVO;

public interface IBoardDAO {
	List<BoardVO> getBoardList();
	void insertBoard(BoardVO boardVO);
	BoardVO getBoardDetail(@Param("boardnum") int board);
	void hitPlus(@Param("boardnum") int board);
	void updateBoard(BoardVO boardVO);
}
