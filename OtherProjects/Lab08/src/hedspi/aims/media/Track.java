package hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public boolean equals(Track track) {
		if (track.title.equals(title) && track.length == length) {
			return true;
		}
		return false;
	}
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
}
