package fileReading;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		
		String filePath ="C:\\Users\\malih\\git\\repository4\\java\\FinalJavaConcept\\shams.txt";
		
		try {
			File file = new File(filePath);
			
			if(!Desktop.isDeskstopSupported()) {
				System.out.println("Deskstop not supported");
				return;
			}
			Desktop dsktp =Desktop.getDesktop();
			
			if(file.exists()) {
				dsktp.open(file);
			}
			

	}
		catch(Exception e) {
			e.printStackTrace(); // will show what type error and from which line
		}
		finally {
			
		}

}
}