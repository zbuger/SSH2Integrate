package com.ssh2.dao;

public class TestDaoImpl implements TestDao{

	@Override
	public void insert(String in) {
		System.out.println("here insert:"+in);
	}

	@Override
	public void delete(String delete) {
		System.out.println("delet:"+delete);
	}

	@Override
	public void update(String update) {
		System.out.println("update:"+update);
	}

	@Override
	public void select(String select) {
		System.out.println("select:"+select);
	}

}
