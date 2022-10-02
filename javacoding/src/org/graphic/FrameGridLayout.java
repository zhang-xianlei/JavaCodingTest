package org.graphic;

import javax.swing.*;
import java.awt.*;

public class FrameGridLayout extends JFrame {
  JLabel label;

  public FrameGridLayout(String title) {
    setLayout(new GridLayout(3, 3, 3, 3));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    getContentPane().add(new JButton("one"));
    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FrameGridLayout("GridLayout");
  }

}
