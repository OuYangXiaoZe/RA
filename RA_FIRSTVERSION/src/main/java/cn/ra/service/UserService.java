package cn.ra.service;

import cn.ra.pojo.User;

public interface UserService {
	public User findUserById(int userid);
	public void insert(User user);
	public void updateUserInfoById(User user);
	public void deleteUserById(int userid);
	
}
