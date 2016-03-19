package com.ssh2.biz;

import com.ssh2.dao.TestDao;


public class TestBizDaoImpl implements TestBizDao{
	private TestDao testDao;
	public void setTestDao(TestDao testDao){
		this.testDao=testDao;
	}
	@Override
	public void insert(String in) {
		testDao.insert(in);
	}

	@Override
	public void delete(String delete) {
		testDao.delete(delete);
	}

	@Override
	public void update(String update) {
		testDao.delete(update);
	}

	@Override
	public void select(String select) {
		testDao.delete(select);
	}

}
