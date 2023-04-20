package com.mycompany.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/*private static final Logger logger = LoggerFactory.getLogger(HomeController.class);*/
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";	// index 화면을 실행
	}*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)  // http://localhost:8080"/"
	// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String home(Locale locale, Model model) { //home 메소드 실행
			return "index";	// /WEB-INF/views/index.jsp
		}
	// 상세페이지에서 home 클릭시 메인페이지로 가기
	
	

	
	// 상세 페이지
		@RequestMapping(value = "/portfolio-details", method = RequestMethod.GET)
		public String detail() {
		/*	System.out.println("aaaa");*/
			return "portfolio-details"; 
		}
	
	// 상세페이지에서 home 클릭시 메인페이지로 가기
		@RequestMapping(value = "/home", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
			public String home() {
				return "index";	// 메인페이지
			}
		

		// portfolio-details 상세페이지 네비게이션 바 - home(index)해당 섹션(포트폴리오 리스트) 연결
		@RequestMapping(value = "/home#portfolio", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String move() {
			return "#portfolio";	// 포트폴리오 목차로 가기  (#id 이용해서 이동하는 원리)
		}
		
		// portfolio-details 상세페이지 네비게이션 바 - home(index)해당 섹션(자기소개) 연결
		@RequestMapping(value = "/home#about", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String move2() {
			return "#about";	// 내 소개 목차로 가기
		}
			
		// portfolio-details 상세페이지 네비게이션 바 - home(index)해당 섹션(아카이브) 연결
		@RequestMapping(value = "/home#services", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String move4() {
			return "#services";	// 내 소개 목차로 가기
		}
		
		// portfolio-details 상세페이지 네비게이션 바 - home(index)해당 섹션(아카이브) 연결
		@RequestMapping(value = "/home#faq", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String move5() {
			return "#faq";	// 내 소개 목차로 가기
		}
		
		// portfolio-details 상세페이지 네비게이션 바 - home(index)해당 섹션(아카이브) 연결
		@RequestMapping(value = "/home#board", method = RequestMethod.GET)
		// 접근제어자  반환타입  메서드명(매개변수, 매개변수)
		public String move6() {
			return "#board";	// 내 소개 목차로 가기
		}
		
		
		
		/*//로그인회원가입----------------------------------------------------
		
		// login버튼 클릭시 로그인 창으로 이동
		@RequestMapping(value="/memberlogin", method = RequestMethod.GET)
		public String login(){
			return "member/login";
		}
		
		
		// join버튼 클릭시 회원가입 창으로 이동
		@RequestMapping(value="/memberjoin", method = RequestMethod.GET)
		public String join(){
			return "member/join";
		}*/
		
		
		// 게시판------------------------------------------------------------
		
		/*// 게시판 목록리스트
		@RequestMapping(value="/board", method = RequestMethod.GET)
		public String list(){
			return "board/list";
		}
		
		// 게시판 상세페이지
		@RequestMapping(value="/board/detail", method = RequestMethod.GET)
		public String listDetail(){
			return "board/listDetail";
		}
		
		
		
		// 게시판 글쓰기
		@RequestMapping(value="/board/write", method = RequestMethod.GET)
		public String write(){
			return "board/writeList";
		}*/
		
		
		
}
