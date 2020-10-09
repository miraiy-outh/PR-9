package com.company;

import java.awt.*;

public abstract class Shape {
    int x, y, wid, len;
    Color color[] = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.PINK, Color.MAGENTA,
            Color.ORANGE, Color.BLACK, Color.WHITE, Color.CYAN};
    public Shape(int x, int y, int wid, int len) {
        this.x = x;
        this.y = y;
        this.wid = wid;
        this.len = len;
    }
    public abstract void draw(Graphics g);
}
