package LU.LU17_10_2023.party;

public class DJ implements Playable {
    public void playSong(Song song) {
        System.out.println(song);
    }

    @Override
    public void play() {
        System.out.println("Djamaikata sviri");
    }
}
