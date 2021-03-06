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

    public void newItem(ArrayList <Media> itemsOrdered,int chon){
        sc.nextLine();
        System.out.print("Enter title: "); String title = sc.nextLine();
        System.out.print("Enter category: "); String category = sc.nextLine();
        System.out.print("Enter Cost: "); float cost = sc.nextFloat();
        sc.nextLine();
        if(chon == 1){
            System.out.print("Enter author: "); String author = sc.nextLine();
            Book bk = new Book(title,category,cost);
            bk.addAuthor(author);
            itemsOrdered.add(bk);
        }
        if(chon == 2){
            System.out.print("Enter director: "); String director = sc.nextLine();
            System.out.print("Enter artist: "); String artist = sc.nextLine();
            System.out.print("Enter the number of trasks: "); int number = sc.nextInt();
            ArrayList<Track> tracks = new ArrayList<>();
            sc.nextLine();
            for(int i = 0; i < number ; i++){
                System.out.print("Enter title of trask: "); String titletrask = sc.nextLine();
                System.out.print("Enter length of trask: "); int lengthtrack = sc.nextInt();
                sc.nextLine();
                Track track = new Track(titletrask,lengthtrack);
                tracks.add(track);
            }
            CompactDisc cd = new CompactDisc(director,title,category,cost,artist,tracks);
            cd.getLength(tracks);
            itemsOrdered.add(cd);
            System.out.println("Do you want to play?\n1.Yes  2.No");
            System.out.print("You choose: ");
            int chond = sc.nextInt();
            sc.nextLine();
            boolean checkd = true;
            do{
                switch(chond){
                    case 1:
                        cd.play();
                        checkd = false;
                        break;
                    case 2:
                        checkd = false;
                        break;
                    default:
                        System.out.println("Enter incorrectly, re-enter");
                        break; 
                }
            }while(checkd);
        }
        if(chon == 3){
            System.out.print("Enter director: "); String director = sc.nextLine();
            System.out.print("Enter length: "); int length = sc.nextInt();
            DigitalVideoDisc disc = new DigitalVideoDisc(director, title,category,cost, length);
            itemsOrdered.add(disc);
            System.out.println("Do you want to play?\n1.Yes  2.No");
            System.out.print("You choose: ");
            int chond = sc.nextInt();
            sc.nextLine();
            boolean checkd = true;
            do{
                switch(chond){
                    case 1:
                        disc.play();
                        checkd = false;
                        break;
                    case 2:
                        checkd = false;
                        break;
                    default:
                        System.out.println("Enter incorrectly, re-enter");
                        break; 
                }
            }while(checkd);
        }
        
    }
}