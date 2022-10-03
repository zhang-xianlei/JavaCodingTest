package org.graphic;

import javax.swing.*;
import java.awt.*;

public class FrameNoLayout extends JFrame {

  public FrameNoLayout(String title) {
    super(title);
    setResizable(false);
    getContentPane().setLayout(null);
    JLabel label = new JLabel(
        "Label show the real content of the label see what inside the labelLabel show the real content of the label see what inside the label");

    label.setBounds(0, 200, 500, 300);
    // label.setHorizontalAlignment(SwingConstants.CENTER);
    getContentPane().add(label);

    JButton button1 = new JButton("button1");
    button1.setSize(89, 23);
    button1.setLocation(20, 30);
    JButton button2 = new JButton("button2");
    button2.setBounds(15, 150, 150, 30);
    getContentPane().add(button1);
    getContentPane().add(button2);
    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FrameNoLayout("NoLayout");
  }
}
