package com.mycompany.levermannanalyse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{

    public static void main (String...args){
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Company company = new Company();
        company.setAuthor("Memorynotfound");
        company.setTitle("MySQL / Mariadb + Hibernate XML Configuration Example");

        company.setPrice(24.95);
        company.setYear(2016);

        session.save(company);
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}

