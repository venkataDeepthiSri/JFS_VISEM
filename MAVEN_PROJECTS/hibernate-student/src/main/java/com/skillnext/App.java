package com.skillnext;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student stu = new Student(
                "Aneesha",
                 6,
                "ECE"
        );

        session.persist(stu);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}