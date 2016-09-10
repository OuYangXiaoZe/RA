package cn.ra.dao;

import cn.ra.pojo.Orderform;

public interface OrderformMapper {
    int deleteByPrimaryKey(Integer orderformid);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    Orderform selectByPrimaryKey(Integer orderformid);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}