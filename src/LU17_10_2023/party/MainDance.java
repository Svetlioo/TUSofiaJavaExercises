package LU17_10_2023.party;

public class MainDance {


    public static void main(String[] args) {
        DanceMove dancemove1 = new DanceMove("nekuv tanc", 5);
        BreakDanceMove breakdancemove1 = new BreakDanceMove("nekuv breik tanc", 8, 5);
        System.out.printf("dancemove1 is a %s%n", dancemove1.getClass());
        System.out.printf("breakdancemove1 is a %s%n", breakdancemove1.getClass());
        System.out.println((dancemove1 instanceof DanceMove));
    }
}
