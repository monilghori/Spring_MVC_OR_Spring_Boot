package org.example;


import org.example.entities.Student;
import org.example.entities.Student_Details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

       Configuration cfg = new Configuration();
       cfg.configure();

       SessionFactory sf = cfg.buildSessionFactory();
       Session s = sf.openSession();

        try(sf) {

            s.beginTransaction();


//            Student monil = new Student();
//            monil.setName("Monil");
//            monil.setId(1);
//
//            Student_Details sd = new Student_Details();
//            sd.setPincode(394101);
//
//            monil.setStudent_details(sd);
//            s.persist(monil);



            Student_Details sd = new Student_Details();
            sd.setPincode(384101);

            Student st = new Student();
            st.setId(343);
            st.setName("Monil Ghori");
            st.setStudent_details(sd);
            
            sd.setStudent(st);
            s.persist(sd);


            s.getTransaction().commit();

        }finally {
            s.close();
            sf.close();
        }
    }
}