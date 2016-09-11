package cn.ra.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ra.dao.OrderformMapper;
import cn.ra.pojo.Orderform;
import cn.ra.service.OrderFormService;
@Service("orderformService")
public class OrderFormImpl implements OrderFormService {

	@Resource
	public OrderformMapper orderformdao;
	public Orderform findOrderFormById(int orderformid) {
		return this.orderformdao.selectByPrimaryKey(orderformid);

	}

	public void deleteOrderFormById(int orderformid) {
    this.orderformdao.deleteByPrimaryKey(orderformid);

	}

	public void insert(Orderform orderform) {
	this.orderformdao.insert(orderform);

	}

	public void updateOrderFormInfo(Orderform orderform) {
		this.orderformdao.updateByPrimaryKeySelective(orderform);
		
	}

}
