package com.mycompany.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.model.LoginVO;
import com.mycompany.service.LoginService;

@Controller
// 포트폴리오
public class MemberController {
	
			@Autowired
			LoginService ls;

			
			// 회원 가입 화면 실행
			// join버튼 클릭시 회원가입 창으로 이동
			@RequestMapping(value="/memberjoin", method = RequestMethod.GET)
			public String join(){
				return "member/join"; // index.jsp "join"버튼 클릭 -> MemberController.java -> join.jsp 회원가입 화면 실행
			}
			
			
			// 회원 가입 서버 (가입하기 버튼 클릭 시 발동! / insert - DB연결 필요해서 Service도 필요)
			@RequestMapping(value = "/memberjoin", method = RequestMethod.POST) 
			public String memberPost (LoginVO member) {
				System.out.println(member);
				ls.memreg(member);	//참조변수ls로 LoginService(인터페이스)의 memreg메서드를 호출 // member라는 데이터를(매개변수를 통해 실어서) MemberController에서 Login Service로 넘겨주려고!!!!
				return "member/join";
			}
	
			
			//-----------------------------------------------------------------------
			
			// 로그인 화면 실행
			// login버튼 클릭시 로그인 창으로 이동
			@RequestMapping(value = "/memberlogin", method = RequestMethod.GET)
			public String login () {
				/*System.out.println("aaaa");*/
				return "member/login"; // 로그인화면을 띄움
			}
			
			/*	
			// 로그인 서버
			@RequestMapping(value = "/memberlogin", method = RequestMethod.POST)
			public String loginPost (HttpSession session, LoginVO member) {
				//HttpSession session = new HttpSession();
				System.out.println("controller="+member);
				System.out.println(ls.login(member));
				
				
				if (ls.login(member)==null) {
					return "member/login";	// DB에 없어서 null값이면  (null == null) true -> 회원이 아니면 로그인페이지로 가도록
					} else {	
						session.setAttribute("login", ls.login(member)); // DB에서 끌고온 LoginVO 데이터를 login 변수에 저장하고 이를 세션에 최종저장 
						return "redirect:/list";	// 리스트로 가도록(지금은 list없어서 오류나는것.)
					}
			*/
			
}
