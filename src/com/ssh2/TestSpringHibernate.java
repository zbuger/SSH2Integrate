package com.ssh2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh2.biz.UserBiz;
import com.ssh2.entity.Users;

public class TestSpringHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取配置中的实例
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");
		Users conditon=new Users();
		conditon.setLoginName("admin");
		conditon.setLoginPwd("123456");
		List list=userBiz.login(conditon);
		if(list.size()>0){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}	
	}

}
