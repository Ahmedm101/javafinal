package fileReading;

import java.io.File;
import java.util.Scanner;

public class ReadingFileUsingScanner {

	public static void main(String[] args) {
		
		
		String filepath ="C:\\Users\\malih\\git\\repository4\\java\\FinalJavaConcept\\shams.txt";
		Scanner sc =null;  // its a class so default is null value 
		try {
			File file =new File(filepath);
			sc = new Scanner(file);
			
			System.out.println("file content is :");
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}

	}

}
