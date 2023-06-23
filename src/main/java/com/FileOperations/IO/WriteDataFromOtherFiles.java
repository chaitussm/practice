package com.FileOperations.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataFromOtherFiles extends CreateFile
{
	//read file 1 and then write it to file3 , read file 2 and write it to file 3
	public static void FetchData() throws IOException
	{
		//Final file
		 pw = new PrintWriter("file.txt");
		//Create file data for the first file
		
		br = new BufferedReader(new FileReader("abc.txt"));
		
		String line = br.readLine();
		
		while(line != null)
		{
	          pw.println(line);
			line = br.readLine();
		}
		
		//Create file data for the first file
		

       br = new BufferedReader(new FileReader("bcd.txt"));
		
		 line = br.readLine();
		
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		
		
       pw.flush();
       
       br.close();
       
       pw.close();
		
	}

	public static void main(String[] args) throws IOException
	{
		FetchData();
	}

}
