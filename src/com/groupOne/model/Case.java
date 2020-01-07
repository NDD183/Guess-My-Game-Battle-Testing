package com.groupOne.model;

public class Case {
    // Create attributes for result model
    int id;
    int strikeValue;
    int hitValue;

    // Getter and Setter result model
    public Case(int id, int strikeValue, int hitValue) {
        this.id = id;
        this.strikeValue = strikeValue;
        this.hitValue = hitValue;
    }

    // Getter and Setter of each attributes of result model
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrikeValue() {
        return strikeValue;
    }

    public void setStrikeValue(int strikeValue) {
        this.strikeValue = strikeValue;
    }

    public int getHitValue() {
        return hitValue;
    }

    public void setHitValue(int hitValue) {
        this.hitValue = hitValue;
    }


}
