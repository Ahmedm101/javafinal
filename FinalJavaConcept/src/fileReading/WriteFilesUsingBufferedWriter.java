package fileReading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilesUsingBufferedWriter {

	public static void main(String[] args) {
		BufferedWriter writer=null;
		String names []= {"shams","maliha","evan"};
				
		
	try {
		// buffer writer cannot write directly taking help from file writer and making this eal.txt directly on the project
		writer =new BufferedWriter(new FileWriter("eal.txt"));
		writer.write("this is maliha");
		writer.write("this is shmas");
		writer.write("\nthis is faruk");
		
		for(String nm:names) {
			writer.write("\n" +nm);
		}
		// it is writing on the txt file
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
		
		
		
		
		

	}

}
