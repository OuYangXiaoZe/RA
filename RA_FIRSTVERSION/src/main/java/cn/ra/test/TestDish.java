package cn.ra.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Dish;
import cn.ra.service.DishService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestDish {
	@Resource  
    private DishService dishService = null; 
	
//	/*
//	 * ����һ����
//	 */
//	@Test 
//  public void test1() { 
//		Dish dish=new Dish();
//    	dish.setDishname("��������");
//    	dish.setDishprice(13);
//    	dish.setDishtype(3);
//    	dish.setId(9);
//    	this.dishService.insert(dish);
//  }  
//	/*
//	 * ɾ��һ����
//	 */
//	@Test 
//  public void test2() { 
//    this.dishService.deleteDishById(7);
//  }  
	
	
	/*
	 * ����һ���˵�����
	 */
//	@Test 
//  public void test3() { 
//    Dish dish=new Dish();
//    dish.setId(8);
//    dish.setDishname("��������");
//    dish.setDishprice(123);
//    dish.setDishtype(3);
//    this.dishService.updateDishInfo(dish);
//  }  
	
	
//	/*
//	 * ����һ���˵�����
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
