package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements playable{

    public DigitalVideoDisc() {};	
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id,title,category,director,length, cost);
	}

	@Override
	public void print() {
		System.out.printf("Type: %-10sID: %-5dTitle: %-40sCategory: %-20sCost: %10.2f$%n", "DVD", this.getId(), this.getTitle(),this.getCategory(),this.getCost());
		System.out.printf("%20sDirector: %-36sLength: %-10d%n","",this.getDirector(),this.getLength());
	}
	
	@Override
	public void play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }else {
            throw new PlayerException("ERROR: DVD length is non-positive");
        }
    }
	
	@Override
    public int compareTo(Media media) {
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc disc = (DigitalVideoDisc) media;
            if (this.getCost() != disc.getCost()) {
                if (this.getCost() > disc.getCost()) {
					return 1;
				}
				return -1;
            }
            if (this.getLength() != disc.getLength()) {
                return this.getLength() - disc.getLength();
            }
            return this.getTitle().compareTo(disc.getTitle());
        }
        return 1;
    }

	@Override
    public String toString() {
        String string = String.format("Type: %-10sID: %-5dTitle: %-40sCategory: %-20sCost: %10.2f$%n", "DVD", this.getId(), this.getTitle(),this.getCategory(),this.getCost());
		string += String.format("%20sDirector: %-36sLength: %-10d","",this.getDirector(),this.getLength());
        string = "<html>" + string.replaceAll("<","&lt;").replaceAll(" ", "&nbsp;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>";
		return string;
    }
}