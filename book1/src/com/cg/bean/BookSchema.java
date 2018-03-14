package com.cg.bean;

public class BookSchema {
	
		private int bookId;
		private String bookName;
		private double bookPrice;
		
		
		
		public BookSchema(int bookId, String bookName, double bookPrice) {
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}
		
		//@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName="
					+ bookName + ", bookPrice=" + bookPrice + "]";
		}
}
