package com.firstcache;

import org.example.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //by default enabled

        Employee employee = session.get(Employee.class,1212);
        System.out.println(employee);
        System.out.println("working something...");
       Employee employee1 = session.get(Employee.class,1212);
        System.out.println(employee1 );
        System.out.println(session.contains(employee1));


        session.close();

    }
}
