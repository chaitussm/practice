package com.FileOperations.IO;

import java.io.File;

public class ListOfFilesandDirectory  extends CreateFile
{
	//To fetch all files and directories
	public static void fetchAll()
	{
        int count = 0;
        
        f = new File("D:\\");
		String[] total = f.list();
		
		for(String s : total)
		{
			count++;
			System.out.println(s);
		}
		
		System.out.println("**********The total number**********: " + count );
	}
	
	//To Ftech only Files
	public static void fetchDir()
	{
		int dircount = 0;
		  f = new File("D:\\");
		String[] dir = f.list();
		
		for(String ele : dir)
		{
			f1 = new File(f,ele);
			
			if(f1.isDirectory())
			{
				dircount++;
				System.out.println("--------All data available---------- " + ele);
			}
		}

	}
	
	//Fetch only Files 
	
	public static void fetchFile()
	{
		int filecount = 0;
		  f = new File("D:\\");
		String[] flist = f.list();
		
		for(String file : flist)
		{
			f1 = new File(f,file);
			
			if(f1.isFile())
			{
				filecount++;
				System.out.println("=========Directory available========= " + file);
			}
		}

	}
	
	


	public static void main(String[] args) throws Exception
	{
		fetchAll();
		fetchDir();
		fetchFile();
		
	}

}
