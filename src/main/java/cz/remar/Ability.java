package cz.remar;

public enum Ability {
    ATTACK("Attack is the ability to deal damage. Final damage is also affected by dexterity and skills."),
    DEFENCE("Defence is the ability to reduce damage. Final damage is also affected by dexterity a."),
    DEXTERITY("Dexterity is important for both attack and defence. It affects final damage and final damege reduction."),
    SKILL("Skill is important for attack and lso for critical hit chance"),
    LUCK("Luck is important for critical hit chance."),
    HEALTH("Health is the amount of damage zou can take before you die. After each battle, health can be restored to full");

    private final String description;

    Ability(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
