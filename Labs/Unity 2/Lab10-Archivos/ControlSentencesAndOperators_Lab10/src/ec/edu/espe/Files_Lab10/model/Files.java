/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Files_Lab10.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author DayannaSilva
 */
public class Files{
    public void Write(File file, String inString){
        try{
            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(file, true));
            buffWriter.newLine();
            buffWriter.write(inString);
            buffWriter.close();
            
        }catch(IOException e){
            System.out.println("No existe el archivo o"
                    + " ha ocurrido un error");
        }
    }  
    
    public void Read(File file){
                String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }
                
    
    
}
