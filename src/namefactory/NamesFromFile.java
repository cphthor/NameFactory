package namefactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class NamesFromFile {
	HashSet<String> namesSet = new HashSet<>();
	ArrayList<String> namesAL = new ArrayList<>();
	LinkedList<String> namesLL = new LinkedList<>();
	
	public void importNamesFromCSV(String filename, int typeofDS){
		String line = "";
		String name = "";
		File fh = new File(filename);
		long startTime = System.currentTimeMillis();
		try {
			
			Scanner myScanner = new Scanner(fh);
			myScanner.nextLine();
			while (myScanner.hasNextLine()) {
				name = myScanner.nextLine();
				if (typeofDS == 1)
					namesAL.add(name);
				if (typeofDS == 2)
					namesSet.add(name);
				else
					namesLL.add(name);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("  ");
		if (typeofDS == 1){
			System.out.println("Time in  millis for ArrayL:" + (stopTime - startTime));
			System.out.println("Size is: " + namesAL.size());
		}
		if (typeofDS == 2){
			System.out.println("Time in  millis for Set:" + (stopTime - startTime));
			System.out.println("Size is: " + namesSet.size());
		}
		if (typeofDS == 3){
			System.out.println("Time in  millis for LL:" + (stopTime - startTime));
			System.out.println("Size is: " + namesLL.size());
		}
		
	}
	
	public void searchForItem(String item,  int typeOfDS) {
		long startTime = System.currentTimeMillis();
		if (typeOfDS == 1) {
			System.out.println(item + " occurs i AL:  " + namesAL.contains(item));
			long stopTime = System.currentTimeMillis();
			System.out.println("Search Time in  millis for ArrayL:" + (stopTime - startTime));
		}
		if (typeOfDS == 2) {
			System.out.println(item + " occurs i Set:  " + namesSet.contains(item));
			long stopTime = System.currentTimeMillis();
			System.out.println("Search Time in  millis for Set:" + (stopTime - startTime));
		}
		if (typeOfDS == 3) {
			System.out.println(item + " occurs i LL:  " + namesLL.contains(item));
			long stopTime = System.currentTimeMillis();
			System.out.println("Search Time in  millis for LL:" + (stopTime - startTime));
		}
		System.out.println("  ");
	}
	
}

