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
	
}
