package cn.ra.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ra.dao.BookMapper;
import cn.ra.pojo.Book;
import cn.ra.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Resource
	public BookMapper bookDao;
	
	public Book findBookById(int bookid) {
	   
     return this.bookDao.selectByPrimaryKey(bookid);
	}

	public void insert(Book book) {
	  this.bookDao.insert(book);
	}

	public void updateBookInfoById(Book book) {
		

	}

	public void deleteBookById(int bookid) {
		this.bookDao.deleteByPrimaryKey(bookid);

	}

	public void updateBookInfoById(int bookid) {
		// TODO Auto-generated method stub
		
	}

	public void updateBookInfo(Book book) {
		this.bookDao.updateByPrimaryKey(book);
		
	}

	public void updateBookInfoSelective(Book book) {
		this.bookDao.updateByPrimaryKeySelective(book);
	}

}
