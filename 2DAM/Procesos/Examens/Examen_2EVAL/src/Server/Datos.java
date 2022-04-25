package Server;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class Datos {

    private List<String> users;

    public void setUser(String user, String pass) {
        byte[] passByte = pass.getBytes();
        String passHash;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(passByte);
            passHash = Arrays.toString(md.digest());
            users.add(user + "," + passHash);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
    }// setUser()

    public boolean userValid(String user, String pass) {
        byte[] passByte = pass.getBytes();
        String passHash = null;
        boolean A = false;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(passByte);
            passHash = Arrays.toString(md.digest());

        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        for (int i = 0; i < users.size(); ++i) {
            if (users.get(i).split(",")[0].equals(user)) {
                if (users.get(i).split(",")[1].equals(passHash)) {
                    A = true;
                } else {
                    A = false;
                }
            } else {
                A = false;
            }
        }
        return A;
    }// userValid()

}// Datos
