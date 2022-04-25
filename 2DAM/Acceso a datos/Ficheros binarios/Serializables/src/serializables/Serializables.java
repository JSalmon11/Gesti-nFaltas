package serializables;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializables {
   public static void main(String[] args) {
      File f=new File("alumnos.obj");
      
      try{
         if(!f.exists()){
          System.out.println("El fichero no existe");
          FileOutputStream fos=new FileOutputStream(f);
          ObjectOutputStream oos=new ObjectOutputStream(fos);
          oos.close();
          fos.close();
         }
        
          FileOutputStream fos = new FileOutputStream(f);
          ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Alumno a1;
            a1=new Alumno("alumno1",100,4.5);
            oos.writeObject(a1);
            a1=new Alumno("alumno2",200,8.5);
            oos.writeObject(a1);
            a1=new Alumno("alumno3",300,6.5);
            oos.writeObject(a1);
            oos.close();
            fos.close();
       
      
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
      
            try{
                while(true){
                    Object readObject = ois.readObject();
                    System.out.println(readObject);
               }
            }catch(EOFException e){}
              ois.close();
              fis.close();
      
      }catch(IOException e){
          System.out.println(e);
      }catch(ClassNotFoundException e){}
    }   
}