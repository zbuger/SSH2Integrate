package com.ssh2.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import com.ssh2.entity.Users;

public class UserDAOImpl implements UserDAO {

	// ��������sessionFactory,���ڽ���LocalSessionFactoryBean��ʵ��sessionFactoryע��
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List search(Users condition) {
		List list = null;
		// ͨ��sessionFactory���Session
		Session session = sessionFactory.getCurrentSession();
		// ��ʼ����
		Transaction tx = session.beginTransaction();
		try {
			// ����Criteria����
			Criteria c = session.createCriteria(Users.class);
			// ʹ��Example�����ഴ��ʾ������
			Example example = Example.create(condition);
			// ΪCriteria����ָ��ʾ������example��Ϊ��ѯ����
			c.add(example);
			list = c.list(); // ִ�в�ѯ����ý��
			tx.commit(); // �ύ����
		} catch (Exception e) {
			tx.rollback(); // ����ع�
		}
		return list;
	}
}
