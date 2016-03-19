package com.ssh2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh2.biz.TestBizDao;

public class TestActionDao extends ActionSupport {

	private static final long serialVersionUID = -3538636639456146074L;
	private TestBizDao testBizDao;

	private String inString;
	private String delete;
	private String update;
	private String select;


	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public void setTestBizDao(TestBizDao testBizDao) {
		this.testBizDao = testBizDao;
	}

	public String insert() {
		testBizDao.insert(inString);
		return SUCCESS;
	}

	public String delete() {
		testBizDao.delete(delete);
		return SUCCESS;
	}

	public String update() {
		testBizDao.update(update);
		return SUCCESS;
	}

	public String select() {
		testBizDao.select(select);
		return SUCCESS;
	}

	public String getInString() {
		return inString;
	}

	public void setInString(String inString) {
		this.inString = inString;
	}
}
