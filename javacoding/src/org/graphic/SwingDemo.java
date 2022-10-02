package org.graphic;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyFrame");
    JLabel label = new JLabel("Hello world");
    Container contentPan = frame.getContentPane();
    contentPan.add(label);
    frame.setSize(300, 300);
    // frame.setBackground("#ff0000");
    frame.setVisible(true);
  }
}
