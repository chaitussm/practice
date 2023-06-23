package com.RegularExpressions.Programs;

import java.util.StringTokenizer;

public class StringTokenIzer 
{
	public static void splitBytokenizer()
	{
		StringTokenizer st = new StringTokenizer("Durga Software Solutions");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("1-04-2023" , "-");
		while(st1.hasMoreElements())
		{
			System.out.println(st1.nextToken());
		}
		
	}

	public static void main(String[] args) 
	{
		splitBytokenizer();

	}

}
