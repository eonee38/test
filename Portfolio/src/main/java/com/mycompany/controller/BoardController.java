package com.mycompany.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.model.AttachFileVO;
import com.mycompany.model.BoardVO;
import com.mycompany.model.CriteriaVO;
import com.mycompany.model.PageVO;
import com.mycompany.service.BoardService;

// 포트폴리오
@Controller
public class BoardController {
	// 비즈니스 모델을 컨트롤러에 연결하기
		@Autowired
		// int		 a;
		BoardService bs;

		@RequestMapping(value = "/board/list", method = RequestMethod.GET)
		// 게시판 목록 리스트
		public String list (Model model, CriteriaVO cri) { //  Model객체는 데이터 전달자(컨트롤러에서 생성된 데이터를 담아서 전달하는 역할)
			System.out.println(cri);
			// list.jsp 실행 할 때 select 된 결과를 가져와라
			model.addAttribute("list", bs.list(cri));
			// list.jsp 실행 할 때 PageVO에 저장되어 있는 데이터를 가져와라.
			//                           생성자 호출(매개변수가 2개인 생성자)
			// board테이블(게시판테이블)에 전체 건수(select해서)를 아래에 190대신에 대입
			int total=bs.total(cri);
			//model.addAttribute("paging", new PageVO(cri, 190));
			model.addAttribute("paging", new PageVO(cri, total));
			return "board/list";
		}
		// 게시판 상세 페이지
		@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
		// public String detail(int bno){
		public String detail (BoardVO board, Model model) {
			System.out.println(board);
			// bs.detail(bno);
			model.addAttribute("detail", bs.detail(board));
			return "board/detail";
		}
		// 게시판 수정 페이지 이동
		@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
		public String edit (BoardVO board, Model model) {
			System.out.println(board);
			model.addAttribute("detail", bs.detail(board));
			return "board/editPage";
		}
		
		// 게시판 수정
		@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
		public String modify (BoardVO board, RedirectAttributes rttr) {
			bs.modify(board);
			rttr.addAttribute("bno", board.getBno());
			// 수정하고 난 뒤 확인을 위해 목록list로 화면이동
			return "redirect:/board/detail";   // 재전송(redirect)처리
		}
		
		// 게시판 삭제
		@RequestMapping(value = "/board/remove", method = RequestMethod.GET)
		public String remove (BoardVO board) {
			bs.remove(board);
			return "redirect:/board/list";
		}
		
		// 게시판 글쓰기 페이지 (화면)
		@RequestMapping(value = "/board/write", method = RequestMethod.GET)
		public String write () {
			return "board/write";
		}
		// 게시판 글쓰기 페이지 (insert 이루어짐)
		@RequestMapping(value = "/board/write", method = RequestMethod.POST)
		public String total (BoardVO board) {
			System.out.println(board);
			// 비즈니스 영역 연결한 후 BoardService
			bs.write(board); //여기서 에러
			return "redirect:/board/list";
		}
		

	
		
		// 해당게시물의 첨부파일의 데이터를 ajax로 전송
		@RequestMapping(value = "/attachlist", method = RequestMethod.GET)
		public ResponseEntity<ArrayList<AttachFileVO>> uploadAjaxPost(int bno) {
			//ResponseEntity타입: reponse할 때 Http 헤더 정보와 내용을 가공하는 용도로 사용
			return new ResponseEntity<>(bs.attachlist(bno),HttpStatus.OK);
		}
		
		//리턴타입이 String : jsp파일의 경로와 파일이름을 나타내기 위해 사용 - redirect / forward 2가지 방식이 있음
		// void : 호출하는 Url과 동일한 이름의 jsp를 의미
	
}
