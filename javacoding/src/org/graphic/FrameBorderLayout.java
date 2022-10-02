package org.graphic;

import javax.swing.*;
import java.awt.*;

public class FrameBorderLayout extends JFrame {
  JLabel label;

  public FrameBorderLayout(String title) {
    super(title);
    setLayout(new BorderLayout(10, 10));
    getContentPane().add(new JButton("north"), BorderLayout.NORTH);
    getContentPane().add(new JButton("south"), BorderLayout.SOUTH);
    getContentPane().add(new JButton("west"), BorderLayout.WEST);
    getContentPane().add(new JButton("east"), BorderLayout.EAST);
    getContentPane().add(new JButton("center"), BorderLayout.CENTER);
    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FrameBorderLayout("BorderLayout");
  }
}
