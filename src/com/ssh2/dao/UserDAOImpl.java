package com.ssh2.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import com.ssh2.entity.Users;

public class UserDAOImpl implements UserDAO {

	// 声明属性sessionFactory,用于接受LocalSessionFactoryBean类实例sessionFactory注入
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List search(Users condition) {
		List list = null;
		// 通过sessionFactory获得Session
		Session session = sessionFactory.getCurrentSession();
		// 开始事务
		Transaction tx = session.beginTransaction();
		try {
			// 创建Criteria对象
			Criteria c = session.createCriteria(Users.class);
			// 使用Example工具类创建示例对象
			Example example = Example.create(condition);
			// 为Criteria对象指定示例对象example作为查询条件
			c.add(example);
			list = c.list(); // 执行查询，获得结果
			tx.commit(); // 提交事务，
		} catch (Exception e) {
			tx.rollback(); // 事务回滚
		}
		return list;
	}
}
