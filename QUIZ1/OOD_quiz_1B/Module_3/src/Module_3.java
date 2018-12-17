import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Module_3 {

	public static void main(String[] args) {

		/* Get keyboard input */
		Scanner keyboardInput;
		keyboardInput = new Scanner(System.in);

		/* Read your input file path from keyboard*/
		System.out.println("Please input your input file path: ");
		String inputFilePath1 = keyboardInput.nextLine();
		System.out.println("Input file path: " + inputFilePath1);
		
		/* Get file input */
		Scanner fileInput1 = null;

		/* Handle file not found exception */
		try {

			fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		/* Read your input file path from keyboard*/
		System.out.println("Please input your input file path: ");
		String inputFilePath2 = keyboardInput.nextLine();
		System.out.println("Input file path: " + inputFilePath2);
		
		/* Get file input */
		Scanner fileInput2 = null;

		/* Handle file not found exception */
		try {

			fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		/* Read your output file path from keyboard*/
		System.out.println("Please input your output file path: ");
		String outputFilePath = keyboardInput.nextLine();
		System.out.println("Output file path: " + outputFilePath);
		System.out.println("*************************************");
		
		/* Get text-output stream */
		PrintWriter textOutput = null;

		/* Handle file not found exception */
		try {

			textOutput = new PrintWriter(new FileOutputStream(outputFilePath));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		/* Output all of the content in input file */
		int no = 0;
		String result = null;
		String result2 = null;
		while (fileInput1.hasNext()) {
			result = fileInput1.nextLine();
			
			while(fileInput2.hasNext()) {
				result2 = fileInput2.nextLine();
				if(result.equals(result2)) {
					System.out.println("Before change : " + result2);
					break;
				}
				
				
			}
			fileInput2.close();
			try {

				fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}
		fileInput1.close();
		try {

			fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		while (fileInput1.hasNext()) {
			
			result = fileInput1.nextLine();
			result = result.replaceFirst("4","8");
			System.out.println(result);
		}
		fileInput1.close();
		try {

			fileInput1 = new Scanner(new FileInputStream(inputFilePath1));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		fileInput2.close();
		try {

			fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		while (fileInput1.hasNext()) {
			result = fileInput1.nextLine();
			result = result.replaceFirst("4","8");
			while(fileInput2.hasNext()) {
				result2 = fileInput2.nextLine();
				if(result.equals(result2)) {
					System.out.println("After change : " + result2);
					break;
				}
			}
			fileInput2.close();
			try {

				fileInput2 = new Scanner(new FileInputStream(inputFilePath2));
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}
		
		
		/* Close input and output stream */
		keyboardInput.close();
		fileInput1.close();
		fileInput2.close();
		textOutput.close();
	}
}
