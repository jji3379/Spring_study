package com.gura.spring05.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.cafe.dto.CafeCommentDto;
import com.gura.spring05.cafe.dto.CafeDto;

public interface CafeService {
	//새글을 저장하는 메소드
	public void saveContent(CafeDto dto);
	//글목록을 얻어오고 페이징 처리에 필요한 값들을 ModelAndView 객체에 담아주는 메소드
	public void getList(ModelAndView mView, HttpServletRequest request);
	//글하나의 정보를 ModelAndView 객체에 담아주는 메소드
	public void getDetail(int num, ModelAndView mView);
	//수정 하는 메소드
	public void updatelogic(CafeDto dto, ModelAndView mView, HttpServletRequest request);
	//글을 삭제하는 메소드
	public void deletelogic(int num);
	//수정 폼 로직
	public void updateformlogic(HttpServletRequest request, ModelAndView mView);
	//댓글을 저장하는 메소드
	public void saveComment(HttpServletRequest request);
	public void deleteComment(HttpServletRequest request);//댓글 삭제
	public void updateComment(CafeCommentDto dto);//댓글 수정
	public void moreCommentList(HttpServletRequest request);//댓글 추가 응답
}
