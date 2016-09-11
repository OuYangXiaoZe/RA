package cn.ra.service;

import cn.ra.pojo.Book;

public interface BookService {
	public Book findBookById(int bookid);
	public void insert(Book book);
	public void updateBookInfoById(int bookid);
	public void updateBookInfo(Book book);
	public void deleteBookById(int bookid);
	public void updateBookInfoSelective(Book book);
}
