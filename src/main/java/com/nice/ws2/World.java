package com.nice.ws2;

import java.awt.*;
import java.util.ArrayList;

public class World {
    int tickNumber;
    ArrayList<WorldObject> worldObjects;

    public World() {
        this.tickNumber = 0;
        worldObjects = new ArrayList<>();
        worldObjects.add(new Fox("Red1", 300, 10));
        worldObjects.add(new Fox("Red-red", 500, 0));
        worldObjects.add(new Fox("Red3", 100, 20));
        worldObjects.add(new Bird("Seagull", 400, (int) ((Math.random()) * 200)));
        worldObjects.add(new Bird("Kuku", 250, (int) ((Math.random()) * 200)));
        worldObjects.add(new Bird("Sokol", 550, (int) ((Math.random()) * 200)));
        worldObjects.add(new WorldObject());
    }

    public void doTick() {
        tickNumber++;
        for (WorldObject o : worldObjects) {
            o.doTick();
        }
    }

    public void paint(Graphics ig) {
        ig.setColor(Color.YELLOW);
        ig.drawString("Tick № " + tickNumber, 10, 14);
        for (WorldObject o : worldObjects) {
            o.paint(ig);
        }
    }
}
