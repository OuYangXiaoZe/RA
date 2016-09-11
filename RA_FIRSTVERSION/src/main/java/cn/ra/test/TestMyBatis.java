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


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
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
//    public void test1() {  插入用户
//    	/*
//    	 * 用户的插入语句出错insert
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
//        // logger.info("值："+user.getUserName());  
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
    
    

//    @Test  修改用户信息
//    public void test2() { 
//    	User user1=new User();
//    
//    	user1.setId(5);
//    	user1.setLoginname("欧阳泽鹏");
//    	user1.setGender(true);
//    	user1.setLoginpwd("123456789");
//    	user1.setPaypwd("123456789");
//    	user1.setTepnumber("10101010101");
//    	user1.setWallet(1234);
//        userService.updateUserInfoById(user1);
//        // System.out.println(user.getUserName());  
//        // logger.info("值："+user.getUserName());  
//        logger.info(JSON.toJSONString(user1));  
//    }  
    
    
    
//    @Test  删除一个用户
//    public void test2() { 
//    
//        userService.deleteUserById(4);
//        // System.out.println(user.getUserName());  
//        // logger.info("值："+user.getUserName());  
//       
//    }  
}  
