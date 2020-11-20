package com.board.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.member.dao.IMemberDAO;
import com.board.member.vo.MemberVO;

@Service
public class MemberService implements IMemberService {

	@Autowired
	IMemberDAO memberDAO;
	
	@Override
	public List<MemberVO> getMemberList() {
		return memberDAO.getMemberList();
	}

	@Override
	public void insertMember(MemberVO memberVO) {
		memberDAO.insertMember(memberVO);
	}

	@Override
	public MemberVO getmember(MemberVO memberVO) {
		return memberDAO.getmember(memberVO);
	}

	@Override
	public void deleteMember(MemberVO memberVO) {
		memberDAO.deleteMember(memberVO);
	}

}
