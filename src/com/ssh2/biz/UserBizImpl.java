package com.ssh2.biz;

import java.util.List;

import com.ssh2.dao.UserDAO;
import com.ssh2.entity.Users;

public class UserBizImpl implements UserBiz {

	//ʹ��UserDAO�ӿ��������󣬲����set������������ע��
	UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public List login(Users condition) {	
		return userDAO.search(condition);
	}

}
