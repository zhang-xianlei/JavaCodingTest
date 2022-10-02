package org.graphic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameEventLambda extends JFrame implements ActionListener {
  JLabel label;

  public FrameEventLambda(String title) {
    super(title);
    label = new JLabel("Label");
    getContentPane().add(label, BorderLayout.NORTH);
    JButton button1 = new JButton("button1");
    getContentPane().add(button1, BorderLayout.CENTER);
    JButton button2 = new JButton("button2");
    getContentPane().add(button2, BorderLayout.SOUTH);
    setSize(300, 108);
    setVisible(true);
    button2.addActionListener(this);
    button1.addActionListener((event) -> {
      label.setText("Hello button2");
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    label.setText("Hello button1!");
  }

  public static void main(String[] args) {
    new FrameEventLambda("lambda frame event");

  }
}
