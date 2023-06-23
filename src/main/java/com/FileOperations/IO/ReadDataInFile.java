package com.FileOperations.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataInFile extends CreateFile
{
	public static void readByRead(String Filename) throws IOException 
	{
		//Filename = "bc.txt";
        fr = new FileReader(Filename);
		
		int i = fr.read();
		
		while(i!= -1)
		{
			System.out.print((char)i);
			i = fr.read();
		}
		
		
	}

	public static void readByReadCharArray(String Filename) throws IOException 
	{
		f = new File(Filename);
		
		char[] ch = new char[(int) f.length()];
		
		fr = new FileReader(f);
		
		fr.read(ch);
		
		for(char c : ch)
		{
			System.out.print(c);
		}
		
	}


	public static void main(String[] args) throws IOException
	{
		readByRead("bc.txt");
		readByReadCharArray("bc.txt");
	}
		
}
