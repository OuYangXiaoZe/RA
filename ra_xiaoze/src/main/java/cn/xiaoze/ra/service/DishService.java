package cn.xiaoze.ra.service;

import cn.xiaoze.ra.pojo.Dish;

public interface DishService {
	public void findDishById(int dishid);
	public void updateDishInfoById(int dishid,Dish dish);
	public void deleteDishById(int dishid);
	public void insert(Dish dish);
}
