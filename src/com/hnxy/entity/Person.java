package com.hnxy.entity;

import java.util.Date;

public class Person {
	// ˽������
	private Integer pid; // ��Ա���
	private String pname; // ��Ա����
	private String sex; // ��Ա�Ա�
	private Date birthday; // ��������
	private Double money; // �����

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", sex=" + sex + ", birthday=" + birthday + ", money="
				+ money + "]";
	}

}
