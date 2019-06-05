package com.hnxy.entity;

import java.util.Date;

public class Person {
	// 私有属性
	private Integer pid; // 人员编号
	private String pname; // 人员姓名
	private String sex; // 人员性别
	private Date birthday; // 出生日期
	private Double money; // 存款金额

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
