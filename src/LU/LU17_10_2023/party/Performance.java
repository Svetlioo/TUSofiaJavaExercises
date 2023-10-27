package LU.LU17_10_2023.party;

public abstract class Performance {
    protected String name;
    protected int duration;

    public Performance(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    protected void start() {
        System.out.printf("Starting the %s%n", this.name);
    }


}
