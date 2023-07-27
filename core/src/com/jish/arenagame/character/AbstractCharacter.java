package com.jish.arenagame.character;

public class AbstractCharacter implements ICharacter {
    protected Character info;

    protected AbstractCharacter(Character info) {
        this.info = info;
    }

    public Character getInfo() {
        return info;
    }
}
