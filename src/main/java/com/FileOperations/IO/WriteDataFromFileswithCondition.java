package com.FileOperations.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataFromFileswithCondition 
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("file.txt");
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("bcd.txt"));
		
		String line1 = br.readLine();
		String line2 = br1.readLine();
		
		while(line1!= null || line2!= null)
		{
			if(line1 != null) 
			{
				pw.println(line1);
				line1 = br.readLine();
			}
			
			if(line2 != null) 
			{
				pw.println(line2);
				line2 = br1.readLine();
			}
		}
		
		pw.flush();
		br.close();
		br1.close();
		pw.close();

		

	}

}
