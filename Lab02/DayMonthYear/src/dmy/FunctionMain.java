package dmy;

public class FunctionMain {
	public boolean checkYear(int a) {
		return (a > 0);
	}
	
	public boolean isLeap(int year) {
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
           return false;
	}
	
	public int checkMonth(String mont) {
		if(mont.equals("1") || mont.equals("January") || mont.equals("Jan.") || mont.equals("Jan"))
			return 1;
		if(mont.equals("2") || mont.equals("February") || mont.equals("Feb.") || mont.equals("Feb"))
			return 2;
		if(mont.equals("3") || mont.equals("March") || mont.equals("Mar.") || mont.equals("Mar"))
			return 3;
		if(mont.equals("4") || mont.equals("April") || mont.equals("Apr.") || mont.equals("Apr"))
			return 4;
		if(mont.equals("5") || mont.equals("May"))
			return 5;
		if(mont.equals("6") || mont.equals("June") || mont.equals("Jun"))
			return 6;
		if(mont.equals("7") || mont.equals("July") || mont.equals("Jul"))
			return 7;
		if(mont.equals("8") || mont.equals("August") || mont.equals("Aug.") || mont.equals("Aug"))
			return 8;
		if(mont.equals("9") || mont.equals("September") || mont.equals("Sept.") || mont.equals("Sep"))
			return 9;
		if(mont.equals("10") || mont.equals("October") || mont.equals("Oct.") || mont.equals("Oct"))
			return 10;
		if(mont.equals("11") || mont.equals("November") || mont.equals("Nov.") || mont.equals("Nov"))
			return 11;
		if(mont.equals("12") || mont.equals("December") || mont.equals("Dec.") || mont.equals("Dec"))
			return 12;
		else
			return 0;
	}
	
	public void day(int month, boolean isLeap) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.println("31");
		if(month == 2 && isLeap == true)
			System.out.println("29");
		if(month == 2 && isLeap == false)
			System.out.println("28");
		if(month == 4 || month == 6 || month == 9 || month == 11)
			System.out.println("30");
	}
}
