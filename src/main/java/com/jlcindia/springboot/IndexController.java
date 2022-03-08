package com.jlcindia.springboot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	@GetMapping("/test")
	public List<BookInfo> showIndexPage() {
		System.out.println("---------showIndexPage 6---------");

		List<BookInfo> blist = new ArrayList<>();

		BookInfo bookInfo = new BookInfo();
		bookInfo.setAuthor("Ravi");
		bookInfo.setBid(102);
		bookInfo.setBname("java");
		bookInfo.setPrice(new BigDecimal(600));
		bookInfo.setPub("test");

		// model.addAttribute("MyBooksList", blist);
		blist.add(bookInfo);
		return blist;
	}
}
