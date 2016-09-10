package cn.ra.service;

import cn.ra.pojo.Book;

public interface BookService {
	public void findBookById(int bookid);
	public void insert(Book book);
	public void updateBookInfoById(int bookid);
	public void deleteBookById(int bookid);
}
