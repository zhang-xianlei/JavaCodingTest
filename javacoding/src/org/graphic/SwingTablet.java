package org.graphic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.*;

public class SwingTablet extends JFrame {
  private static String curPath = System.getProperty("user.dir");
  private static Icon images[] = {
      new ImageIcon(curPath + "/javacoding/testDir/1.png"),
      new ImageIcon(curPath + "/javacoding/testDir/2.png"),
      new ImageIcon(curPath + "/javacoding/testDir/3.png"),
      new ImageIcon(curPath + "/javacoding/testDir/4.png"),
      new ImageIcon(curPath + "/javacoding/testDir/5.png"),
      new ImageIcon(curPath + "/javacoding/testDir/6.png"),
  };
  private static int currentPage = 0;

  public SwingTablet(String title) {
    super(title);

    setResizable(false);
    getContentPane().setLayout(null);
    JLabel label = new JLabel(images[0]);
    label.setBounds(100, 20, 300, 200);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    getContentPane().add(label);

    JButton backButton = new JButton(new ImageIcon(curPath + "/javacoding/testDir/3.png"));
    backButton.setBounds(50, 220, 200, 200);
    getContentPane().add(backButton);

    JButton forwardButton = new JButton(new ImageIcon(curPath + "/javacoding/testDir/4.png"));
    forwardButton.setBounds(250,220,200,200);
    getContentPane().add(forwardButton);

    setSize(500, 500);
    setVisible(true);
    backButton.addActionListener((event) -> {
      if(currentPage < images.length - 1){
        currentPage++;
      }
      label.setIcon(images[currentPage]);
    });
    forwardButton.addActionListener((event) -> {
      if(currentPage > 0){
        currentPage--;
      }
      label.setIcon(images[currentPage]);
    });
  }

  public static void main(String[] args){
    new SwingTablet("SwingTablet");
  }
}
