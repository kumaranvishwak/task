package assignment56;

public class Main {

	
	public static void main(String[]asrgs)
	{
		
		MargheritaPizza mp=new MargheritaPizza();
		mp.makePizza();
		Nutritionist.printCalories(mp);
		CheesePizza cp=new CheesePizza();
		cp.makePizza();
		Nutritionist.printCalories(cp);
		Pizza p=new Pizza();
		p.makePizza();
		Nutritionist.printCalories(p);
		Pizza p1=new MargheritaPizza();
		p1.makePizza();
		Nutritionist.printCalories(p1);
		Pizza p2=new CheesePizza();
		p2.makePizza();
		Nutritionist.printCalories(p2);
		
		
		
	}
	
	
}
