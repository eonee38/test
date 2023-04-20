package com.mycompany.model; // 모델은 데이터전달자(컨트롤러에서 생성된 데이터를 담아서 전달하는 역할)
// pageNum(페이지번호)과 amount(한페이지당 게시물 갯수) 값을 전달하는 Model(model을 통해서 데이터를 가져옴)
public class CriteriaVO {
	private int pageNum;	// 페이지번호
	private int amount;		// 한 페이지당 게시물 갯수
	private String keyword;	// 키워드를 통해 검색.
	private String type;	// 키워드 기준
	
	// 생성자
	public CriteriaVO() {
		this(1,7);
	}
	public CriteriaVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CriteriaVO [pageNum=" + pageNum + ", amount=" + amount + ", keyword=" + keyword + ", type=" + type
				+ "]";
	}	
}
