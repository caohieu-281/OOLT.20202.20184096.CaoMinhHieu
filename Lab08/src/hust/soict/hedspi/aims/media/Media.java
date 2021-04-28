package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media>{
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	
	public Media() {}
	
	public Media(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Media(int id, String title, String category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object o){
        if (o instanceof Media) {
        	Media media = (Media)o;
            if (this.id == media.getId()) {
                return true;
            }
        }
        return false;
    }
	
	public int compareString(String str1, String str2) {
        int lengthOfStr1 = str1.length();
        int lengthOfStr2 = str2.length();
        int shorter = Math.min(lengthOfStr1, lengthOfStr2);
        for (int i = 0; i < shorter; i++) {
            int charStr1 = (int) str1.charAt(i);
            int charStr2 = (int) str2.charAt(i);
            if (charStr1 != charStr2) {
                return charStr1 - charStr2;
            }
        }
        if (lengthOfStr1 != lengthOfStr2) {
            return lengthOfStr1 - lengthOfStr2;
        }
        else {
            return 0;
        }
    }
	
	public int compareTo(Media obj) {
		if(obj instanceof Media) {
			this.compareString(obj.getTitle(),this.getTitle());
		}
		return 1;
	}
	
	
	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public abstract String showInfo();
}
