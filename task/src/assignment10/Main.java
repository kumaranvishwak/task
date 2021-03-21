package assignment10;

import java.util.Arrays;

public class Main implements Shape, Operation {

	@Override
	public void operate(String name, double[] params) {
		// TODO Auto-generated method stub
		params=new double[]{1.1,2.2,3.3,4.4};
		
		System.out.println(name);
		Arrays.stream(params).forEach(num-> System.out.println(num));
		
		

	}

	@Override
	public double computeArea() {
		return 1000;
		// TODO Auto-generated method stub
		//Shape s=()->{return 1000;};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.operate("kumaran",new double[]{});
		System.out.println(m.computeArea());

	}

}
