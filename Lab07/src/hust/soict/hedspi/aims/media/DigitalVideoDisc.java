package hust.soict.hedspi.aims.media;
import java.util.StringTokenizer;

public class DigitalVideoDisc extends Disc implements playable{
	public DigitalVideoDisc(String title, int length) {
		super(title, length);
	}
	
	public DigitalVideoDisc(String director, String title, String category, float cost, int length) {
		super(director, title, category, cost, length);
	}
	
	public DigitalVideoDisc(String title,String category, float cost) {
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String director, String title, String category, float cost) {
		super(director, title,category,cost);
	}

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
	
	public boolean search(String title) {
		StringTokenizer str_search = new StringTokenizer(title.toLowerCase());
		String str_title = this.title.toLowerCase();
		while (str_search.hasMoreTokens()) {
            if ( str_title.indexOf(str_search.nextToken()) == -1 )
            	return false;
        }
		return true;
	}
	
	public String toString() {
		return String.join("","DVD - ", super.getTitle()," - ",super.category," - ", super.getDirector()," - ",Integer.toString(super.getLength()),
								" : ",Float.toString(cost),"$" );
	}
	
	@Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
