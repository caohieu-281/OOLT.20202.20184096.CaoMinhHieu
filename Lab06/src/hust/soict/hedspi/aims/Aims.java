package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	private static ArrayList<Order> Orders = new ArrayList<Order>();

	public static void createOrder() {
		if(Orders.size() < Order.MAX_LIMITED_ORDERS ) {
			Order newOrder = new Order();
			System.out.println("Order created. Id : " + Orders.size());
			Orders.add(newOrder);
		}
		else
			System.out.println("Max number of orders reached! Can not create!");
	}
	
	public static void addItem() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Please enter order id: ");
			int orderId = Integer.parseInt(keyboard.nextLine());
			if (orderId < 0 || orderId >= Orders.size()) {
				System.out.println("Invalid order id!");
				return;
			}
			System.out.println("Enter 1 to add a DVD, 2 to add a Book : ");
			int type = Integer.parseInt(keyboard.nextLine());
			if (type == 1) {
				System.out.println("Please enter title: ");
				String title = keyboard.nextLine();
				System.out.println("Please enter category: ");
				String category = keyboard.nextLine();
				System.out.println("Please enter director: ");
				String director = keyboard.nextLine();
				System.out.println("Please enter length: ");
				int length = keyboard.nextInt();
				System.out.println("Please enter cost: ");
				float cost = keyboard.nextFloat();
				DigitalVideoDisc item = new DigitalVideoDisc(title,category,director,length,cost);
				Orders.get(orderId).addMedia(item);
			}
			else if (type == 2){
				System.out.println("Please enter title: ");
				String title = keyboard.nextLine();
				System.out.println("Please enter category: ");
				String category = keyboard.nextLine();
				System.out.println("Please enter author: ");
				String author = keyboard.nextLine();
				List<String> authors = new ArrayList<String>();
				authors.add(author);
				System.out.println("Please enter cost: ");
				float cost = Float.parseFloat(keyboard.nextLine());
				Media item = new Book(title,category,authors,cost);
				Orders.get(orderId).addMedia(item);
			}
			else
				System.out.println("Invalid number!");
		}

	}
	public static void deleteItem() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Please enter order id: ");
			int orderId = Integer.parseInt(keyboard.nextLine());
			if (orderId < 0 || orderId >= Orders.size())
				System.out.println("Invalid order id!");
			else {
			System.out.println("Please enter item id : ");
			int itemId = Integer.parseInt(keyboard.nextLine());
			Orders.get(orderId).removeMedia(itemId);
			}
		}

	}
	public static void displayOrder() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Please enter order id: ");
			int orderId = Integer.parseInt(keyboard.nextLine());
			if (orderId < 0 || orderId >= Orders.size())
				System.out.println("Invalid order id!");
			else
				Orders.get(orderId).printInfo();
		}

	}
	public static void showMenu() {
		Scanner keyboard = new Scanner(System.in);
		int n, check = 0;
		do {
		System.out.println("\nOrder Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the item list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		n = keyboard.nextInt();
		switch(n) {
		case 0:
			System.out.println("Goodbye!");
			break;
		case 1:
			if (check == 0 ) check = 1;
			createOrder();			
			break;
		case 2:
			if (check == 0) {
				System.out.println("Create an order first!");
				break;
			}
			addItem();
			break;
		case 3:
			if (check == 0) {
				System.out.println("Create an order first!");
				break;
			}
			deleteItem();
			break;
		case 4:
			if (check == 0) {
				System.out.println("Create an order first!");
				break;
			}
			displayOrder();
			break;
		default:
			System.out.println("Invalid number!");
		}
		} while (n!=0);
		keyboard.close();
	}
	
	public static void main(String[] args) {
		showMenu();
	}
}
