package com.nice.ws2;

import java.awt.*;

public class WorldObject {
    String name;
    int x;
    int h;

    public void doTick() {
        throw new RuntimeException("Method doTick for object "+ name + " not defined");
    }

    public void paint(Graphics ig) {
        //ig.setColor(Color.YELLOW);
        throw new RuntimeException("Method paint for object "+ name + " not defined");
        //ig.drawString("Tick № " + tickNumber, 10, 14);
    }
}
