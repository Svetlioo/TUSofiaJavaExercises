package LU.LU21_11_2023.models;

public class Item extends Entity {
    private AttributeBoost attributeBoost;

    public Item(String name, AttributeBoost attributeBoost) {
        super(name);
        this.attributeBoost = attributeBoost;
    }

    public AttributeBoost getAttributeBoost() {
        return attributeBoost;
    }
}
