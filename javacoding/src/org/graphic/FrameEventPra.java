package org.graphic;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameEventPra extends JFrame {
  JLabel label;

  public FrameEventPra(String title) {
    super(title);
    label = new JLabel("Label");
    getContentPane().add(label, BorderLayout.NORTH);

    JButton button1 = new JButton("Button1");
    getContentPane().add(button1, BorderLayout.CENTER);

    JButton button2 = new JButton("Button2");
    getContentPane().add(button2, BorderLayout.SOUTH);

    setSize(350, 108);
    setVisible(true);

    button2.addActionListener(new ActionEventHandler());

    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        label.setText("Hello world!");
      }
    });
  }

  class ActionEventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      label.setText("Hello a new world!");
    }
  }
}
