package myapp;

import java.util.LinkedList;
import java.util.List;

public class GameMain {

    // entry point

    public static void main (String[] args) {

        List<Troll> enemies = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            enemies.add(new Troll());
        }

        // for (int i = 0; i < enemies.size(); i++) {
        //     System.out.printf("%d: %s\n", i, enemies.get(i));
        // for-each loop
        Link link = new Link();
        for (Troll t: enemies) {
            link.hit(t);
            System.out.printf(">> %s\n", t);
        }
        }
    }
 
