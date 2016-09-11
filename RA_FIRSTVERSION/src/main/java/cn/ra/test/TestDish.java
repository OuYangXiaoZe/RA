package cn.ra.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Dish;
import cn.ra.service.DishService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestDish {
	@Resource  
    private DishService dishService = null; 
	
//	/*
//	 * 增加一个菜
//	 */
//	@Test 
//  public void test1() { 
//		Dish dish=new Dish();
//    	dish.setDishname("宫保鸡丁");
//    	dish.setDishprice(13);
//    	dish.setDishtype(3);
//    	dish.setId(9);
//    	this.dishService.insert(dish);
//  }  
//	/*
//	 * 删除一个菜
//	 */
//	@Test 
//  public void test2() { 
//    this.dishService.deleteDishById(7);
//  }  
	
	
	/*
	 * 更新一个菜的内容
	 */
//	@Test 
//  public void test3() { 
//    Dish dish=new Dish();
//    dish.setId(8);
//    dish.setDishname("金玉满堂");
//    dish.setDishprice(123);
//    dish.setDishtype(3);
//    this.dishService.updateDishInfo(dish);
//  }  
	
	
//	/*
//	 * 查找一个菜的内容
//	 */
//	@Test 
//  public void test4() { 
//   Dish dish= this.dishService.findDishById(8);
//   System.out.println(dish.getDishname());
//   System.out.println(dish.getDishprice());
//   System.out.println(dish.getDishtype());
//   System.out.println(dish.getId());
//  }  
	

}
