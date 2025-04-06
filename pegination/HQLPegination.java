package com.pegination;

import org.example.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLPegination {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session s = factory.openSession();
     Query query= s.createQuery("from Student");

     // implementing pegination using hibernate
        query.setFirstResult(0);
        query.setMaxResults(5);
       List<Employee> list= query.list();

       for (Employee st : list){
           System.out.println(st.getId() +" : "+st.getName() +" : " +st.getCity());
       }

       s.close();
        factory.close();
    }
}
