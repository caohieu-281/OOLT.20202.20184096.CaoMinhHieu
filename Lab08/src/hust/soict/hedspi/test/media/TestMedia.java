package hust.soict.hedspi.test.media;
import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMedia {
	
	public static void test1() {
		System.out.println("Test 1");
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Roger Allers", "The Lion King", "Animation", 19.95f, 87);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "George Lucas", "Star Wars", "Science Fiction", 45.7f,34);	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "John Musker", "Aladdin", "Animation", 5.3f, 124);
		
		Collection collection = new ArrayList();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		Iterator iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The old DVDs: ");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		Collections.sort((java.util.List) collection); 
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The new DVDs: ");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
	}
	
	public static void test2() {
		System.out.println("\\n\\n*****Test 2*****");
		Book dvd1 = new Book(1,"The Lion King");
		dvd1.setCost(19.95f);
		
		CompactDisc dvd2 = new CompactDisc(2,"Star Wars");
		dvd2.setCost(24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(1, "John Musker", "Aladdin", 18.6f);		
		Collection collection = new ArrayList();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		Iterator iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The old lists: ");
		while(iterator.hasNext()) {
			System.out.println(((Media) iterator.next()).getTitle());
		}
		
		Collections.sort((java.util.List) collection); 
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The new lists: ");

		while(iterator.hasNext()) {
			System.out.println(((Media) iterator.next()).getTitle());
		}
	}
	
	public static void test3() {
		System.out.println("\n\n*****Test 3*****");
		Book book1 = new Book(1, "Roger Allers1", "The Lion King", 19.95f);		
		Book book2 = new Book(2, "Roger Allers", "The Lion King", 34.9f);		
		DigitalVideoDisc dvd = new DigitalVideoDisc(1, "John Musker", "Aladdin", 18.6f);		
		Collection collection = new ArrayList();
		collection.add(book1);
		collection.add(book2);
		collection.add(dvd);
		
		Iterator iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The old lists: ");
		while(iterator.hasNext()) {
			System.out.println(((Media) iterator.next()).getTitle());
		}
		
		Collections.sort((java.util.List) collection); 
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The new lists: ");

		while(iterator.hasNext()) {
			System.out.println(((Media) iterator.next()).getTitle());
		}
	}
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

}