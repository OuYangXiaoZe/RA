package cn.ra.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Book;
import cn.ra.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class BookTest {
	@Resource  
    private BookService bookService = null; 
//	/*
//	 * 增加一本书
//	 */
//	@Test 
//   public void test1() { 
//		Book book=new Book();
//		book.setBookname("傲慢与偏见");
//		book.setBooktype("文学类");
//		book.setWriter("凡尔纳");
//		book.setId(3);
//		this.bookService.insert(book);
//		
//   }  
//	/*
//	 * 删除一本书
//	 */
//	@Test 
//   public void test2() { 
//		
//		this.bookService.deleteBookById(2);
//		
//   }  
	
	
//	/*
//	 * 更新一本书的信息
//	 */
//	@Test 
//  public void test3() { 
//		Book book=new Book();
//		book.setId(3);
//		book.setWriter("简·奥斯汀");
//		book.setBooktype("文学类");
//		book.setBookname("傲慢与偏见");
//	this.bookService.updateBookInfo(book);
//		
//  }  
	
	
//	/*
//	 * 更新一本书的局部信息
//	 */
//	@Test 
//  public void test4() { 
//		Book book=new Book();
//		book.setId(3);
//		book.setWriter("简·奥斯汀");
//		book.setBooktype("文学类");
//		
//	this.bookService.updateBookInfoSelective(book);
//		
//  }  
	
//	/*
//	 * 查找一本书的信息
//	 */
//	@Test 
// public void test5() { 
//	Book book=this.bookService.findBookById(3);
//	System.out.println(book.getBookname());
//	System.out.println(book.getBooktype());
//	System.out.println(book.getWriter());
//	System.out.println(book.getId());
//		
// }  
	
	

}
