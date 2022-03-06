package com.jlcindia.springboot;

import java.math.BigDecimal;

public class BookInfo {
	private Integer bid;

	private String bname;

	private String author;

	private BigDecimal price;

	private String category;

	private String pub;

	public BookInfo() {
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return "BookInfo [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + ", category="
				+ category + ", pub=" + pub + "]";
	}
	
	

	
}
