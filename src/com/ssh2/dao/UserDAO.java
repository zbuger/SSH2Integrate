package com.ssh2.dao;

import java.util.List;

import com.ssh2.entity.Users;

public interface UserDAO {
	public List search(Users condition);
}
