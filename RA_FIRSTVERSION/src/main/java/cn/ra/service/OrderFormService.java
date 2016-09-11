package cn.ra.service;

import cn.ra.pojo.Orderform;

public interface OrderFormService {
	public Orderform findOrderFormById(int orderformid);
	public void updateOrderFormInfo(Orderform orderform);
	public void deleteOrderFormById(int orderformid);
	public void insert(Orderform orderform);
}
