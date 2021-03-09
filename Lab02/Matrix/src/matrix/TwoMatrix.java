package matrix;
import java.util.Scanner;
public class TwoMatrix {
	public static void main(String[] args) {
		int row, column;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Row of two matrix: ");
			row = scanner.nextInt();
			System.out.print("Column of two matrix: ");
			column = scanner.nextInt();
			float A[][] = new float[row][column];
			float B[][] = new float[row][column];
			float sum[][] = new float[row][column];
			// Input matrix A
			System.out.println("Input for matrix A: ");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print("A[" + i + "][" + j + "] = ");
					A[i][j] = scanner.nextFloat();
				}
			}
			// Input matrix B
			System.out.println("Input for matrix B: ");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print("B[" + i + "][" + j + "] = ");
					B[i][j] = scanner.nextFloat();
				}
			}
			// Output matrix A and add matrix B
			System.out.println("Matrix A:");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print(A[i][j] + "\t");
					sum[i][j] = A[i][j] + B[i][j];
					if(j == (column - 1))
						System.out.println();
				}
			}
			// Output matrix B
			System.out.println("Matrix B:");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print(B[i][j] + "\t");
					if(j == (column - 1))
						System.out.println("");
				}
			}
			// Output matrix Sum
			System.out.println("Matrix Sum = A + B:");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print(sum[i][j] + "\t");
					if(j == (column - 1))
						System.out.println("");
				}
			}
		}
	}
}
