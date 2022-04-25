package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import POJOS.Alumnos;
import POJOS.HibernateUtil;

public class Hibernate {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.sessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Query q = s.createQuery("from Alumnos");
        List<Alumnos> lista = q.list();
        Alumnos al;
        
    //SELECT
        for (int i = 0; i < lista.size(); ++i) System.out.println(lista.get(i).toString());
        
    //INSERT
        al=(Alumnos)s.get(Alumnos.class, 500);
        if (al==null) {
            System.out.println("Alumno inexistente, se va a dar de alta");
            al = new Alumnos(500, "IlloJuan", 40);
            s.save(al);
        }else{
            System.out.println("Alumno existente");
        }
        lista = q.list();
        for (int i = 0; i < lista.size(); ++i) System.out.println(lista.get(i).toString());

    //DELETE
        System.out.println("VOY A BORRAR EL 400");
        al=(Alumnos)s.get(Alumnos.class, 400);
        if (al==null) {
            System.out.println("IMBORRABLE");
        }else{
            s.delete(al);
        }
        lista = q.list();
        for (int i = 0; i < lista.size(); ++i) System.out.println(lista.get(i).toString());
        
        t.commit();
        s.close();
        System.exit(0);
    }// main()

}// Hibernate