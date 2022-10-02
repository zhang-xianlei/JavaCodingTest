package org.graphic;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
  public MyFrame(String title) {
    super(title);
    JLabel label = new JLabel("Hello world");
    Container contentPane = getContentPane();
    contentPane.add(label);
    setSize(300, 300);
    setVisible(true);

  }
}
