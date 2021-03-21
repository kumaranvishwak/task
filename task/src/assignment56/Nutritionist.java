package assignment56;
public class Nutritionist {

	public static void printCalories(Pizza a)
	{
		if(a instanceof MargheritaPizza)
		{
			System.out.println("Calories: 1500");
			return;
		}
		if(a instanceof CheesePizza)
		{
			System.out.println("Calories: 1700");
			return;
		}

		if(a instanceof Pizza)
		{
			System.out.println("Calories: 1200");
		}
	}
	
}
