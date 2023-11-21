package LU.LU21_11_2023.models;

public class Monster extends Entity implements Attacker, Damagable {
    private int health;
    private int damage;

    public Monster(String name) {
        super(name);
    }

    public Monster(String name, int health, int damage) {
        super(name);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attack(Monster character) {
        character.receiveDamage(this.damage);
    }

    @Override
    public void receiveDamage(int damage) {
        if (this.health > damage) {
            System.out.printf("%s received %d damage%n", this.name, damage);
            this.health -= damage;
            System.out.println(this);
        } else {
            System.out.printf("%s has died.%n", this.name);
            this.health -= damage;
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return String.format("%s : Health: %d, Damage: %d.", this.name, this.health, this.damage);
    }
}
