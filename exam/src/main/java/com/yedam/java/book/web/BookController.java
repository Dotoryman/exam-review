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
	// 메소드 4개 만들기
	
	// 도서정보 등록 - 페이지
	@GetMapping("bookInsert")
	public String bookInsertForm(Model model) {
		int bno = bookService.getBookNo();
		model.addAttribute("bno", bno);
		return "book/insert";
	}
	
	// 도서정보 등록 - 처리
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		bookService.insertBook(bookVO);
		return "redirect:bookList";
	}
	
	// 도서목록조회
	@GetMapping("bookList")
	public String bookList(Model model) {
		model.addAttribute("bookList", bookService.getBookList());
		return "book/list";
	}
	// 대여현황조회
	@GetMapping("rentList")
	public String rentList(Model model) {
		model.addAttribute("rentList", bookService.getRentInfo());
		return"book/rentInfo";
	}

}
