package com.board.member.service;

import java.util.List;

import com.board.member.vo.MemberVO;

public interface IMemberService {
	List<MemberVO> getMemberList();
	void insertMember(MemberVO memberVO);
	MemberVO getmember(MemberVO memberVO);
	void deleteMember(MemberVO memberVO);
}
