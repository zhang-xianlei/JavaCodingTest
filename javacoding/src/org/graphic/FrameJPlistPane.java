package org.graphic;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;


public class FrameJPlistPane extends JFrame{
    private String[] data = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png"};
    private String Curpath = (String) System.getProperty("user.dir");

    public FrameJPlistPane(String title){
        super(title);
        JPanel rightPane = new JPanel();
        rightPane.setLayout(new BorderLayout(0, 0));
        JLabel lblImage = new JLabel();
        lblImage.setHorizontalAlignment(SwingConstants.CENTER);
        rightPane.add(lblImage, BorderLayout.CENTER);

        JPanel leftPane = new JPanel();
        leftPane.setLayout(new BorderLayout(0,0));
        JList list1 = new JList(data);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(e -> {
            if(e.getValueIsAdjusting() == false){
                String itemString = (String) list1.getSelectedValue();
                String path = String.format("/javacoding/testDir/%s", itemString);
                Icon icon = new ImageIcon(Curpath + path);
                lblImage.setIcon(icon);
            }
        });
        leftPane.add(list1, BorderLayout.CENTER);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPane, rightPane);
        splitPane.setDividerLocation(100);
        getContentPane().add(splitPane, BorderLayout.CENTER);
        setSize(500, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FrameJPlistPane("FrameJPlistPane");
    }
    
}
