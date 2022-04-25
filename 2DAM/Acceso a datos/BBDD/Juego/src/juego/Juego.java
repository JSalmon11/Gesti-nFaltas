package juego;

import POJOS.Arma;
import POJOS.Escudo;
import POJOS.HibernateUtil;
import POJOS.Personaje;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Juego{
    
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.sessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Query qP = s.createQuery("From Personaje");
        List<Personaje> listPersonaje = qP.list();
        
        int vidaInicial = 20;
        
        System.out.println("\n\tPERSONAJES"); 
        for (int i = 0; i < listPersonaje.size(); ++i)
        System.out.println(listPersonaje.get(i).toString());
        System.out.println("--------------------------------------------------");
        
        File f=new File("jugadas.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea=br.readLine();
            int codPersATK, danio, codPersDEF, defensa;
            
            while (linea!=null) {
                String[] codigos = linea.split(",");
                codPersATK = Integer.parseInt(codigos[0]);
                codPersDEF = Integer.parseInt(codigos[2]);              
                
                if (s.get(Personaje.class, codPersATK)!=null) {
                    if (s.get(Arma.class, Integer.parseInt(codigos[1]))!=null) {
                        if (s.get(Personaje.class, codPersDEF)!=null) {
                            if (s.get(Escudo.class, Integer.parseInt(codigos[3]))!=null) {
                                danio = ((Arma) s.get(Arma.class, Integer.parseInt(codigos[1]))).getDano();
                                defensa = ((Escudo)s.get(Escudo.class, Integer.parseInt(codigos[3]))).getDefensa();  
                                Personaje psjATK = (Personaje) s.get(Personaje.class, codPersATK);
                                Personaje psjDEF = (Personaje) s.get(Personaje.class, codPersDEF);
                                if (danio<defensa) {
                                    psjATK.setVida(psjATK.getVida()-(defensa-danio));
                                    s.update(psjATK);
                                }else{
                                    psjDEF.setVida(psjDEF.getVida()-(danio-defensa));
                                    s.update(psjDEF);
                                }
                            }else{
                                System.out.println("Escudo inexistente");
                            }
                        }else{
                            System.out.println("Personaje inexistente");
                        }
                    }else{
                        System.out.println("Arma inexistente");
                    }
                }else{
                    System.out.println("Personaje inexistente");
                }
                
                linea=br.readLine();
            }
            for (int i = 0; i < listPersonaje.size(); ++i) {
                if (listPersonaje.get(i).getVida() < vidaInicial*0.5) {
                    Personaje psj = (Personaje) s.get(Personaje.class, listPersonaje.get(i).getId());
                    s.delete(psj);
                }
            }
            System.out.println("--------------------------------"
            + "------------------\n\tPERSONAJES ACTUALIZADOS");            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
        for (int i = 0; i < listPersonaje.size(); ++i)
        System.out.println(listPersonaje.get(i).toString());
        
        t.commit();
        s.close();
        System.exit(0);
    }// main()
    
}// Juego