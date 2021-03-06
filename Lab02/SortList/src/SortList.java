import java.util.Arrays;
import java.util.Scanner;
public class SortList {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Lenght of array A: ");
			int n = scanner.nextInt();
			float Arr[] = new float[n];
			for(int i=0; i<n; i++) {
				System.out.print("A[" + i + "] = ");
				Arr[i] = scanner.nextFloat();
			}
			Arrays.sort(Arr);
			System.out.println("The sorted float array is:");
			float sum = 0, average = 0;
			for (float number : Arr) {
			    System.out.print(number + "\t");
			    sum += number;
			}
			average = sum / n;
			System.out.println("\nSum: " + sum);
			System.out.println("Average: " + average);
		}
	}
}
