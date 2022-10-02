package org.graphic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingTablet extends JFrame {
  private static Icon images[] = {
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/1.png"),
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/2.png"),
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/3.png"),
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/4.png"),
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/5.png"),
      new ImageIcon("/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/6.png"),
  };
  private static int currentPage = 0;

  public SwingTablet(String title) {
    super(title);

    setResizable(false);
    getContentPane().setLayout(null);
    JLabel label = new JLabel(images[0]);
    label.setBounds(94, 27, 100, 50);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    getContentPane().add(label);

    // JButton backButton
  }
}
