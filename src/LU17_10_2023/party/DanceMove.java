package LU17_10_2023.party;

public class DanceMove extends Performance implements Danceable {


    public void perform(String name, int duration) {
        System.out.printf("Performing the %s for %d seconds%n", name, duration);
    }

    public DanceMove(String name, int duration) {
        super(name, duration);
    }


    @Override
    public void dance() {
        System.out.printf("Dancing the %s%n", this.name);
    }
}
