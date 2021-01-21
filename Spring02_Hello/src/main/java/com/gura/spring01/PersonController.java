package com.gura.spring01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	//2. 이 메소드로 어떤 요청을 처리 할 것 인지 @RequestMapping 어노테이션에 명시한다.
		@RequestMapping("/person.do")
		public String person(HttpServletRequest request) { // 리턴 type 은 String, 메소드명은 마음대로 지을 수 있다.
			
			String Todayperson="고양이 보고싶다...";
			// request scope 에 담는다
			request.setAttribute("Todayperson", Todayperson);
			
			return "person";
		}
}
