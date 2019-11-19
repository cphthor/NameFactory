package namefactory;

import java.util.ArrayList;
import java.util.HashSet;

public class NameFactory {
	public static void main(String[] args) {
		CPRFactory myCPRFactory = new  CPRFactory();
		int cnt = 0;
		int counter = 0;
		int limit = 0;
		String filename = "Data/newnames.txt";
		String item = "Awat Petersen";
		NamesFromFile nf = new NamesFromFile();
		nf.importNamesFromCSV(filename,  1);
		ArrayList<String> names  = nf.getNamesAL();
		
		HashSet<String> myCprs = new HashSet<>();
		ArrayList<String> myCprsA = new ArrayList<>();
		
		while (counter < names.size()) {
			counter++;
			myCprs.add(myCPRFactory.createCPR());
			myCprsA.add(myCPRFactory.createCPR());
		}
		
	}
	
}

