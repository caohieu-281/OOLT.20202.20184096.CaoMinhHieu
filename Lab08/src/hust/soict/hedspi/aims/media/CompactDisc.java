package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Media implements playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc(int id, String title) {
		super(id,title);
	}
	
	public CompactDisc(int id, String title, String category) {
		super(id,title,category);
	}
	
	public CompactDisc(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
	
	public CompactDisc(int id, String title, String category, float cost, String artist) {
		super(id,title,category,cost);
		this.artist = artist;
	}
	
	public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(id,title,category,cost);
		this.artist = artist;
		this.tracks = tracks;
	}
    
    public String getArtist() {
    	return this.artist;
    }
    
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    
	public boolean addTrack(Track track) {
		for (int i = 0; i < tracks.size();i++) {
            if (tracks.get(i).equals(track)){
                System.out.println("Already exist.");
                return false;
            }
        }
        tracks.add(track);
        return true;
    }
    
    public void removeTrack(Track track) {
    	int check = 0;
        for (int i = 0; i < tracks.size();i++) {
            if (tracks.get(i).equals(track)){
            	check = 1;
                break;
            }
        }
        if(check == 1)
            tracks.remove(track);
    	else
    		System.out.println("No exist!!!");
    }
    
    public int getLength() {
    	int totalLength = 0;
    	for (int i=0; i< tracks.size(); i++)
    		totalLength += tracks.get(i).getLength();
    	return totalLength;
    }
    
	@Override
    public void play(){
        for(int i = 0; i<tracks.size() ; i++){
            System.out.println("Playing CD: " + tracks.get(i).getTitle());
            System.out.println("CD length: " + tracks.get(i).getLength());
        }
    }
	
	@Override
	public int compareTo(Media obj) {
		if(obj instanceof CompactDisc) {
			CompactDisc cdisk = (CompactDisc) obj;
			if(cdisk.tracks.size() < this.tracks.size())
				return 1;
			else if(cdisk.tracks.size() > this.tracks.size())
				return -1;
			else {
				if(cdisk.getLength() < this.getLength())
					return 1;
				else if(cdisk.getLength() > this.getLength())
					return -1;
				else
					return super.compareTo(obj);
			}
		}
		else
			return super.compareTo(obj);
	}
	
	@Override
    public String showInfo() {
        return "- Title: " + getTitle() + ", Category: " + getCategory() + ", Length: " + getLength() + ", Price: "+ getCost() + ", Artist: " + getArtist();
    }
}
