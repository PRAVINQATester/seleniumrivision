package testng;


	import java.util.LinkedHashMap;
	import java.util.Map;

	public class RecentlyPlayedSongsStore {

	    private final int capacity;
	    private final Map<String, LinkedHashMap<String, String>> songs;

	    public RecentlyPlayedSongsStore(int capacity) {
	        this.capacity = capacity;
	        this.songs = new LinkedHashMap<>();
	    }

	    public void addSong(String song, String user) {
	        LinkedHashMap<String, String> userSongs = songs.get(user);
	        if (userSongs == null) {
	            userSongs = new LinkedHashMap<>();
	            songs.put(user, userSongs);
	        }

	        if (userSongs.size() >= capacity) {
	            userSongs.remove(userSongs.keySet().iterator().next());
	        }

	        userSongs.put(song, user);
	    }

	    public Map<String, String> getRecentlyPlayedSongs(String user) {
	        return songs.get(user);
	    }

	}


