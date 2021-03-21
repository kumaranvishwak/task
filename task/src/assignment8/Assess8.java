package assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class Assess8 {
	static int k = 0, v = 0;

	public static void printWithoutLoop(String[][] name, int i, int j) {

		if (k == i)
			return;
		System.out.println(name[k][v]);
		if (v < j)
			v++;
		if (v == j) {
			k++;
			v = 0;
		}

		printWithoutLoop(name, i, j);

	}
	public static void printwithloop(String[][]name)
	{
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
			
			System.out.println(name[i][j]);
			}
			}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] names = new String[2][3];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {

				names[i][j] = sc.nextLine();

			}
		}
		System.out.println("------------------------------");
System.out.println("Print without loop");
System.out.println("------------------------------");
		printWithoutLoop(names, 2, 3);
		System.out.println("------------------------------");
		System.out.println("Print with loop");
		System.out.println("------------------------------");
		printwithloop(names);

	}
}
