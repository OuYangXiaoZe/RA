package cn.ra.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Book;
import cn.ra.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class BookTest {
	@Resource  
    private BookService bookService = null; 
//	/*
//	 * ����һ����
//	 */
//	@Test 
//   public void test1() { 
//		Book book=new Book();
//		book.setBookname("������ƫ��");
//		book.setBooktype("��ѧ��");
//		book.setWriter("������");
//		book.setId(3);
//		this.bookService.insert(book);
//		
//   }  
//	/*
//	 * ɾ��һ����
//	 */
//	@Test 
//   public void test2() { 
//		
//		this.bookService.deleteBookById(2);
//		
//   }  
	
	
//	/*
//	 * ����һ�������Ϣ
//	 */
//	@Test 
//  public void test3() { 
//		Book book=new Book();
//		book.setId(3);
//		book.setWriter("�򡤰�˹͡");
//		book.setBooktype("��ѧ��");
//		book.setBookname("������ƫ��");
//	this.bookService.updateBookInfo(book);
//		
//  }  
	
	
//	/*
//	 * ����һ����ľֲ���Ϣ
//	 */
//	@Test 
//  public void test4() { 
//		Book book=new Book();
//		book.setId(3);
//		book.setWriter("�򡤰�˹͡");
//		book.setBooktype("��ѧ��");
//		
//	this.bookService.updateBookInfoSelective(book);
//		
//  }  
	
//	/*
//	 * ����һ�������Ϣ
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
