package interview;

import java.util.HashMap;
import java.util.Map;

public class Sapiens_HashMap {

	public static void main(String[] args) {

  Map<Integer,String> colors = new HashMap<Integer,String>();
  
  
  colors.put(new Integer(0), "blue");
  colors.put(new Integer(1), "red");
  colors.put(new Integer(2), "green");
  
 //correct approach of casting  
  String name = "dad";
  Object x = name;
  
  //wrong approach of casting 
//  Object  name = "dad";
//  String x = name;
  
  
  
  System.out.println(colors.get(1));

 
  

	}

}
