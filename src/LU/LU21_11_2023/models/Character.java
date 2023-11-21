package LU.LU21_11_2023.models;

public class Character extends Entity implements Attacker, Damagable {
    private int health;
    private int damage;
    private int level;

    public Character(String name, int health, int damage, int level) {
        super(name);
        this.health = health;
        this.damage = damage;
        this.level = level;
    }

    @Override
    public void attack(Monster character) {
        character.receiveDamage(damage);
        if (character.getHealth() < this.damage) {
            System.out.printf("%s has won the game!%n", this.name);
            System.out.printf("%s has leveled up! Level: %d.%n", this.name, ++this.level);
            System.exit(0);
        }
        System.out.printf("%s attacking %s with %d damage.%n", this, character.getName(), this.damage);

    }

    @Override
    public void receiveDamage(int damage) {
        if (this.health > damage) {
            this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    public void levelUp() {
        this.level++;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("%s : Health: %d, Damage: %d", this.name, this.health, this.damage);
    }
}
