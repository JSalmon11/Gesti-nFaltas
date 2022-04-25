package examenhibernateuniversidad;

import POJOS.Especialidad;
import POJOS.HibernateUtil;
import POJOS.Profesor;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Universidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        SessionFactory sf = HibernateUtil.sessionFactory();
        Session s = sf.openSession();
        Session s1 = sf.openSession();
        Transaction t = s.beginTransaction();

        Query q = s.createQuery("From Profesor");
        Query q1 = s.createQuery("From Especialidad");
        List<Profesor> listaProf = q.list();
        List<Especialidad> listaEsp = q1.list();

        File f = new File("datosprofesor.bin");
        try {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            try {
                int id, operacion;
                String nombre, apellidos, especialidad;
                while (true) {
                    id = dis.readInt();
                    nombre = dis.readUTF();
                    apellidos = dis.readUTF();
                    especialidad = dis.readUTF();
                    operacion = dis.readInt();
                    int codEsp = 0;
                    for (int i = 0; i < listaEsp.size(); ++i) {
                        if (listaEsp.get(i).getNombre().equals(especialidad)) {
                            codEsp = listaEsp.get(i).getCod();
                        }
                    }
                    
                    Especialidad esp = (Especialidad) s.get(Especialidad.class, codEsp);
                    Especialidad newEsp;
                    Profesor prof;
                    switch (operacion){
                        case 1:
                            if (s.get(Profesor.class, id)!=null) {
                                if (esp!=null) {
                                   prof = new Profesor(id, esp, nombre, apellidos);
                                   s1.save(prof);
                                }else{
                                   System.out.println("No existe la especialidad, ¿dar de alta? (S/N)");
                                    if (teclado.nextLine().equals("S")) {
                                        newEsp = new Especialidad((listaEsp.get(listaEsp.size()-1).getCod())+10);
                                        newEsp.setNombre(especialidad);
                                        prof = new Profesor(id, newEsp, nombre, apellidos);
                                        s1.save(prof);
                                    }
                                }
                            }else System.out.println("El profesor no existe");
                            break;
                        case 2:
                            if (s.get(Profesor.class, id)!=null) {
                                prof = (Profesor) s.get(Profesor.class, id);
                                s.delete(prof);
                            }else System.out.println("El profesor no existe");
                            break;
                        case 3:
                            if (s.get(Profesor.class, id)!=null) {
                                if (esp!=null) {
                                    prof = (Profesor) s.get(Profesor.class, id);
                                    prof.setEspecialidad(esp);
                                    s.update(prof);
                                }else{
                                    System.out.println("No existe la especialidad, ¿dar de alta? (S/N)");
                                    if (teclado.nextLine().equals("S")) {
                                        newEsp = new Especialidad((listaEsp.get(listaEsp.size()-1).getCod())+10);
                                        newEsp.setNombre(especialidad);
                                        s.save(newEsp);
                                        prof = (Profesor) s.get(Profesor.class, id);
                                        prof.setEspecialidad(newEsp);
                                        s.update(prof);
                                    }
                                }
                            }else System.out.println("El profesor no existe");
                            break;
                    }
                }                
            } catch (EOFException e) {
                System.out.println("\nSe acabó el fichero");
            }
            
            /*for (int i = 0; i < listaEsp.size(); ++i) {
                System.out.println("------------------------------------------");
                System.out.println(listaEsp.get(i).toString());
                Iterator it = listaEsp.get(i).getProfesors().iterator();
                while (it.hasNext()) {
                    System.out.println(((Profesor) it.next()).mostrar());
                }
            }*/
            
            fis.close();
            dis.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        t.commit();
        s1.close();
        s.close();
        System.exit(0);
    }// main()

}// Universidad
