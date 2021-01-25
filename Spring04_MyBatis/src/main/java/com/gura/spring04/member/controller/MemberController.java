package com.gura.spring04.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.member.dao.MemberDao;
import com.gura.spring04.member.dto.MemberDto;

@Controller
public class MemberController {
	// MemberDao 인터페이스 type 을 주입(DI) 받아서 사용한다.
	@Autowired
	private MemberDao dao;
	
	@RequestMapping("/member/list.do")
	public ModelAndView list(ModelAndView mView) {
		//1. 회원 목록을 얻어온다.
		List<MemberDto> list=dao.getList();
		//2. 회원 목록을 request scope 에 담고 view page 로 forward 이동해서 응답
		mView.addObject("list", list);
		mView.setViewName("member/list");
		return mView;
	}//list END
	
	@RequestMapping("/member/insertform.do")
	public String insertform() {
		//view page 정보만 전달
		return "member/insertform";		
	}//insertform END
	
	@RequestMapping("/member/insert.do")
	public String insert(@ModelAttribute MemberDto dto) {
		dao.insert(dto);
		
		return "member/insert";
		/*
		 public ModelAndView insert(@ModelAttribute MemberDto dto,
		 		ModelAndView mView){
		 		 //DB에 저장하는 비즈니스 로직 수행
		 		 dao.insert(dto);
		 		 //ModelAndView 객체에 dto 라는 키값으로 dto를 담고
		 		 mView.addObject("dto",dto);
		 		 //view page 정보를 담고
		 		 mView.setViewName("");
		 		 return mView;
		 		} 
		 */
	}//insert END
	
	@RequestMapping("/member/updateform.do")
	public String updateform(HttpServletRequest request) {
		int num=Integer.parseInt(request.getParameter("num"));
		request.setAttribute("num", num);
		System.out.println(num);
		return "member/updateform";
	}//updateform END
	
	@RequestMapping("/member/update.do")
	public String update(@ModelAttribute MemberDto dto) {
		dao.update(dto);
		
		return "member/update";
	}
	@RequestMapping("/member/delete")
	public ModelAndView delete(@RequestParam int num,
			ModelAndView mView) {
			
		dao.delete(num);
		mView.addObject("num",num);
		mView.setViewName("member/delete");
		return mView;
	}
}
