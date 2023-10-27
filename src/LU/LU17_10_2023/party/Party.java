package LU.LU17_10_2023.party;

public class Party {
    private Performance[] performances;

    public void startParty() {
        for (int i = 0; i < performances.length; i++) {
            performances[i].start();
        }
        System.out.println("Party started!");
    }

    public Party() {
        this.performances = new Performance[]{
                new DanceMove("nekuv tanc", 5),
                new BreakDanceMove("nekuv breik tanc", 7, 8),
                new Song("pesen na djamaikata", 3)
        };
    }

    public static void main(String[] args) {
        Party party1 = new Party();
        party1.startParty();
    }
}
