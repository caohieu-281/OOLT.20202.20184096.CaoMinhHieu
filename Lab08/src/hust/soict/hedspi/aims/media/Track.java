package hust.soict.hedspi.aims.media;

public class Track implements playable {
	private String title;
	private int length;
	
	
	public Track() {
    }
	
	public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Track){
            Track track = (Track)o;
            if (this.title.equals(track.getTitle()) && this.length == track.getLength()) {
                return true;
            }
        }
        return false;
    }
    
	@Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
