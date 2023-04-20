package com.mycompany.mapper;

import com.mycompany.model.LoginVO;

//포트폴리오
public interface LoginMapper {
	public void memreg(LoginVO member);
	public LoginVO login(LoginVO member);

// 회원정보 수정
	public void memberModify(LoginVO login);
	
// 회원정보 삭제
	public void memberRemove(LoginVO login);

}
