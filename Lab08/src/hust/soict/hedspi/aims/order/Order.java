package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.media.*;
import java.util.*;

public class Order {

    public static final int MAX_NUMBERS_ORDERED_ITEMS = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrder = 0;
    private int luckyItem = 0;
    private ArrayList <Media> itemsOrdered = new ArrayList <> ();
    Scanner sc = new Scanner(System.in);

    public int getLuckyItem() {
        return luckyItem;
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public static boolean checkNumberOfOrder() {
        return (nbOrder < 5);
    }

    public Order(){
        nbOrder++;
    }

    public void verifyOrderedItem() {
        int dem = itemsOrdered.size();
        if (dem < MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã được thêm vào Order");
        }
        if (dem == MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã được thêm vào Order,Order đã đầy");
        }
        if (dem > MAX_NUMBERS_ORDERED_ITEMS - 1 ) {
            System.out.println("Đã đầy, không thể thêm");
        }
    }

    public void addItem(Media item){
        verifyOrderedItem();
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED_ITEMS)
            itemsOrdered.add(item);
    }

    public void addItem(ArrayList<Media> items ){
        for(int i=0; i < items.size() ; i++){
            addItem(items.get(i));
        }
    }

    public void removeItem(Media item ){
        if(itemsOrdered.contains(item)){
            itemsOrdered.remove(item);
            System.out.println("removed from the list");
        } else System.out.println("Does not exist");
    }
    
    public void removeMedia(int id) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		else {
			itemsOrdered.removeIf(o->o.getId() == id);
			System.out.println("The item \"" + itemsOrdered.get(id).getTitle() + "\" with id " + id + " has been removed.");
		}
	}

    public void removeItem(ArrayList<Media> items ){
       items.clear();
    }
      
    public void show(ArrayList <Media> itemsOrdered) {
        System.out.println("------------------------------------");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + "." + itemsOrdered.get(i).showInfo());
        }
        System.out.println("------------------------------------");
    }
    
    public void printInfo(){
    	System.out.println("*********************************Order*********************************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++)
			System.out.println(i+1 + "." + itemsOrdered.get(i).toString());
		System.out.println("***********************************************************************");
		System.out.println("Total cost: " + totalCost() + "$");
        if (itemsOrdered.size()>=2)
			System.out.println("Lucky item for free: " + itemsOrdered.get(luckyItem).getTitle());
	}
    
    public float totalCost() {
        float tong = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            tong += itemsOrdered.get(i).getCost();
        }
        tong -= itemsOrdered.get(luckyItem).getCost();
        return tong;
    }
        
    public void randomLuckyItem() {
        int range = 10;
        this.luckyItem = (int) (Math.random() * range);
        if(luckyItem >= itemsOrdered.size()) this.luckyItem = itemsOrdered.size() - 1;
    }
   
}