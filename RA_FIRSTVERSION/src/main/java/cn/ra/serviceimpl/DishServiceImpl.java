package cn.ra.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ra.dao.DishMapper;
import cn.ra.pojo.Dish;
import cn.ra.service.DishService;
@Service("dishService")
public class DishServiceImpl implements DishService {
	
	@Resource
	public DishMapper dishDao;

	public void findDishById(int dishid) {
		// TODO Auto-generated method stub

	}

	public void updateDishInfoById(int dishid) {
		// TODO Auto-generated method stub

	}

	public void deleteDishById(int dishid) {
		// TODO Auto-generated method stub

	}

	public void insert(Dish dish) {
		this.dishDao.insert(dish);

	}

}
