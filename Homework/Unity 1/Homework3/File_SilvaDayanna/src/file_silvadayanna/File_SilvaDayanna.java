/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_silvadayanna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author DayannaSilva
 */
public class File_SilvaDayanna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String sep = File.separator;
        Path path = Paths.get(sep+"Users"+sep+"DayannaSilva"+sep+"Dropbox"+sep+"HomeworkandLabs"+sep+"Homework"+sep+"Unity 1"+sep+"Homework3"+sep+"Archivo.txt");      
        /*createFile(path);
        addText(path.toString(),"Hello, writing in the file\n");
        String info_archivo = readFile(path.toString());
		if(info_archivo != null){
			System.out.println("Text file: "+info_archivo);
		}*/
        deleteFile(path.toString()); 
    }
    public static void createFile (Path path) throws IOException{
                try{
                    Files.createDirectories(path.getParent());
                    Files.createFile(path);
                    System.out.println("The file was created.");
                }catch(Exception e){
                    System.out.println("Error, the file exists. "+e.getMessage());
                }
            }
            public static void addText(String path,String to_apped){
		try{
			PrintWriter writer = new PrintWriter(new FileWriter(path,true));
			writer.append(to_apped);
			writer.close();
			
			System.out.println("It was written correctly in the file.");
		}catch(Exception e){
			System.out.println("Error adding data to the file");
		}
            }
            public static String readFile(String path){
		try{
                    FileReader reader = new FileReader(path);
		    BufferedReader buffer = new BufferedReader(reader);
		    String linea = buffer.readLine();
		    String texto = linea;
		    while(linea != null){
                        //System.out.println(linea);
		        linea = buffer.readLine();
			if(linea!= null)
			texto = texto + linea+"\n";
		    }
                    return texto;
		}catch(Exception e){
			System.out.println("There was an error reading the file." +e.getMessage());
		}
		return null;
	    }
            public static void deleteFile(String path){
		File file = new File(path);
		if(file.exists()){
			if(file.delete()){
				System.out.println("The file was deleted");
			}
		}else{
			System.out.println("The file does not exist.");
		}
	    }
    
}
