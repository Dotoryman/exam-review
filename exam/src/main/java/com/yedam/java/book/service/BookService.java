package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	// 도서전체조회
	public List<BookVO> getBookList();
	// 등록예정번호 조회
	public int getBookNo();
	// 도서정보등록
	public int insertBook(BookVO bookVO);
	// 대여현황조회
}
