package com.hnxy.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.hnxy.entity.Person;

public class Test {
	public static void main(String[] args) {
		// 创建集合存储数据
		List<Person> persons = new ArrayList<Person>();

		// 测试添加，存储10个数据
		Person p = null;
		for (int i = 0; i < 10; i++) {
			p = new Person();
			p.setPid(i + 1);
			p.setPname("用户" + i);
			p.setSex("男");
			p.setMoney(1000D);
			p.setBirthday(new Date());
			// 添加
			persons.add(p);
		}

		// 遍历
		System.out.println("原始数据：");
		for (Person person : persons) {
			System.out.println(person);
		}

		// 修改，将id为3的人的姓名修改为赵文明
		for (Person person : persons) {
			if (person.getPid() == 3) {
				person.setPname("赵文明");
			}
		}
		System.out.println("修改之后的数据：");
		for (Person person : persons) {
			System.out.println(person);
		}

		// 删除，删除id为1的数据
		Iterator<Person> it = persons.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			if (person.getPid() == 1) {
				it.remove();
			}
		}
		System.out.println("删除之后的数据：");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
