package com.nice.ws2;

import java.awt.*;

public class Fox extends WorldObject {

    public Fox(String name, int x, int h) {
        this.name = name;
        this.x = x;
        this.h = h;
    }

    @Override
    public void paint(Graphics ig) {
        //super.paint(ig);
        ig.setColor(Color.BLACK);
        ig.drawString("F:" + name, x, 410 - h);
    }

    @Override
    public void doTick() {
        //super.doTick();
        if (h > 0) {
            h--;
        }
        x++;
    }
}
