package myapp;

public class Link {
    
    public Link() {}

    public void hit(Monster monster) {
        if (monster.isDead())
            return;
        System.out.println("Hiya...");
        monster.hit(3);
    }
    public void hit(Tree tree) {
        tree.hit(3);
    }
}
