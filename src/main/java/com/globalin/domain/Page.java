package com.globalin.domain;

public class Page {
	private int startPage;
	private int endPage;
	// 다음 페이지가 있는지 : next
	// 이전 페이지가 있는지 : prev
	private boolean prev, next;

	// 총 개수
	private int total;

	// 페이지 기준
	private Criteria cri;

	public Page(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;

		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;

		this.startPage = this.endPage - 9;

		int realend = (int) (Math.ceil((total * 1.0) / cri.getAmount()));

		if (realend < this.endPage) {
			this.endPage = realend;
		}

		// 이전 페이지 존재?
		this.prev = this.startPage > 1;
		// 다음 페이지 존재?
		this.next = this.endPage < realend;
		// 이렇게 만든 page 객체를 jsp 페이지에 전달해서 사용
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		return "Page [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", cri=" + cri + "]";
	}

}
