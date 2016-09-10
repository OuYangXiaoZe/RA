package cn.ra.serviceimpl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import cn.ra.dao.UserMapper;
import cn.ra.pojo.User;
import cn.ra.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userDao;

	public void findUserById(int userid) {
	

	}

	public void insert(User user) {
		this.userDao.insert(user);

	}

	public void updateUserInfoById(int userid) {
		// TODO Auto-generated method stub

	}

	public void deleteUserById(int userid) {
		// TODO Auto-generated method stub

	}

}
