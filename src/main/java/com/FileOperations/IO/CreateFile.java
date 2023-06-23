package com.FileOperations.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

	static File f;
    static File f1;
	static File f2;
	static FileReader fr;
	static FileWriter fl;
	static PrintWriter pw;
	static BufferedReader br;
	public static void createData(String Filename, boolean a, String b) throws IOException
	{
		fl = new FileWriter(Filename);
		
		pw = new PrintWriter(fl);
		
		pw.println(a);
		
		pw.println(b);
		
	}
	
	
	public static void main(String[] args) throws Exception
    {
		 f2 = new File("D:\\","bc.txt");
		 boolean a = f2.createNewFile();
		 System.out.println(a);
		 boolean b = f2.exists();
		 System.out.println(b);
		 
		

	}

}
