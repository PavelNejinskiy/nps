package MyDB;

import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {

        Students student = new Students();
       // person.setID(1);
//        student.setName("DORISS");
//        student.setLastName("BORISSSS");



        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

       // System.out.println(student.getLastName() + " " + student.getName());
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done");
    }
}
