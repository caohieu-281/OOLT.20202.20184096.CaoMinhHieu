
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());

	}

	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	
	// Please write a swap() method that can correctly swap the two objects.
	public static void Swap(DigitalVideoDisc o1, DigitalVideoDisc o2){
		String temp1 = o1.getTitle();
		o1.setTitle(o2.getTitle());
		o2.setTitle(temp1);
		
		String temp2 = o1.getCategory();
		o1.setCategory(o2.getCategory());
		o2.setCategory(temp2);

		String temp3 = o1.getDirector();
		o1.setDirector(o2.getDirector());
		o2.setDirector(temp3);

		int temp4 = o1.getLength();
		o1.setLength(o2.getLength());
		o2.setLength(temp4);

		float temp5 = o1.getCost();
		o1.setCost(o2.getCost());
		o2.setCost(temp5);
	}

}
