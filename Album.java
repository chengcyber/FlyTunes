/**
 * File: Album.java
 * ----------------
 * keeps track of all the information for one album
 * in the music shop, including its name, the band that
 * its by, and the list of songs it contains.
 */

import java.util.*;

public class Album {
	
	/**
	 * Constructor
	 * Note that the album name and band name are immutable
	 * @param albumName
	 * @param bandName
	 */
	public Album(String albumName, String bandName) {
		title = albumName;
		band = bandName;
	}
	
	/* Private instance variables */
	private String title;
	private String band;
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public String getBand() {
		return band;
	}
	public Iterator<Song> getSongs() {
		return songs.iterator();
	}
	public String getTitle() {
		return title;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public String toString() {
		return ("\"" + title + "\" by " + band);
	}
	
}
