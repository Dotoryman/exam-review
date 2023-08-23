package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {

	// ��ü��ȸ
	public List<BookVO> selectBookList();
	
	// ��Ͽ����� ������ȣ
	public int getBookNo();
	
	// ���
	public int insertBookInfo(BookVO bookVO);
}
