/*
 * Gurjit Singh
 * Thursday December 12th - 2019
 * This program displays the parallel arrays with external file
 */

package parallelarrays;
import java.io.*;
 
/**
 *
 * @author gusin5788
 */
public class Parallelarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		File dataFile = new File("fees.dat");
		FileReader in;
		BufferedReader readFile;
                
		String fee;
		double avgFees;
		double totalFees = 0;
		int numFees = 0;
		
                System.out.println("University Tuition Fees For Computer Science:");
                System.out.println("");
                System.out.println("1st fee is for the program at University of Guelph.");
                System.out.println("2nd fee is for the program at University of Waterloo.");
                System.out.println("3rd fee is for the program at University of Toronto.");
                System.out.println("4th fee is for the program at McMaster University.");
                System.out.println("");

		try {
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
    		while ((fee = readFile.readLine()) != null ) {
    			numFees += 1;
                        System.out.println("$" + fee);
    			totalFees += Double.parseDouble(fee);
    		}
                
    		avgFees= totalFees / numFees;
                System.out.println("");
    		System.out.println("Average of the fees = $" + avgFees);
                System.out.println("");
			readFile.close();
			in.close();
                        
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
                        System.out.println("");
                        
		} catch (IOException e) {
			System.out.println("Problem reading file.");
                        System.err.println("IOException: " + e.getMessage());
                        System.out.println("");
                }
    }	
 }