package Result.Calc;

public class results {

	public static void myMarks(int physics, int biology, int chemistry) {
		int totalmark = physics + chemistry + biology;
		System.out.println("physics mark :" + physics);
		System.out.println("bios mark :" + biology);
		System.out.println("chem mark :" + chemistry);
		System.out.println("total mark :" + totalmark);

	}

	public static void percMarks(int physics, int biology, int chemistry) {
		double percmark = (physics + chemistry + biology) / 450;
		System.out.println("perc mark: " + percmark);

		if ((percmark < 60) || (physics < 60 || chemistry < 60 || biology < 60)) {
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}
	}

}
