package hust.soict.hedspi.aims.media;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Book extends Media{
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List <String> contentTokens = new ArrayList<String>();
	private Map <String, Integer> wordFrequency = new TreeMap<>();
	
	public Book(int id, String title) {
		super.id = id;
		super.title = title;
		}
	public Book(int id, String title, String category) {
		super.id = id;
		super.title = title;
		super.category = category;
	}
	public Book(int id, String title, String category, float cost) {
		super.id = id;
		super.title = title;
		super.category = category;
		this.cost = cost;
	}
	public Book(String title, String category, List<String> authors) {
		super.title = title;
		super.category = category;
		this.authors = authors;
	}
	public Book(int id, String title, String category, List<String> authors, float cost) {
		super.id = id;
		super.title = title;
		super.category = category;
		super.cost = cost;
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author existed! Can not add!");
			return;
		}
		authors.add(authorName);
		System.out.println("Author add!");

	}
	
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			System.out.println("Can not find the author! Can not remove!");
			return;
		}
		authors.remove(authorName);
		System.out.println("Author is removed!");
	}
	
	public String displayInfo() {
		return String.join("","Book - ",title," - ",category," - ", authors.toString(),
				" : ",Float.toString(cost),"$" );
	}
	
	@Override
    public String showInfo() {
        return "Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Authors: " + getAuthors();
    }
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void processContent() {
		contentTokens.addAll(Arrays.asList(content.split(" ")));
		Collections.sort(contentTokens);
        Iterator<String> iterator = contentTokens.iterator();
        while(iterator.hasNext()) {
            String temp = iterator.next();
            if (!wordFrequency.containsKey(temp)) {
                wordFrequency.put(temp, 1);
            }else {
                int count = wordFrequency.get(temp);
                count++;
                wordFrequency.put(temp, count);
            }
        }
	}
	
	public String toString() {
        String show = "";
        show += "Id: " + super.getId()
        		+ "\nTitle: "	+ super.getTitle()
        		+ "\nCategory: " + super.getCategory()
		        + "\nCost: " + super.getCost()
		        + "\nAuthor: " + getAuthors()
		        + "\nContent: " + this.content
		        + "\nContent Length: " + this.contentTokens.size()
		        + "\nWork frequency \t" + "Word"
		        + "\nContent Token in sorted order: " + this.contentTokens;
        for(Map.Entry<String, Integer> entry: wordFrequency.entrySet()) {
            show += entry.getKey() + " - "+ entry.getValue() + "\n";
        }
        return show;
    }
}
