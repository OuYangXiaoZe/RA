package cn.xiaoze.ra.service;

import cn.xiaoze.ra.pojo.User;

public interface UserService {
	public void findUserById(int userid);
	public void insert(int userid,User user);
	public void updateUserInfoById(int userid);
	public void deleteUserById(int userid);
}
