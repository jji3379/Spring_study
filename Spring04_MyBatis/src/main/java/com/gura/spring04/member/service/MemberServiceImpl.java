package com.gura.spring04.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.member.dao.MemberDao;
import com.gura.spring04.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao dao;
	
	@Override
	public void addMember(MemberDto dto) {
		dao.insert(dto);
	}

	@Override
	public void updateMember(MemberDto dto) {
		dao.update(dto);
	}

	@Override
	public void deleteMember(int num) {
		dao.delete(num);
	}
	
	//번호를 이용해서 회원정보를 얻어와서 ModelAndView 객체에 담아주는 메소드
	@Override
	public void getMember(int num, ModelAndView mView) {
		MemberDto dto=dao.getData(num);
		mView.addObject("dto",dto);
	}

	@Override
	public void getMemberList(ModelAndView mView) {
		List<MemberDto> list=dao.getList();
		mView.addObject("list",list);
	}
}
