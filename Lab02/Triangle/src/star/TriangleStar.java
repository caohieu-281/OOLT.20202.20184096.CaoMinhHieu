package star;
import java.util.Scanner;
public class TriangleStar {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a;
			System.out.println("Input a:");
			a = scanner.nextInt();
			for(int i=0; i<a; i++) {
				for(int j= a-i-1; j>=0; j--)
					System.out.print(" ");
				for(int j=0;j<2*i+1; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}