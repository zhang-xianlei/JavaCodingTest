package org.graphic;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;

public class FrameJCombox extends JFrame{
    private JComboBox choice1;
    private JComboBox choice2;
    private String[] s1 = {"java", "c++", "Object-c"};
    private String[] s2 = {"woman", "man"};
    public FrameJCombox(String title){
        super(title);
        getContentPane().setLayout(new GridLayout(2,2,0,0));

        JLabel lblTextFeildLabel = new JLabel("Please select your coding language");
        lblTextFeildLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTextFeildLabel);
        choice1 = new JComboBox(s1);
        choice1.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String itemString = (String) cb.getSelectedItem();
            System.out.println(itemString);
        });
        getContentPane().add(choice1);

        JLabel lblTextAreaLabel = new JLabel("Please select your sexual");
        lblTextAreaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTextAreaLabel);
        choice2 = new JComboBox(s2);
        choice2.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                String itemString = (String) e.getItem();
                System.out.println(itemString);
            }
        });
        getContentPane().add(choice2);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args){
        new FrameJCombox("JComboBox");
    }
    
}
