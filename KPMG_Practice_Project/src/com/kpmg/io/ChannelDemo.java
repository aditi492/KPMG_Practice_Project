/**
 * 
 */
package com.kpmg.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Administrator
 *
 */
public class ChannelDemo {
	
	public static void main(String args[]) throws IOException {
	      RandomAccessFile file = new RandomAccessFile("C://Test//temp.txt", "r");
	      FileChannel fileChannel = file.getChannel();
	      ByteBuffer byteBuffer = ByteBuffer.allocate(512);
	      while (fileChannel.read(byteBuffer) > 0) {
	         // flip the buffer to prepare for get operation
	         byteBuffer.flip();
	         while (byteBuffer.hasRemaining()) {
	            System.out.print((char) byteBuffer.get());
	         }
	      }
	      file.close();
	   }

}
