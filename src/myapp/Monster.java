package myapp;

public class Monster {
    
    // members
    String name;
    int hitPoint;
    int health;

    // constructor
    public Monster() { }

    // getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //methods
    public void hit (int damage) {
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Monster"
    }

    
}