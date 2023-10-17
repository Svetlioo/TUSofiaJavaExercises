package LU17_10_2023.party;

public class MainPerformance {


    public static void main(String[] args) {
        DanceMove dancemove1 = new DanceMove("nekuv tanc", 5);
        BreakDanceMove breakdancemove1 = new BreakDanceMove("nekuv breik tanc", 7, 8);
        Song song1 = new Song("pesen na djamaikata", 3);

        dancemove1.start();
        breakdancemove1.start();
        song1.start();
    }

}
