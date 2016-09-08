package cn.xiaoze.ra.service;

import cn.xiaoze.ra.pojo.OrderForm;

public interface OrderFormService {
	public void findOrderFormById(int orderformid);
	public void deleteOrderFormById(int orderformid,OrderForm orderform);
	public void updateOrderFormInfoById(int orderformid);
	public void insert(OrderForm orderform);
}
