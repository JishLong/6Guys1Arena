package com.jish.arenagame.character;

public enum Character {
    JOSH("Josh", 1, 1, 1, 1, 1, 1, 1);

    public final String name;
    public final int baseHealth;
    public final int baseMana;
    public final int baseRegen;
    public final int baseAttack;
    public final int baseDefense;
    public final int baseSpeed;
    public final int baseLuck;

    Character(String name, int baseHealth, int baseMana, int baseRegen, int baseAttack, int baseDefense,
              int baseSpeed, int baseLuck) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseMana = baseMana;
        this.baseRegen = baseRegen;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpeed = baseSpeed;
        this.baseLuck = baseLuck;
    }
}
