package com.RegularExpressions.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchPattern 
{
	static Pattern p;
	
	public static void FindPattern(String substr , String Str)
	{
		int count = 0;
		p = Pattern.compile(substr);
		
		Matcher m = p.matcher(Str);
		
		while(m.find())
		{
			count++;
			//Here end fetches ending position + 1 position
			System.out.println(m.start() + "---" + m.end() + "---" + m.group());
		}
		
		System.out.println("Number of occurences : " + count);
	}

	public static void main(String[] args) 
	{
		
		FindPattern("day" , "today is a beautiful day");
	}

}
