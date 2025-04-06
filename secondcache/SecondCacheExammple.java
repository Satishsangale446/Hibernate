package com.secondcache;


import org.example.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondCacheExammple {
    public static void main(String[] args) {


        SessionFactory factory =new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
       Session session1 = factory.openSession();
       //first
        Employee employee1 =session1.get(Employee.class,1212);
        System.out.println(employee1);
       session1.close();

       Session session2 = factory.openSession();
       //second
        Employee employee2 =session2.get(Employee.class,1212);
        System.out.println(employee2);
        session2.close();
    }
}
