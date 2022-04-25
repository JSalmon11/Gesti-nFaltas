package hibernaterelacionadas;

import POJOS.Alumnos;
import POJOS.Curso;
import POJOS.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.sessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Scanner teclado = new Scanner(System.in);

        Query q = s.createQuery("From Alumnos");
        Query q1 = s.createQuery("From Curso");
        List<Alumnos> lista = q.list();
        List<Curso> listaC = q1.list();

        Alumnos al = null;
        Curso c = null;

        System.out.println("Ellige:\n  1.SELECT\n  2.INSERT\n  3.UPDATE\n  4.DELETE");
        int elige = teclado.nextInt();
        switch (elige) {
            case 1:
                SELECT(lista, listaC);break;
            case 2:
                INSERT(s, al, c);break;
            case 3:
                UPDATE(s, al, c);break;
            case 4:
                DELETE(s, al, c);break;
        }

        t.commit();
        if (elige==2 || elige==3 || elige==4) {
            SELECT(lista, listaC);            
        }
        s.close();
        System.exit(0);
    }// main()

    private static void SELECT(List<Alumnos> lista, List<Curso> listaC) {
        System.out.println("\nALUMNOS");
        for (int i = 0; i < lista.size(); ++i) {
            System.out.println(lista.get(i).toString());
        }

        System.out.println("\nCURSOS");
        
        for (int i = 0; i < listaC.size(); ++i) {
            System.out.println("------------------------------------------");
            System.out.println(listaC.get(i).toString());
            Iterator it = listaC.get(i).getAlumnoses().iterator();
            while (it.hasNext()) {
                System.out.println(((Alumnos) it.next()).mostrar());
            }
        }
    }// SELECT()

    private static void INSERT(Session s, Alumnos al, Curso c) {
        al = (Alumnos) s.get(Alumnos.class, 125);
        if (al == null) {
            c = (Curso) s.get(Curso.class, 20);
            if (c == null) {
                System.out.println("El curso no existe");
            } else {
                al = new Alumnos(125, c, "IlloJuan Malikon");
                s.save(al);
            }
        } else {
            System.out.println("Ya existe el alumno");
        }
    }// INSERT()

    private static void UPDATE(Session s, Alumnos al, Curso c) {
        al = (Alumnos) s.get(Alumnos.class, 125);
        if (al == null) {
            System.out.println("Alumno inexistente");
        } else {
            c = (Curso) s.get(Curso.class, 50);
            if (c == null) {
                System.out.println("El curso no existe");
            } else {
                al.setCurso(c);
                s.update(al);
            }
        }
    }// UPDATE()

    private static void DELETE(Session s, Alumnos al, Curso c) {
        al = (Alumnos)s.get(Alumnos.class, 125);
        if (al==null) {
            System.out.println("Alumno inexistente");
        }else{
            s.delete(al);
        }
    }// DELETE()

}// Hibernate
