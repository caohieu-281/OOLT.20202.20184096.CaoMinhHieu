package dmy;
import java.util.Scanner;
public class RunMain {
	public static void main(String[] args) {
		FunctionMain func = new FunctionMain();
		Scanner scanner = new Scanner(System.in);
		int year;
		while(true) {
			System.out.println("Input year: ");
			year = scanner.nextInt();
			boolean check = func.checkYear(year);
			if(check == false)
				System.out.println("Year > 0\n");
			else break;
		}
		boolean isLeap = func.isLeap(year);
		int month;
		while(true) {
			System.out.println("Input month: ");
			String mont = scanner.next();
			month = func.checkMonth(mont);
			if(month == 0)
				System.out.println("Not correct");
			else break;
		}
		System.out.println("Day: ");
		func.day(month, isLeap);
	}
}
