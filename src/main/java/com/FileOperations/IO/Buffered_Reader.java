package com.FileOperations.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;

public class Buffered_Reader extends CreateFile
{
	public static void readByBuffer(String Filename) throws IOException
	{
		fr = new FileReader(Filename);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		while(line != null) 
		{
			System.out.println(line);
			
			line = br.readLine();
			
		}
		
	
		
		br.close();
		
	}

	public static void main(String[] args) throws IOException
	{
		readByBuffer("bc.txt");

	}

}
