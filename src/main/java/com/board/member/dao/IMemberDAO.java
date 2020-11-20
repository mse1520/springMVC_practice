package com.board.member.dao;

import java.util.List;

import com.board.member.vo.MemberVO;

public interface IMemberDAO {
	List<MemberVO> getMemberList();
	void insertMember(MemberVO memberVO);
	MemberVO getmember(MemberVO memberVO);
	void deleteMember(MemberVO memberVO);
}
