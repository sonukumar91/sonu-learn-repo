package com.sonu.MainClass;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sonu.entity.Student;

public class SImpleMappingApp {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg = cfg.configure(new File("hibernate.cfg.xml"));

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			Student stu = new Student();
			stu.setName("SOnu Mahto");
			stu.setStream("PCM");

			session.save(stu);
			System.out.println("Data inserted");

			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}
