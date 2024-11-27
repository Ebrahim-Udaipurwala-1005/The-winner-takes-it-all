package de.tum.cit.fop;

public abstract class Item {
    // TODO: Implement part 2.
    protected String specification;
    protected String type;
    protected boolean equipped;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;

    protected Item(String type) {
        this.type = type;
    }
}