package com.mycompany.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.mapper.BoardAttachMapper;
import com.mycompany.mapper.BoardMapper;
import com.mycompany.model.AttachFileVO;
import com.mycompany.model.BoardVO;
import com.mycompany.model.CriteriaVO;

//포트폴리오
@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper bm;	// board 테이블 mapper // mapper(SQL문장 들어있음= DB)위치 : src/main/resources  -> org -> hj  -> mapper
	@Autowired
	BoardAttachMapper bam;// attach테이블 mapper
	
	// BoardService 에서 설계되어진 write 추상메서드를 구현
	public void write(BoardVO board) { bm.write(board);} 
		// BoardMapper에 있는 write메서드를 호출
		// 메서드의 매개변수를 통해 BoardVO 값을
		// BoardMapper의 write 메서드로 전달
		
		//if문 쓰기 - 첨부파일이 있으면 실행시키고 없으면 밑에꺼를 실행시켜라.
/*		if() {
		bm.write(board);
		System.out.println("BoardService="+board.getAttach());
		board.getAttach().forEach(attach->{
			System.out.println("service="+attach);
		// AttachFileVO의 bno에 BoardVO의 bno를 저장 
		}else 
			
			attach.setBno(board.getBno());
			bam.insert(attach);				
		});
	}*/
	

	// BoardService에서 설계되어진 list추상메서드를 구현
	public ArrayList<BoardVO> list(CriteriaVO cri) {
		return bm.list(cri);
	}

	@Transactional
	public BoardVO detail(BoardVO board) {
		// 상세페이지 조회 할 때
		// 조회수 + 1 update
		bm.cntup(board);
		return bm.detail(board);
	}
	// BoardService에서 설계되어진 modify 추상메서드를 구현
	public void modify(BoardVO board) {
		bm.modify(board);
	}
	// BoardService에서 설계되어진 remove 추상메서드를 구현
	public void remove(BoardVO board) {
		bm.remove(board);
	}
	public int total(CriteriaVO cri) {
		return bm.total(cri);
	}
	// 첨부파일 조회 구현
	public ArrayList<AttachFileVO> attachlist (int bno){
		return bam.attachlist(bno);
	}
}
