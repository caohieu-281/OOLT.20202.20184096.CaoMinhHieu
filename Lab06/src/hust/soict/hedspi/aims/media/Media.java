package hust.soict.hedspi.aims.media;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	
	public Media(String title) {
		setTitle(title);
	}
	
	public Media(String title, String category) {
		setTitle(title);
		setCategory(category);
	}
	
	public Media(String title, String category, float cost) {
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
