/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package namefactory;

/**
 *
 * @author thor
 */
public class NameFactory {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int cnt = 0;
		int limit = 2;
		String filename = "Data/newnames.txt";
		String item = "Awat Petersen";
		NamesFromFile nf = new NamesFromFile();
		while (cnt < limit ) {
			cnt++;
			nf.importNamesFromCSV(filename,  1);
			nf.importNamesFromCSV(filename,  2);
			nf.importNamesFromCSV(filename,  3);
			nf.importNamesFromCSV(filename,  4);
			System.out.println("  ");
			nf.searchForItem(item, 1);
			nf.searchForItem(item, 2);
			nf.searchForItem(item, 3);
			nf.searchForItem(item, 4);
			
		}

	}
	
}
