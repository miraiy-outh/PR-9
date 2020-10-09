package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window {
    private final Canvas panel = new Canvas();
    Window() {
        JFrame w = new JFrame();
        w.setSize(900, 700);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.add(panel);

        JButton button = new JButton("Нажми меня");
        w.add(button, BorderLayout.PAGE_START);
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shape[] = {"rectangle", "circle"};
                Random rand = new Random();
                int r1 = rand.nextInt(2);
                int x = rand.nextInt(900);
                int y = rand.nextInt(700);
                int wid = rand.nextInt(100);
                int len = rand.nextInt(100);
                switch (shape[r1]) {
                    case ("rectangle"):
                        panel.addShape(new Rectangle(x, y, wid, len));
                    break;
                    case ("circle"):
                        panel.addShape(new Circle(x, y, wid, len));
                    break;
                }
                //panel.addShape(new Rectangle(x, y, wid, len));
                //panel.addShape(new Circle(x, y, wid, len));
            }
        });
    }
}