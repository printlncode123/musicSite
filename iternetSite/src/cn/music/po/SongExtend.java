package cn.music.po;

public class SongExtend{
	private String albumName;
	private Song song;
	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}


	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
}
