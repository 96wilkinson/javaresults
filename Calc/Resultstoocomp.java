package Result.Calc;

import Result.Classes.Classes;

public class Resultstoocomp {
	
		public static void totalmarks() {
			
			Classes calc = new Classes();
			int sum = calc.sum(physics, biology, chemistry);
			System.out.println("Total :" + sum);
			
		}

}
