package org.graphic;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameFlayout extends JFrame {
  JLabel label;

  public FrameFlayout(String title) {
    super(title);
    setLayout(new FlowLayout(FlowLayout.RIGHT));
    label = new JLabel("Label");
    getContentPane().add(label);

    JButton button1 = new JButton("button1");
    getContentPane().add(button1);

    JButton button2 = new JButton("button2");
    getContentPane().add(button2);

    JButton button3 = new JButton("button3");
    getContentPane().add(button3);

    setSize(350, 120);
    setVisible(true);

    button2.addActionListener((e) -> {
      label.setText("Hello button1 I want to see line break;");
    });
    button1.addActionListener((e) -> {
      label.setText("Hello button2");
    });
    button3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        label.setText("Hello everyone");
      }
    });
  }

  public static void main(String[] args) {
    new FrameFlayout("FrameLayout");
  }

}
