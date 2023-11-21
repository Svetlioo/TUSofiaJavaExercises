package LU.LU21_11_2023.models;

public abstract class Entity {
    protected String name;

    public String getName() {
        return name;
    }

    public Entity(String name) {
        this.name = name;
    }
}
