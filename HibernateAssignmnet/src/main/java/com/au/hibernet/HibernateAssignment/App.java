package com.au.hibernet.HibernateAssignment;

import java.util.*;
import org.hibernate.*;

public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        e.setEid(1);
        e.setName("siddharth R K");
        e.setSalary(150000);
        
        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setBrand("DELL");
        laptop.setPrice(30000);
        
        e.setLaptop(laptop);
        
        Expenses exp1 = new Expenses();
        exp1.setExid(1);
        exp1.setAmount(10000);
        

        Expenses exp2 = new Expenses();
        exp2.setExid(2);
        exp2.setAmount(2000);
        
        e.getExpenses().add(exp1);
        e.getExpenses().add(exp2);
        
        Configuration com = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Expenses.class);
        SessionFactory sf = com.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        session.save(exp1);
        session.save(exp2);
        session.save(laptop);
        session.save(e);
        tran.commit();
        session.close();
    }
}
