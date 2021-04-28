package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {

	public static void main(String[] args) throws FileNotFoundException {
		File longText = new File("home/OOP-Java-k2n3/Lab/Lab05/src/hust/soict/hedspi/garbage/longText.txt");
		long start = System.currentTimeMillis();
		StringBuffer text = new StringBuffer();
		try (Scanner scan = new Scanner(longText)) {
			while (scan.hasNextLine()) {
				text.append(scan.nextLine() + "\n");
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
