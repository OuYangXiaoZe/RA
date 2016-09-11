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

	public Dish findDishById(int dishid) {
		return this.dishDao.selectByPrimaryKey(dishid);

	}

    public void updateDishInfo(Dish dish) {
		 this.dishDao.updateByPrimaryKey(dish);
 
	}
	public void updateDishInfoById(int dishid) {
		

	}

	public void deleteDishById(int dishid) {
		this.dishDao.deleteByPrimaryKey(dishid);

	}

	public void insert(Dish dish) {
		this.dishDao.insert(dish);

	}

}
