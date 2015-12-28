/**
 * File : Song.java
 * -----------------
 * Keeps track of the information for one song
 * in the music shop, including its name, the band
 * that it is by, and its price.
 */


public class Song {
	/**
	 * Counstructor
	 * @param songName song name , immutable
	 * @param bandName band name , immutable
	 * @param songPrice song price.
	 */
	public Song(String songName, String bandName, double songPrice) {
		title = songName;
		band = bandName;
		price = songPrice;
	}
	
	
	public String toString() {
		return ("\"" + title + "\" by " + band + " cost $" + price);
	}
	
	/* Private instance variables */
	private String title;
	private String band;
	private double price;
	
	public String getBand() {
		return band;
	}
	public double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
