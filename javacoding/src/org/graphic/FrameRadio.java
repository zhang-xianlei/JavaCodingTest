package org.graphic;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FrameRadio extends JFrame implements ItemListener{
    private static String curPath = System.getProperty("user.dir");

    private JRadioButton radioButton1 = new JRadioButton("man", false);
    private JRadioButton radioButton2 = new JRadioButton("woman", true);
    
    public FrameRadio(String title){
        super(title);

        getContentPane().setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) panel1.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);

        getContentPane().add(panel1, BorderLayout.NORTH);

        JLabel lbltextFieldLabel = new JLabel("select your favorite code language: ");
        panel1.add(lbltextFieldLabel);

        Icon images[] = {
            new ImageIcon(curPath +  "/javacoding/testDir/1.png")
        }; 
        JCheckBox checkbox1 = new JCheckBox("Java", images[0], true);
        panel1.add(checkbox1);
        JCheckBox checkbox2 = new JCheckBox("C++");
        panel1.add(checkbox2);
        JCheckBox checkbox3 = new JCheckBox("Object - C");
        panel1.add(checkbox3);

        JPanel panel2 = new JPanel();
        FlowLayout flowLayout_2 = (FlowLayout) panel2.getLayout();
        flowLayout_2.setAlignment(FlowLayout.LEFT);
        getContentPane().add(panel2, BorderLayout.SOUTH);

        JLabel lblTextAreaLabel = new JLabel("setlect sexual");
        panel2.add(lblTextAreaLabel);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        panel2.add(radioButton1);
        panel2.add(radioButton2);

        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);
        
        pack();

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            JRadioButton button = (JRadioButton) e.getItem();
            System.out.println(button.getText());
        }
    }

    public static void main(String[] args){
        new FrameRadio("Frame Radio");
    }
}
