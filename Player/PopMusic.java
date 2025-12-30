package player;

public class PopMusic extends Music {

    public PopMusic(String name) {
     super (name);
    }

    @Override
    public void play() {
        System.out.println("Playing POP music: " + name);
    }
}
