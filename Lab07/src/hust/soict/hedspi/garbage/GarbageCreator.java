package hust.soict.hedspi.garbage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) throws FileNotFoundException {
		File longText = new File("/home/KvlingxSS/OOP-Java-k2n3/Lab/Lab05/src/hust/soict/hedspi/garbage/longText.txt");
		long start = System.currentTimeMillis();
		String text = new String();
		try (Scanner scan = new Scanner(longText)) {
			while (scan.hasNextLine()) {
				text += scan.nextLine() + "\n";
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
