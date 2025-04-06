package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

//        // Creating question
//        Question q1 = new Question();
//        q1.setQuestionId(1212);
//        q1.setQuestion("what is java ?");
//
//        //Creating answer
//        Answer answer = new Answer();
//        answer.setAnswerId(343);
//        answer.setAnswer("Java is programming language");
//        answer.setQuestion(q1);
//
//        Answer answer1 = new Answer();
//        answer1.setAnswerId(33);
//        answer1.setAnswer("with the help of java we can create softwares");
//        answer1.setQuestion(q1);
//
//        Answer answer2 = new Answer();
//        answer2.setAnswerId(363);
//        answer2.setAnswer("java has different type of frameworks.");
//        answer2.setQuestion(q1);
//
//        List<Answer> list = new ArrayList<Answer>();
//        list.add(answer);
//        list.add(answer1);
//        list.add(answer2);
//        q1.setAnswers(list);

        /// Session
        Session s = factory.openSession();

        Transaction tx = s.beginTransaction();

//        // Save
//       s.save(q1);
//        s.save(answer);
//        s.save(answer1);
//       s.save(answer2);
        //fetching......
        Question q  = s.get(Question.class,1212);
        System.out.println(q.getQuestionId());
        System.out.println(q.getQuestion());

        System.out.println(q.getAnswers().size());

        tx.commit();



//        System.out.println(q.);
////System.out.println(q.getQuestion());

//
//        Question newq =(Question)s.load(Question.class,344);
//        System.out.println(newq.getQuestion());
//        //System.out.println(newq.getAnswer().getAnswer());

        s.close();
        factory.close();

    }
}
