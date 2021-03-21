package assignment1234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2 {

	public static ArrayList<String> method(String[]a)
	{
		
		List<String>al= (List) Arrays.asList(a);
		return new ArrayList<String>(al);
		
	}
	public static void main(String[]args)
	{
		String res[]={"cognizant","technology","solutions"};
		System.out.println(method(res));
	}
	
	
}
