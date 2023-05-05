/**
 * 
 */
package com.kpmg.io;

import java.io.*;

/**
 * @author Administrator
 *
 */
public class CopyWithBuffers {
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {

			reader = new BufferedReader(new FileReader("xanadu.txt"));
			writer = new BufferedWriter(new FileWriter("bufferedOutput.txt"));
			int c;
			while ((c = reader.read()) != -1) {

				writer.write(c);

			}

		} finally {

			if (reader != null) {
				reader.close();
			}
			if (writer != null) {

				writer.close();
			}

		}

	}

}
