package aimsproject;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > MAX_NUMBERS_ORDERED) {
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
}
