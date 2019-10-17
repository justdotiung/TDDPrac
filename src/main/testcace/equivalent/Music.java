package main.testcace.equivalent;

public class Music {

	private String songName;
	private String performerName;

	public Music(String songName, String performerName) {
		this.songName = songName;
		this.performerName = performerName;
	}

	public Object getPerformerName() {
		// TODO Auto-generated method stub
		return performerName;
	}

	public Object getSongName() {
		// TODO Auto-generated method stub
		return songName;
	}

	@Override
	public String toString() {
		return "Music [songName=" + songName + ", performerName=" + performerName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((performerName == null) ? 0 : performerName.hashCode());
		result = prime * result + ((songName == null) ? 0 : songName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (performerName == null) {
			if (other.performerName != null)
				return false;
		} else if (!performerName.equals(other.performerName))
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		return true;
	}
	
	
	
}
