package com.FileOperations.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer extends Buffered_Reader
{
   
	public static void main(String[] args) throws IOException
	{
		fl = new FileWriter("dc.txt");
		
		BufferedWriter bw = new BufferedWriter(fl);
		
		bw.write(100);
		
		bw.newLine();
		
		char[] ch = {'a','b','c','d'};
		
		bw.write(ch);
		
		bw.newLine();
		
		bw.write("durga");
		
		bw.newLine();
		
		bw.write("Software");
		
		bw.flush();
		
		bw.close();
		
		readByBuffer("dc.txt");

	}

}
