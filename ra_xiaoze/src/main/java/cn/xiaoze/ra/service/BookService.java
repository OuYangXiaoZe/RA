package cn.xiaoze.ra.service;

import cn.xiaoze.ra.pojo.Book;

public interface BookService {
	public void findBookById(int bookid);
	public void insert(Book book);
	public void updateBookInfoById(int bookid,Book book);
	public void deleteBookById(int bookid);
}
