package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	// �޼ҵ� 4�� �����
	
	// �������� ��� - ������
	@GetMapping("bookInsert")
	public String bookInsertForm(Model model) {
		int bno = bookService.getBookNo();
		model.addAttribute("bno", bno);
		return "book/insert";
	}
	
	// �������� ��� - ó��
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		bookService.insertBook(bookVO);
		return "redirect:bookList";
	}
	
	// ���������ȸ
	@GetMapping("bookList")
	public String bookList(Model model) {
		model.addAttribute("bookList", bookService.getBookList());
		return "book/list";
	}
	// �뿩��Ȳ��ȸ
	

}
