package LU24_10_2023;

public abstract class Character implements Playable {
    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public void attack(Character target) {
        target.health -= this.damage;
        System.out.printf("%s attacked %s for %d damage%n", this.getName(), target.getName(), this.getDamage());
        target.showInfo();
    }

    public boolean isAlive() {
        return this.health > 0;
    }


    public abstract void useAbility(Character target);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String showInfo() {
        return String.format("""
                %s, health: %d damage: %d""", this.name, this.health, this.damage);
    }
}
