package Result.Classes;

import Result.Results;

public class App {

	public static void main(String[] args) {
		int physMark = 50;
		int chemMark =50;
		int bioMark =50;
		Results myResult = new Results();
		myResult.myMarks(physMark, chemMark, bioMark);
		myResult.percMarks(physMark, bioMark, physMark);
	}
}