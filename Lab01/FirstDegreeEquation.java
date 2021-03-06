package baitap;
import java.util.Scanner;
public class FirstDegreeEquation {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double a, b, a11, a12, a21, a22, b1, b2, p, q, r;
			System.out.println("First-degree equation with one variable ax+b = 0:");
			System.out.println("Input a: ");
			a = scanner.nextDouble();
			System.out.println("Input b: ");
			b = scanner.nextDouble();
			if(a == 0)
				System.out.println("0x + " + b + " = 0 has no solution");
			else
				System.out.println("Solution: x = " + (-b / a));
			
			System.out.println("\n*************************************\n"
					+ "First-degree equation with two variables:\n"
					+ "a11x + a12y = b1\n"
					+ "a12x + a22y = b2");
			System.out.println("Input a11: ");
			a11 = scanner.nextDouble();
			System.out.println("Input a12: ");
			a12 = scanner.nextDouble();
			System.out.println("Input b1: ");
			b1 = scanner.nextDouble();
			System.out.println("Input a21: ");
			a21 = scanner.nextDouble();
			System.out.println("Input a22: ");
			a22 = scanner.nextDouble();
			System.out.println("Input b2: ");
			b2 = scanner.nextDouble();
			double D, D1, D2;
			D = a11 * a22 - a21 * a12;
			D1 = b1 * a22 - b2 * a12;
			D2 = a11 * b2 - a21 * b1;
			if (D != 0)
				System.out.println("Solution: (x1, x2) = " + "(" + D1/D + ", " + D2/D + ")");
			else if (D1 == 0 && D2 == 0)
				System.out.println("Infinitely solutions!!!");
			else
				System.out.println("No solutions!!!");
			
			System.out.println("\n*************************************\n"
					+ "Second-degree: ax^2 + bx + c = 0");
			System.out.println("Input a: ");
			p = scanner.nextDouble();
			System.out.println("Input b: ");
			q = scanner.nextDouble();
			System.out.println("Input c: ");
			r = scanner.nextDouble();
			if(p ==0)
				System.out.println("Not second-degree");
			else {
				double delta;
				delta = q*q - 4*p*r;
				if(delta == 0)
					System.out.println("Double root: x1 = x2 = " + (-q/2*p));
				else if(delta > 0) {
					double sqrt_del = Math.sqrt(delta);
					System.out.println("Solution: (x1, x2) = " + "(" + (float)((-q + sqrt_del) / 2*p)
							+ ", " + (float)((-q - sqrt_del) / 2*p) + ")");
				}
				else
					System.out.println("No solution!!!");
			}
		}
	}
}
