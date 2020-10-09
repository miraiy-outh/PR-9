package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class Canvas  extends JPanel {
    List<Shape> shapes = new ArrayList<>();
    public Canvas() {
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape: shapes) {
            shape.draw(g);
        }
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }
}
