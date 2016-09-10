package cn.ra.service;

import cn.ra.pojo.Orderform;

public interface OrderFormService {
	public void findOrderFormById(int orderformid);
	
	public void deleteOrderFormById(int orderformid);
	public void insert(Orderform orderform);
}
