package com.mycompany.service;

import com.mycompany.model.LoginVO;

//포트폴리오
public interface LoginService {
	public void memreg(LoginVO member); //memreg(회원등록 메서드) / 인터페이스-설계
	public LoginVO login(LoginVO member);
	
	
	//회원 정보 수정
	public void memberModify(LoginVO login);
	
	// 회원 정보 삭제
	public void memberRemove(LoginVO login);
}
