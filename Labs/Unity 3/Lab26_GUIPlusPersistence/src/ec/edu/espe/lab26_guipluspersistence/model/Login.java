/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab26_guipluspersistence.model;



import ec.edu.espe.lab26_guipluspersistence.GUI.Login1;
import ec.edu.espe.lab26_guipluspersistence.util.FileManager;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Lenovo
 */
public class Login {
      FileManager file= new FileManager();
      File arch = new File("Claves.txt");
      
     
     public void saveUser(String user){
  
         String acum="";
         acum=user+"\n";          
        
        file.writeFile(arch, acum);      
                  
     }
     
     public void enter(String user){
       
        String chain=file.searchInFile(arch, user);
        System.out.println("ch----"+chain);
         
        if ((user.equals(chain.split(";")[0])) ){
             JOptionPane.showMessageDialog(null,"Bienvenido");
             
        }else{
             JOptionPane.showMessageDialog(null, "Usuario Incorrecto"
                        , "Error", JOptionPane.ERROR_MESSAGE);
             Login1 log = new Login1();
             log.setVisible(true);
           
             
         }
         
         
         
         
     }
     
     
 
 
}
