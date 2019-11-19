package namefactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NamesFromFile {
	
	public void importNamesFromCSV(String filename, int typeofDS){
		String line = "";
		String name = "";
		File fh = new File(filename);
		try {
			
			Scanner myScanner = new Scanner(fh);
			myScanner.nextLine();
			while (myScanner.hasNextLine()) {
			//TODO: write code that inserts name into collection
				name = myScanner.nextLine();
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("  ");
	}
	
	public void searchForItem(String item,  int typeOfDS) {
		//TODO: write code that searches for item in collection.
		// using contains
		System.out.println("  ");
	}
	
}

