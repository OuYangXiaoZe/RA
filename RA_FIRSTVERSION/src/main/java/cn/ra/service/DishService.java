package cn.ra.service;

import cn.ra.pojo.Dish;

public interface DishService {
	public void findDishById(int dishid);
	public void updateDishInfoById(int dishid);
	public void deleteDishById(int dishid);
	public void insert(Dish dish);
}
