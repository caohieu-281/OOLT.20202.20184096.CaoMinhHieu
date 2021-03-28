package aimsproject;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	public DigitalVideoDisc(String title,String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	public DigitalVideoDisc(String title,String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	
	public DigitalVideoDisc(String title,String category, String director,int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((category == null) ? 0 : category.hashCode());
//		result = prime * result + Float.floatToIntBits(cost);
//		result = prime * result + ((director == null) ? 0 : director.hashCode());
//		result = prime * result + length;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		DigitalVideoDisc other = (DigitalVideoDisc) obj;
//		if (category == null) {
//			if (other.category != null)
//				return false;
//		} else if (!category.equals(other.category))
//			return false;
//		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
//			return false;
//		if (director == null) {
//			if (other.director != null)
//				return false;
//		} else if (!director.equals(other.director))
//			return false;
//		if (length != other.length)
//			return false;
//		if (title == null) {
//			if (other.title != null)
//				return false;
//		} else if (!title.equals(other.title))
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DigitalVideoDisc) {
			DigitalVideoDisc tmp = (DigitalVideoDisc)obj;
			
			if (this.title == null && tmp.title != null)
				return false;
			if (this.title != null) {
				if (tmp.title == null)
					return false;
				else if (this.title.equals(tmp.title) == false)
					return false;
			}
			return true;
		}
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof DigitalVideoDisc) {
//			DigitalVideoDisc tmp = (DigitalVideoDisc)obj;
//			
//			if (this.title == null && tmp.title != null)
//				return false;
//			if (this.title != null) {
//				if (tmp.title == null)
//					return false;
//				else if (this.title.equals(tmp.title) == false)
//					return false;
//			}
//			
//			if (this.category == null && tmp.category != null)
//				return false;
//			if (this.category != null) {
//				if (tmp.category == null)
//					return false;
//				else if (this.category.equals(tmp.category) == false)
//					return false;
//			}
//			
//			if (this.director == null && tmp.director != null)
//				return false;
//			if (this.director != null) {
//				if (tmp.director == null)
//					return false;
//				else if (this.director.equals(tmp.director) == false)
//					return false;
//			}
//			
//			if (this.length != tmp.length)
//				return false;
//			
//			if (Float.floatToIntBits(this.cost) != Float.floatToIntBits(tmp.cost))
//				return false;
//			
//			return true;
//			}
//		return false;
//	}
}
