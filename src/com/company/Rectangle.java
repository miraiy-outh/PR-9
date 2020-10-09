package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int wid, int len) {
        super(x, y, wid, len);
    }

    @Override
    public void draw(Graphics g) {
        Random rand = new Random();
        int r2 = rand.nextInt(9);
        g.setColor(color[r2]);
        g.fillRect(x, y, wid, len);
    }
}
