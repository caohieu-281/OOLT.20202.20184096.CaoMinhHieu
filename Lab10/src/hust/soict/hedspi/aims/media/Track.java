package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements playable, Comparable<Track>{
    private String title;
    private int length;


    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }
    
    @Override
    public boolean equals(Object o){
    	if (o == null) {
            throw new NullPointerException();
        }
    	
        if(o instanceof Track) {
            if(length == ((Track) o).getLength() && title.equals(((Track) o).title)){
                return true;
            }
        }
        else
        	throw new ClassCastException("Can't cast to Track");
		return false;
    }
    
    public void play() throws PlayerException {
        System.out.println(" Playing Track: " + this.getTitle());
        if(this.length >0){
            System.out.println(" DVD Track: " + this.getLength());
        } else{
            throw new PlayerException("ERROR: CD length is non-positive");
        }
    }

    @Override
    public int compareTo(Track track) {
        if (this.getTitle().equals(track.getTitle())) {
            return this.getLength() - track.getLength();
        }
        return this.getTitle().compareTo(track.getTitle());
    }

    @Override
    public String toString() {
        String string = String.format("Track: %-30sLength:%-10d",this.getTitle(), this.getLength());
        string = "<html>" + string.replaceAll("<","&lt;").replaceAll(" ", "&nbsp;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>";
		return string;
    }
}