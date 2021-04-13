package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc(String director, int length, String artist) {
        super(director, length);
        this.artist = artist;
    }

    public CompactDisc(String director, String title, String category, float cost, String artist) {
        super(director, title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String director, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(director, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    
    public String getArtist() {
    	return this.artist;
    }
    
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    
    public void addTrack(Track track) {
    	if(tracks.contains(track))
    		System.out.println("Already exist!!!");
    	else
    		tracks.add(track);
    }
    
    public void removeTrack(Track track) {
    	if(tracks.contains(track))
    		tracks.remove(track);
    	else
    		System.out.println("No exist!!!");
    }
    
    public int getLength(ArrayList<Track> tracks) {
    	int totalLength = 0;
    	for (int i=0; i< tracks.size(); i++)
    		totalLength += tracks.get(i).getLength();
    	super.length = totalLength;
    	return super.length;
    }
	@Override
    public void play(){
        for(int i = 0; i<tracks.size() ; i++){
            System.out.println("Playing CD: " + tracks.get(i).getTitle());
            System.out.println("CD length: " + tracks.get(i).getLength());
        }
    }
	
	@Override
    public String showInfo() {
        return "- Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost() + ", Artist: " + getArtist();
    }
}
