package com.Criteria;

import com.mapping.xml.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaExample {
    public static void main(String[] args) {
        Session s = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory().openSession();

        Criteria c= s.createCriteria(Person.class);

        c.add(Restrictions.eq("Person.person_address", "Pune"));

        List<Person> personList =c.list();

        for (Person st:personList){
            System.out.println(st);
        }
        s.close();
    }
}
