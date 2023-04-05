package com.mycompany.model;

// 포트폴리오-회원가입 모델
public class LoginVO {
	
	
	private String id;
	private String password;
	private String name;
	private String birthday;
	private String phone;
	private String email;
	private String gender;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 콘솔에서 보기 위함
	@Override //부모의 메소드가 마음에 들지 않아서 약간 수정한 것 . extends안하면 기본적으로 Object(객체의 최상위 클래스)클래스를 상속받게 되어있음. // Object클래스 안에 toString()메소드를 오버라이딩. 주소 출력하는 메서드인데, 이걸 변형한ㄱ것. 어떤 값이 들어간지르 확인하려고
	public String toString() {
		return "LoginVO [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + ", email="
				+ email + ", gender=" + gender + "]";
	}
}
