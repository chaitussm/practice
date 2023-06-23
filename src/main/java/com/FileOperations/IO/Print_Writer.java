package com.FileOperations.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer extends Buffered_Reader
{
	

	public static void main(String[] args) throws IOException
	{
		fl = new FileWriter("bc.txt");
		
		PrintWriter pw = new PrintWriter(fl);
		
		pw.write(100);
		
		pw.println("durga");
		
		pw.println(true);
		
		pw.flush();
		
		pw.close();
		
		readByBuffer("bc.txt");

		
		

	}

}
