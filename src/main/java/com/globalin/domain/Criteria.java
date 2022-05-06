package com.globalin.domain;

public class Criteria {
	private int pageNum;
	private int amount;

	// 검색 타입 : 제목, 작성자, 내용
	// 타입이 여러 개일 경우 처리가 필요
	// 제목 : T, 내용 : C , 제목+내용 : TC 전부포함 TWC
	// 복합 조건일 때를 대비해서 문자열을 쪼갠 다음 배열로 리턴해준다.
	private String type;
	private String keyword;

	public Criteria() {
		this.pageNum = 1;
		this.amount = 10;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", type=" + type + ", keyword=" + keyword + "]";
	}

	// type 을 쪼개서 문자열 배열로 만들어서 리턴 해주는 메소드
	// type = "TWC"
	// String[] typeArr = {"T", "W", "C"}
	public String[] getTypeArr() {
		String[] result = {};
		if (type == null) {
			// type이 널이면 검색 조건이 없는 것
			// 빈 배열 return
		} else {
			result = type.split("");
		}
		return result;
		// return type == null ? new String[] {} : type.split("");
	}
}
