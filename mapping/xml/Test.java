package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
        Person person = new Person(23,"Ram","Delhi", "52524");
        Person person1 = new Person(22,"Ravi","Pune", "52525");
        Person person2 = new Person(21,"Raj","Mumbai", "52526");
        Person person3 = new Person(25,"Rahul","Nashik", "52527");
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(person);
        session.save(person1);
        session.save(person2);
        session.save(person3);
        tx.commit();
        session.close();
        factory.close();
    }
}
