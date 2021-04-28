package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;
import junit.framework.TestCase;

public class DateTest extends TestCase {
	 public static void testAccept(int day, int month, int year, MyDate d,int option){ 
	        if (option == 0) {
	            d.accept();
	            assertTrue("Method accept() is not working properly",d.getDay() == day && d.getMonth() == month && d.getYear() == year);
	            System.out.println("Method acceptDay() worked just fine");
	        }
	        else if (option == 1){
	            d.accept();
	            assertTrue("Method accept() is not working properly",d.getDay() != day || d.getMonth() != month || d.getYear() != year);
	            System.out.println("Method acceptDay() worked just fine");
	        }
	    }

	    public static void testCompare(MyDate d1, MyDate d2,int expectation){
	        assertEquals("The result of compare method did not meet the expectation.", DateUtils.compare(d1,d2),expectation);
	    }
	    
	    public static void testSortDate(MyDate[] dateArr){
	    	DateUtils.sortDates(dateArr);
	        for (int i = 0 ; i < dateArr.length ; i++){
	            for (int j = i + 1 ; j < dateArr.length ; j++ ){
	                    assertFalse("The result of sortDate method did not meet the expectation.", DateUtils.compare(dateArr[i],dateArr[j])>0);
	            }
	        }
	    }
	    
	    public static void testPrintWithMultiOption(MyDate d1,int option, String expectation){
	        assertEquals("The result of print with option "+option+" did not meet the expectation.",d1.print(option),expectation);
	    }
	    
    public static void main(String []args){
        MyDate date1= new MyDate(28,1,2000);

        testAccept(12,13,2020,date1,1);
        date1.print();
        testAccept(12,11,2020,date1,0);
        date1.print();

        MyDate[] dateArr = new MyDate[5];
        dateArr[0] = new MyDate(2,3,2021);
        dateArr[1] = new MyDate(3,2,2021);
        dateArr[2] = new MyDate(2,3,2021);
        dateArr[3] = new MyDate(1,1,2020);
        dateArr[4] = new MyDate(31,12,2019);
        testCompare(dateArr[0],dateArr[1],1);
        testCompare(dateArr[0],dateArr[2],0);
        testCompare(dateArr[1],dateArr[0],-1);
        testCompare(dateArr[3],dateArr[4],1);
        testSortDate(dateArr);
        testPrintWithMultiOption(dateArr[1],1,"My Date (yyyy-MM-dd): 2020-01-01");
        testPrintWithMultiOption(dateArr[1],2,"My Date (d/M/yyyy): 1/1/2020");
        testPrintWithMultiOption(dateArr[1],3,"My Date (dd-MMM-yyyy): 01-Jan-2020");
        testPrintWithMultiOption(dateArr[1],4,"My Date (MMM d yyyy): Jan 1 2020");
        testPrintWithMultiOption(dateArr[1],5,"My Date (mm-dd-yyyy): 01-01-2020");
        testPrintWithMultiOption(dateArr[1],7,"My Date : January 1st 2020"); 
        testPrintWithMultiOption(dateArr[0],6,"My Date : December 31th 2019");
        testPrintWithMultiOption(dateArr[2],6,"My Date : February 3rd 2021");
        testPrintWithMultiOption(dateArr[3],6,"My Date : March 2nd 2021");

        MyDate date2 = new MyDate("second","March","twenty hundred");
        testPrintWithMultiOption(date2,6,"My Date : March 2nd 2000");
        MyDate date3 = new MyDate("thirty-first","december","nineteen ninety-one");
        testPrintWithMultiOption(date3,6,"My Date : December 31th 1991");
        MyDate date4 = new MyDate("twenty-ninth","February","twenty eleven");
        testPrintWithMultiOption(date4,6,"My Date : February 29th 2011");

    }
}