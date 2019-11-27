package Result;

public class Results {

	public static void myMarks(int physics, int biology, int chemistry) {
		int totalmark = physics + chemistry + biology;
		System.out.println("physics mark :" + physics);
		System.out.println("bios mark :" + biology);
		System.out.println("chem mark :" + chemistry);
		System.out.println("total mark :" + totalmark);

	}

	public static void percMarks(int physics, int biology, int chemistry) {
		double percmark = (physics + chemistry + biology) * 100 / 450;
		System.out.println("perc mark: " + percmark);

		if ((percmark < 60) || (physics < 60 || chemistry < 60 || biology < 60)) {
			System.out.println("fail");
			if (physics < 60) {
				System.out.println("physics failed");
			}
			if (biology < 60) {
				System.out.println("biology failed");
			}
			if (chemistry < 60)
				System.out.println("chemistry failed");
		} else {
			System.out.println("pass");
		}
	}

}