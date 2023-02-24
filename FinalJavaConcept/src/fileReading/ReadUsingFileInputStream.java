package fileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingFileInputStream {

	public static void main(String[] args) {
		
		
		String filepath ="C:\\Users\\malih\\git\\repository4\\java\\FinalJavaConcept\\shams.txt";
		FileInputStream fip=null;
		try {
		File file =new File(filepath);
		fip= new FileInputStream(file);  // opened the file
		System.out.println("the file content is :");
		
		int c=0;
		while((c=fip.read())!=-1) {
			System.out.println((char)c);  //read the file 
		}

	}
		catch(Exception e) {
			e.printStackTrace();
		}
        finally {
        	try {
				fip.close();   //close the file 
			} catch (IOException e) {   
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
}
}