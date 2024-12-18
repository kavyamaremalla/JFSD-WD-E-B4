package com.hibernate;

import com.hibernate.models.Orders;
import com.hibernate.models.Persons;
import com.hibernate.models.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateDemo {

    public static void main(String[] args) {


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class)
                .addAnnotatedClass(Persons.class)
                .addAnnotatedClass(Orders.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession(); //like opening connection

        Transaction transaction = session.beginTransaction(); // your prepared statement

//        Students student = session.get(Students.class, 3);

//        System.out.println(student);

        Persons persons = session.get(Persons.class, 2);

        Orders orders = session.get(Orders.class, 1);
        System.out.println("Order Id 1 details " + orders);

        System.out.println("Person Details " + persons);
        transaction.commit();

        persons.getOrders().forEach(order -> {
            System.out.println("Order Id " + order.getOrderId());
            System.out.println("Order Number " + order.getOrderNumber());
            System.out.println("Order Details " + order.getOrderDetails());
            System.out.println("Person Id " + order.getPersonId());
        });


    }
}
