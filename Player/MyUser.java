package player;

public class MyUser {

    private String userName;
    private MyPlaylist playlist;

    public MyUser(String userName) {
        this.userName = userName;
        playlist = new MyPlaylist();
    }

    public MyPlaylist getPlaylist() {
        return playlist;
    }
}
