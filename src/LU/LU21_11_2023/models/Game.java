package LU.LU21_11_2023.models;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Game {
    private final HashSet<Character> characters;
    private final HashSet<Monster> monsters;
    private final LinkedList<Item> items;

    public Game() {
        this.characters = new HashSet<>();
        this.monsters = new HashSet<>();
        this.items = new LinkedList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

    public void removeMonster(Monster monster) {
        this.monsters.remove(monster);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void attack(Character attacker, Monster target) {
        attacker.attack(target);
        // monster attack character
        Random random = new Random();
        AttributeBoost[] allAttributes = AttributeBoost.values();
        int randomIndex = random.nextInt(allAttributes.length);
        int randomNumber = random.nextInt(3);
        boolean attributeBoostOccured = false;
        // 1 in 3 chance to get a random item with random attributeboost
        if (randomNumber < 1) {
            Item item = new Item("nqkvo ime", allAttributes[randomIndex]);
            collectItem(attacker, item);
            this.items.add(item);
            attributeBoostOccured = true;
        }
        if (!attributeBoostOccured) return;
        int randomNumber2 = random.nextInt(10);
        // 1 in 30 chance to happen again (double boost)
        if (randomNumber2 < 1) {
            Item item = new Item("nqkvo ime", allAttributes[randomIndex]);
            collectItem(attacker, item);
            this.items.add(item);
        }

    }

    private void collectItem(Character character, Item item) {
        System.out.printf("%s has recieved %s%n", character.getName(), item.getAttributeBoost().name());
        if (item.getAttributeBoost() == AttributeBoost.DAMAGE_BOOST) {
            character.setDamage(character.getDamage() + 5);
        }
        if (item.getAttributeBoost() == AttributeBoost.HEAL) {
            character.setHealth(character.getHealth() + 20);
        }
    }

    public HashSet<Character> getCharacters() {
        return characters;
    }

    public HashSet<Monster> getMonsters() {
        return monsters;
    }

    public LinkedList<Item> getItems() {
        return items;
    }
}
