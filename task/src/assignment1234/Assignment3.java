package assignment1234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {
public static ArrayList<String> removeDuplicate(String[]a)
{
	List<String>al= (List) Arrays.asList(a);
	int n=al.size();
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(al.get(i).equals(al.get(j)))
			{
				for(int k=j;k<n-1;k++)
				{
					al.set(j, al.get(k+1));
				}
				n--;
			}
		}
		
		
		
	}
	
	ArrayList<String>newer=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		newer.add(al.get(i));
	}
	
	return  newer;
	
}
	
	
	
	
	public static void main(String[]args)
	{
		String res[]={"cognizant","technology","technology","solutions","cognizant"};
		System.out.println(removeDuplicate(res));
	}
}
