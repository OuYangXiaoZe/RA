package cn.ra.service;

import cn.ra.pojo.User;

public interface UserService {
	public void findUserById(int userid);
	public void insert(User user);
	public void updateUserInfoById(int userid);
	public void deleteUserById(int userid);
}
