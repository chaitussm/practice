package com.FileOperations.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends ReadDataInFile
{

	public static void main(String[] args) throws IOException
	{
	
       FileWriter fw = new FileWriter("bc.xls",true);
       fw.write(100);
       fw.write("urga\nsoftware");
       fw.write('\n');
       char[] ch = {'a', 'b' , 'c'};
       fw.write(ch);
       fw.write('\n');
       fw.flush();
       fw.close();
       
       readByRead("dc.txt");
	}

}
