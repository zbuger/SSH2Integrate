package com.ssh2.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2.biz.UserBiz;
import com.ssh2.entity.Users;

public class UserManagerAction extends ActionSupport {
	private String loginName;
	private String loginPwd;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	UserBiz userBiz;

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public String login() throws Exception {
		Users condition = new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		List list = userBiz.login(condition);
		if (list.size() > 0) {
			return "success";
		} else {
			return "error";
		}
	}

}
