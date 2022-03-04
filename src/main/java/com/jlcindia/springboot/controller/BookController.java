package com.jlcindia.springboot.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("MyBooksList")
public class BookController {

	@GetMapping("/showAllBooks")
	public String showBooksList(Model model) {
		System.out.println("-------BookController--showBooksList()---------");
		List<BookInfo> blist = new ArrayList<>();

		BookInfo bookInfo = new BookInfo();
		bookInfo.setAuthor("Ravi");
		bookInfo.setBid(102);
		bookInfo.setBname("java");
		bookInfo.setPrice(new BigDecimal(600));
		bookInfo.setPub("test");

		// model.addAttribute("MyBooksList", blist);
		blist.add(bookInfo);
		model.addAttribute("MyBooksList", blist);
		return "booksList";
	}

}