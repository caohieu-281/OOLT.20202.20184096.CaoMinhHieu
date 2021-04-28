package hust.soict.hedspi.test.book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.*;

public class TestBook {
	public static void main(String[] args) {
		System.out.println("Test 1");
		Book book1 = new Book(1,"The Lion King");
		book1.setCost(19.95f);
		
		Book book2 = new Book(2,"Aladdin");
		book2.setCost(24.95f);
		
		Book book3 = new Book(3,"Aladdin");
		book3.setCost(18.99f);
		
		Collection collection = new ArrayList();
		collection.add(book1);
		collection.add(book2);
		collection.add(book3);
		
		Iterator iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The old list: ");
		
		while(iterator.hasNext()) {
			System.out.println(((Book) iterator.next()).getTitle());
		}
		
		Collections.sort((java.util.List) collection); 
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The new lists: ");
		
		while(iterator.hasNext()) {
			System.out.println(((Book) iterator.next()).getTitle());
		}
	}
}
