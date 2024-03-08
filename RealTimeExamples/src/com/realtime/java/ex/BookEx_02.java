package com.realtime.java.ex;

public class BookEx_02 
{
   private int bookid;
   private int bookprice;
   private String bookname;
   private String bookauthor;
private BookEx_02(int bookid, int bokprice, String bookname, String bookauthor) {
	super();
	this.bookid = bookid;
	this.bookprice = bokprice;
	this.bookname = bookname;
	this.bookauthor = bookauthor;
}
@Override
public String toString() {
	return "BookEx_02 [bookid=" + bookid + ", bookprice=" + bookprice + ", bookname=" + bookname + ", bookauthor="
			+ bookauthor + "]";
}
}
