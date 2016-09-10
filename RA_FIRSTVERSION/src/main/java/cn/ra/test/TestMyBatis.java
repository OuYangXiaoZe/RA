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
  
    @Test  
    public void test1() {  
    	/*
    	 * 用户的插入语句出错insert
    	 * 
    	 */
         userService.findUserById(1); 
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
//        logger.info(JSON.toJSONString(user));  
    }  
//    @Test  
//    public void test2() {  
//    	Dish dish=new Dish();
//    	dish.setDishname("123456");
//    	dish.setDishprice(123);
//    	dish.setDishtype(2);
//    	dish.setId(1);
//    	this.dishService.insert(dish);
//    	
//    }

//    @Test  
//    public void test2() { 
//    	User user1=new User();
//    	user1.setAge(20);
//    	user1.setId(2);
//    	user1.setPassword("123456789");
//    	user1.setUserName("小泽");
//        User user = userService.insertUser(user1);
//        // System.out.println(user.getUserName());  
//        // logger.info("值："+user.getUserName());  
//        logger.info(JSON.toJSONString(user));  
//    }  
}  
