package hust.soict.hedspi.aims.media;

public class Disc extends Media{
	protected int length;
	protected String director;
	
	public int getLength() {
		return this.length;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public Disc(String director, int length) {
		this.director = director;
		this.length = length;
	}
	
	public Disc(String title,String category, float cost) {
		super.title = title;
		super.category = category;
		super.cost = cost;
	}
	
	public Disc(String director, String title, String category, float cost) {
		this.director = director;
		super.title = title;
		super.category = category;
		super.cost = cost;
	}
	
	public Disc(String director, String title, String category, float cost, int length) {
		this.director = director;
		super.title = title;
		super.category = category;
		super.cost = cost;
		this.length = length;
	}
	
	public String showInfo() {
		return "Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }
}
