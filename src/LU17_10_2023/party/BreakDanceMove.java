package LU17_10_2023.party;

public class BreakDanceMove extends DanceMove {
    private int complexity;

    public BreakDanceMove(String name, int duration, int complexity) {
        super(name, duration);
        this.complexity = complexity;
    }

    @Override
    public void perform(String name, int complexity) {
        super.perform(name, complexity);
    }
}
