package com.hnxy.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.hnxy.entity.Person;

public class Test {
	public static void main(String[] args) {
		// �������ϴ洢����
		List<Person> persons = new ArrayList<Person>();

		// ������ӣ��洢10������
		Person p = null;
		for (int i = 0; i < 10; i++) {
			p = new Person();
			p.setPid(i + 1);
			p.setPname("�û�" + i);
			p.setSex("��");
			p.setMoney(1000D);
			p.setBirthday(new Date());
			// ���
			persons.add(p);
		}

		// ����
		System.out.println("ԭʼ���ݣ�");
		for (Person person : persons) {
			System.out.println(person);
		}

		// �޸ģ���idΪ3���˵������޸�Ϊ������
		for (Person person : persons) {
			if (person.getPid() == 3) {
				person.setPname("������");
			}
		}
		System.out.println("�޸�֮������ݣ�");
		for (Person person : persons) {
			System.out.println(person);
		}

		// ɾ����ɾ��idΪ1������
		Iterator<Person> it = persons.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			if (person.getPid() == 1) {
				it.remove();
			}
		}
		System.out.println("ɾ��֮������ݣ�");
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
