package org.graphic;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class FrameJList extends JFrame{
    private String[] s1 = {"java", "c++", "object-c"};
    public FrameJList(String title){
        super(title);
        JLabel lblTextFieldLabel = new JLabel("Select your coding language");
        getContentPane().add(lblTextFieldLabel, BorderLayout.NORTH);
        JList list1 = new JList(s1);
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list1.addListSelectionListener((e -> {
            if(e.getValueIsAdjusting() == false){
               List <String> itemString =  list1.getSelectedValuesList();
               for(Object item : itemString)
                System.out.println(item);
            }
        }));
        getContentPane().add(list1, BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        new FrameJList("JList pra");
    }
}
