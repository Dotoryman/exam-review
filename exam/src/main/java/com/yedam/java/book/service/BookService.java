package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	// ������ü��ȸ
	public List<BookVO> getBookList();
	// ��Ͽ�����ȣ ��ȸ
	public int getBookNo();
	// �����������
	public int insertBook(BookVO bookVO);
	// �뿩��Ȳ��ȸ
	public List<RentVO> getRentInfo();
}
