package assignment9;


public class Main  {

	public static void main(String[]args)
	{
		Kumaran obj1=()->false;
		int p=50;
		Kumaran onj2=()->p<98;
		System.out.println("()->false result:   "+obj1.condition());
		System.out.println("p->p<98 result:   "+onj2.condition());
	}
	
	
}
