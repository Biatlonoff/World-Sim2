package com.nice.ws2;

import java.awt.*;

public class Bird extends WorldObject {
    public Bird(String name, int x, int h) {
        this.name = name;
        this.x = x;
        this.h = h;
    }

    @Override
    public void doTick() {
        //super.doTick();
        if (h < 100) {
            h++;
        } else {
            h--;
        }

    }

    @Override
    public void paint(Graphics ig) {
        //super.paint(ig);
        ig.setColor(Color.BLACK);
        ig.drawString("B:" + name, x, 410 - h);
    }
}
