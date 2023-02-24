package fileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingBufferedReader {

	// BF read faster but cant directly need to take help of file reader or inputstream
	
	
	
	public static void main(String[] args) {
		String filepath ="C:\\Users\\malih\\git\\repository4\\java\\FinalJavaConcept\\shams.txt";
		BufferedReader br = null ;
		
		try {
			File file = new File(filepath);              //object of filereader
			br= new BufferedReader(new FileReader(file));
			System.out.println("the file content is: ");
			
			int c=0;
			while((c=br.read())!= -1) {
				System.out.println((char)c);
			}

	}
		catch(Exception e){
			e.printStackTrace();
		}
       finally {
    	   try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }
}
}