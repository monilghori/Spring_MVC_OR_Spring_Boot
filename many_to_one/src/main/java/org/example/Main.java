package org.example;

import org.example.entities.Collages;
import org.example.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        try(sf){

            s.beginTransaction();

            Collages ddu = new Collages();
            ddu.setName("DDU");

            Collages scat = new Collages();
            scat.setName("SCAT");

            Student monil = new Student();
            monil.setName("Monil Ghori");
            monil.setCollage(ddu);

            Student preet = new Student();
            preet.setName("Preet Vaghani");
            preet.setCollage(scat);

            Student priyansh = new Student();
            priyansh.setName("Priyansh Dobariya");
            priyansh.setCollage(ddu);

            List<Student> ddustudents = new ArrayList<>();
            ddustudents.add(monil);
            ddustudents.add(priyansh);

            List<Student> scatstudents = new ArrayList<>();
            scatstudents.add(preet);

            ddu.setStudent(ddustudents);
            scat.setStudent(scatstudents);

            s.persist(ddu);
            s.persist(scat);
//            s.persist(monil);
//            s.persist(preet);
//            s.persist(priyansh);

            s.getTransaction().commit();
        }finally {
            s.close();
            sf.close();
        }

    }
}