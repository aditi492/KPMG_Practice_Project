/**
 * 
 */
package com.kpmg.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class FileDemoCharacterStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			
			inputStream = new FileReader("C:\\file\1.txt");
			outputStream = new FileWriter("C:\\file\2.txt");
			
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
			
		}catch (Exception ex) {
			
			System.out.println("Exception in I/O --> " + ex.getMessage());
		} finally {
			if(inputStream != null){
				inputStream.close();
			}
			
			if(outputStream != null) {
				outputStream.close();
			}
		}
		

	}

}
