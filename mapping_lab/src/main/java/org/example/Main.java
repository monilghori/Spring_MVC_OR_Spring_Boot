package org.example;

import org.example.entities.Aadhar;
import org.example.entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration cf = new org.hibernate.cfg.Configuration();
        cf.configure();

        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();

        try(s)
        {
            s.beginTransaction();

            Person monil = new Person();
            monil.setName("Monil Ghori");

            Aadhar a1 = new Aadhar();
            a1.setAadhar_no(652467);
            a1.setPhone_no(264728724);
            a1.setPerson(monil);

            monil.setAadhar(a1);


            Person p = new Person();
            p.setName("Sahil");

            Aadhar a2 = new Aadhar();
            a2.setAadhar_no(652457);
            a2.setPhone_no(964728764);
            a2.setPerson(p);

            p.setAadhar(a2);




            s.persist(monil);
            s.persist(p);
            s.getTransaction().commit();

        }

    }
}