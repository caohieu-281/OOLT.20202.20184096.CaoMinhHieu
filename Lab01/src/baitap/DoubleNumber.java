package baitap;
import java.util.Scanner;
public class DoubleNumber {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			double num1, num2;
			System.out.println("Input the first number: ");
			num1 = scanner.nextDouble();
			System.out.println("Input the second number: ");
			num2 = scanner.nextDouble();
			System.out.println("Sum: " +  (num1 + num2));
			if(num1 > num2)
				System.out.println("Difference: " + (num1 - num2));
			else
				System.out.println("Difference: " + (num2 - num1));
			System.out.println("Product: " +  (num1 * num2));
			if(num2 != 0)
				System.out.println("Quotient: " +  (num1 / num2));
			else
				System.out.println("Because num2 = 0\n Cannot calculate!!!");
		}
	}
}
