package cn.ra.test;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Orderform;
import cn.ra.service.OrderFormService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class OrderFormTest {
    
	@Resource 
	private OrderFormService orderFormService = null;
///*
// * ����һ��������Ϣ
// */
//  @Test  
//  public void test2() {  
//	Orderform orderform=new Orderform();
//	//��ȡ��ǰ��ʱ��
//	Date date=new Date();
//	  DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	  String time=format.format(date);
//	orderform.setCreatedate(date);
//	orderform.setDishnumber(2);
//	orderform.setMerchantid(2);
//	orderform.setTableno(9);
//	orderform.setTotalamount(25);
//	orderform.setTotalmoney(1542);
//	orderform.setFinishdate(date);
//	this.orderFormService.insert(orderform);
//	 
//  	
//  }
	
	
//  
//  /*
//   * ɾ��һ��������Ϣ
//   */
//    @Test  
//    public void test3() {  
//  	this.orderFormService.deleteOrderFormById(2);
//  	 
//    	
//    }
	
	
//	  /*
//	   * ����һ��������Ϣ
//	   */
//	    @Test  
//	    public void test3() {  
//	    Orderform orderform=new Orderform();
//	    orderform.setCreatedate(new Date());
//	    orderform.setFinishdate(new Date(0));
//	    orderform.setMerchantid(6);
//	    orderform.setTableno(10);
//	    orderform.setTotalamount(123456);
//	    orderform.setOrderformid(1);
//	    
//	   
//	  	this.orderFormService.updateOrderFormInfo(orderform);
//	  	 
//	    	
//	    }
	
	 /*
	   * ����һ��������Ϣ
	   */
	    @Test  
	    public void test3() {  
	   Orderform orderform= this.orderFormService.findOrderFormById(1);
	   System.out.println(orderform.getCreatedate()); 
	   System.out.println(orderform.getDishnumber()); 
	   System.out.println(orderform.getFinishdate()); 
	   System.out.println(orderform.getTableno()); 
	   System.out.println(orderform.getMerchantid()); 
	    	
	    }
  
}
