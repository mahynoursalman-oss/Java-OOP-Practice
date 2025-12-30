package player;

import java.util.ArrayList;

public class MyPlaylist {

    private ArrayList<Music> musicList;

    public MyPlaylist() {
        musicList = new ArrayList<>();
    }

    public void addMusic(Music m) {
        musicList.add(m);
    }

    public ArrayList<Music> getMusicList() {
        return musicList;
    }
}
