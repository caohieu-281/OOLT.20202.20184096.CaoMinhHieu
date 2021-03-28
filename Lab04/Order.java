package aimsproject;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private int qtyOrdered = 0;
	private static int nbOrders = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private MyDate dateOrdered ;
	
	public Order(){
        if (nbOrders >= MAX_LIMITED_ORDERS) {
            System.out.println("The current number of orders is over this limited number, cannot make order!!!");
        }
        else {
            this.dateOrdered = new MyDate();
            nbOrders ++ ;
        }
    }
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		}
		else {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <= 0) {
			System.out.println("The disc is empty");
			return;
		}
		else {
			int tmp = qtyOrdered;
			for(int i =0; i < qtyOrdered; i++) {
				if(disc.equals(itemsOrdered[i])) {
					for (int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
					qtyOrdered--;
					i--;
					System.out.println("The disc" + disc.getTitle() + " has been remove");
					return;
				}
			}
			if (tmp == qtyOrdered)
				System.out.println("Cannot find!!!");
		}
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++)
			total += itemsOrdered[i].getCost();
		return total;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		}
		else {
			for (int i =0; i<dvdList.length; i++) {
				itemsOrdered[qtyOrdered++] = dvdList[i];
			}
			System.out.println("The disc has been added");
		}
	}
	
//    public void addDigitalVideoDisc(DigitalVideoDisc ... dvdList) {
//    	if(qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED) {
//			System.out.println("The order is almost full");
//		}
//		else {
//			for (int i =0; i<dvdList.length; i++) {
//				itemsOrdered[qtyOrdered++] = dvdList[i];
//			}
//			System.out.println("The disc has been added");
//		}
//    }
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		}
		
		if(qtyOrdered >= MAX_NUMBERS_ORDERED - 1) {
			itemsOrdered[qtyOrdered++] = dvd1;
			System.out.println("The disc" + dvd1.getTitle() + "has been added");
			System.out.println("The dvd" + dvd2.getTitle() + "could not added");
		}
		else {
			itemsOrdered[qtyOrdered++] = dvd1;
			itemsOrdered[qtyOrdered++] = dvd2;
			System.out.println("The dvds has been added");
		}
	}
	
    public void printInfo(){
        System.out.println("Date: " + dateOrdered.toString());
        System.out.println("Ordered Items : ");
        for (int i = 0 ; i < qtyOrdered;i++){
            System.out.println(i + 1 + " " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: "+ totalCost());
    }
	
}
