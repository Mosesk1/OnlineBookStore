package com.moses.Models;

import java.time.LocalDate;

public class Book {

	private int ISBN;
	private String title;
	private String authors;
	private LocalDate publicationYear;
	private String category;
	private Double purchasingPrice;
	private Double sellingPrice;
	private LocalDate recordindDate;
	
	
	


	public Book(int iSBN, String title, String authors, LocalDate publicationYear, String category,
			Double purchasingPrice, Double sellingPrice, LocalDate recordindDate) {
		super();
		this.ISBN = iSBN;
		this.title = title;
		this.authors = authors;
		this.publicationYear = publicationYear;
		this.category = category;
		this.purchasingPrice = purchasingPrice;
		this.sellingPrice = sellingPrice;
		this.recordindDate = recordindDate;
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public LocalDate getPublicationYear() {
		return publicationYear;
	}


	public void setPublicationYear(LocalDate publicationYear) {
		this.publicationYear = publicationYear;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Double getPurchasingPrice() {
		return purchasingPrice;
	}


	public void setPurchasingPrice(Double purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}


	public Double getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public LocalDate getRecordindDate() {
		return recordindDate;
	}


	public void setRecordindDate(LocalDate recordindDate) {
		this.recordindDate = recordindDate;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", publicationYear=" + publicationYear + ", category="
				+ category + ", purchasingPrice=" + purchasingPrice + ", sellingPrice=" + sellingPrice
				+ ", recordindDate=" + recordindDate + "]";
	}
	
	
}
