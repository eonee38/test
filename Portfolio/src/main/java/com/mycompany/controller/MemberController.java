package com.mycompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
				return "/index";
			}
	
			
			//-----------------------------------------------------------------------
			
			/*// 로그인 화면 실행
			// login버튼 클릭시 로그인 창으로 이동
			@RequestMapping(value = "/memberlogin", method = RequestMethod.GET)
			public String login () {
				return "member/login"; // 로그인화면을 띄움
			}*/
			
				
			// 로그인 서버
			@RequestMapping(value = "/memberlogin", method = RequestMethod.POST)
			public String loginPost (HttpSession session, LoginVO member) {
				
			
				session.setAttribute("login", ls.login(member)); // DB에서 끌고온 LoginVO 데이터를 login 변수에 저장하고 이를 세션에 최종저장 
				
				
				if (ls.login(member)==null) {
					return "member/join";	// DB에 없어서 null값이면  (null == null) true -> 회원이 아니면 가입페이지로 가도록
				} else {	
					return "/index"; //"member/memberInfo"; 
				}		
}
			
			// --------------------------------------------------------
			
		
	// 로그인로그아웃
		/*	@RequestMapping()
				public String member_login_ok(HttpServletRequest request, HttpServletResponse response) {
				//id, pwd 보내기
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				//SQL 연동
				MemberVO vo = Membe
				
				
				return "";
			}
			*/
			
			
			
			
			
			
			
	// 회원 정보 보기
			/*@RequestMapping(value = "/info", method = RequestMethod.GET)
			public void infoGet(HttpSession session, Model model) {
				
				//세션 객체 안에 있는 ID 정보 저장
				String id  = (String) session.getAttribute("id");
				
			}*/
			
			
			// 회원정보 수정 페이지
			@RequestMapping(value = "/memberInfo", method = RequestMethod.GET)
			public String infoGet(HttpSession session, Model model) {
				String id  = (String) session.getAttribute("id"); // 세션에 저장되어있는 아이디를 가져옴.
				return "member/memberInfo"; // 회원정보 페이지로 이동
			}
			
			
			// 회원정보 수정 
			@RequestMapping(value = "/modify", method = RequestMethod.POST)
			//public String memberModify(String name, String id, String password, String phone) { -- 폼태그-input태그의 name속성의 값이 일치하면 스프링은 자동 수집해줌. 이와 같은 방법도 가능은 하나, 메모리 소모8*4=32바이트 소모(비효율)
			//LoginVO는 8바이트만 소모, private 데이터 보호도 가능
				public String memberModify(LoginVO login, RedirectAttributes rttr) { // RedirectAttributes import 필요!
				ls.memberModify(login);
				rttr.addAttribute("id", login.getId());
				return "redirect:/memberInfo"; // 수정 후 어떤 화면으로 이동
			}
			
			// 회원정보 삭제
			@RequestMapping(value = "/remove", method = RequestMethod.POST)
			public String memberRemove(LoginVO login) {
				ls.memberRemove(login);
				return "redirect:/../index"; // select하지 않아서 리다이렉트함?
			}
			
			
			
			
			
			
			
			
			
}
