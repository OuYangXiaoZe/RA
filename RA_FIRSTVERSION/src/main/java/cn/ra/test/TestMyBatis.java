package cn.ra.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.ra.pojo.Dish;
import cn.ra.pojo.User;
import cn.ra.service.DishService;
import cn.ra.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private UserService userService = null;  
    @Resource  
    private DishService dishService = null; 
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    
    
//    @Test  
//    public void test1() {  �����û�
//    	/*
//    	 * �û��Ĳ���������insert
//    	 * 
//    	 */
//         User user=userService.findUserById(1); 
//        System.out.println(user.getLoginname());
//        System.out.println(user.getId());
//        System.out.println(user.getPaypwd());
//        System.out.println(user.getGender());
//        System.out.println(user.getTepnumber());
//        System.out.println(user.getWallet());
//         
//        // System.out.println(user.getUserName());  
//        // logger.info("ֵ��"+user.getUserName());  
////        logger.info(JSON.toJSONString(user));  
//    }  
    
    
    
//    @Test  
//    public void test2() {  
//    	Dish dish=new Dish();
//    	dish.setDishname("123456");
//    	dish.setDishprice(123);
//    	dish.setDishtype(2);
//    	dish.setId(7);
//    	this.dishService.insert(dish);
//    	
//    }
    
    

//    @Test  �޸��û���Ϣ
//    public void test2() { 
//    	User user1=new User();
//    
//    	user1.setId(5);
//    	user1.setLoginname("ŷ������");
//    	user1.setGender(true);
//    	user1.setLoginpwd("123456789");
//    	user1.setPaypwd("123456789");
//    	user1.setTepnumber("10101010101");
//    	user1.setWallet(1234);
//        userService.updateUserInfoById(user1);
//        // System.out.println(user.getUserName());  
//        // logger.info("ֵ��"+user.getUserName());  
//        logger.info(JSON.toJSONString(user1));  
//    }  
    
    
    
//    @Test  ɾ��һ���û�
//    public void test2() { 
//    
//        userService.deleteUserById(4);
//        // System.out.println(user.getUserName());  
//        // logger.info("ֵ��"+user.getUserName());  
//       
//    }  
}  
