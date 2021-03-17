package mydate;

public class DateTest {
	public static void main(String[] args) {
		MyDate test = new MyDate();
		test.print();
		
		test = new MyDate(4, 9, 2000);
		test.print();
		
		test = new MyDate("2000/Jan./28");
		test.print();
		
		test.accept();
		test.print();
	}
}