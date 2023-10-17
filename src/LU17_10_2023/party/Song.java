package LU17_10_2023.party;

public class Song extends Performance {

    public Song(String name, int duration) {
        super(name, duration);
    }

    public void sing() {
        System.out.printf("Singing %s", this.name);
    }
}
