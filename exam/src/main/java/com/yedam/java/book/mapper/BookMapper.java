package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {

	// 전체조회
	public List<BookVO> selectBookList();
	
	// 등록예정인 도서번호
	public int getBookNo();
	
	// 등록
	public int insertBookInfo(BookVO bookVO);
}
