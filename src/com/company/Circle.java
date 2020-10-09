package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circle extends Shape {
    public Circle(int x, int y, int wid, int len) {
        super(x, y, wid, len);
    }

    @Override
    public void draw(Graphics g) {
        Random rand = new Random();
        int r2 = rand.nextInt(9);
        g.setColor(color[r2]);
        g.fillOval(x, y, wid, len);
    }
}