package assignment1234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment4 {
	
	
	public static ArrayList<Integer> switchIt(ArrayList<Integer>aOne,int a,int b)
	{
		
		
		int elem=aOne.get(a);
		aOne.set(a, aOne.get(b));
		aOne.set(b, elem);
		
		return aOne;
		
		
	}
	public static void main(String[]args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(switchIt(al,1,3));
		
		
	}

}
