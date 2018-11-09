/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab10_File.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author DayannaSilva
 */
public class Files {   
    String sep = File.separator;
        Path path = Paths.get(sep+"Users"+sep+"DayannaSilva"+sep+"Dropbox"+sep+
            "HomeworkandLabs"+sep+"Labs"+sep+"Unity 1"+sep+"Lab10"+sep+"Archivo.txt");
        
    public static void createFile (Path path){
        try{
            java.nio.file.Files.createDirectories(path.getParent());
            java.nio.file.Files.createFile(path);
            System.out.println("The file was created.");
        }catch(Exception e){
            System.out.println("Error, the file exists. "+e.getMessage());
        }
    }
    public void addText(String path,String to_apped){
		try{
			PrintWriter writer = new PrintWriter(new FileWriter(path,true));
			writer.append(to_apped);
			writer.close();
			System.out.println("It was written correctly in the file.");
		}catch(Exception e){
			System.out.println("Error adding data to the file");
		}
            }

}
