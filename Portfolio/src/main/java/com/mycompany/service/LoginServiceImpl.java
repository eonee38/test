package com.mycompany.service;

import com.mycompany.mapper.LoginMapper;
import com.mycompany.model.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//포트폴리오
@Service  // 서비스 어노테이션 안하면 웹 실행 불가.....!
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper lm; // lm 참조변수
	
	public void memreg(LoginVO member) { // memreg(회원등록 메서드)선언  / 클래스-구현
		lm.memreg(member); 
	};
	
	public LoginVO login (LoginVO member) {
		System.out.println("service="+member);
		System.out.println("service return="+ lm.login(member));
		return lm.login(member);
	}
	
	// 회원 정보 수정
	public void memberModify(LoginVO login) {
		lm.memberModify(login);
	}
	
	
	// 회원 정보 삭제
	public void memberRemove(LoginVO login) {
		lm.memberRemove(login);
	}
	
	
}
