/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab23.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bombe
 */
public class FileManager1 {
    Vector vPrincipal=new Vector();
    
    public DefaultTableModel Salary(){
      Vector cabeceras = new Vector();
      cabeceras.addElement("Name:");
      cabeceras.addElement("Sueldo:");
      cabeceras.addElement("descuento IESS");
      cabeceras.addElement("Sueldo Liquido");
           
      DefaultTableModel mdlTable= new DefaultTableModel(cabeceras,0);
      
     try{
         FileReader fr=new FileReader("Sueldos.csv");
         BufferedReader br = new BufferedReader(fr);
         String d;
         while((d=br.readLine())!=null){
             StringTokenizer dato = new StringTokenizer(d,";");
             Vector x=new Vector();
             while(dato.hasMoreTokens()){
                 x.addElement(dato.nextToken());
         }
             mdlTable.addRow(x);
         
         }
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
     return mdlTable;
    }
    
    
}
