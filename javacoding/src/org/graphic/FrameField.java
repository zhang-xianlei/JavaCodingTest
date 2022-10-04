package org.graphic;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameField extends JFrame {
    private JTextField textField;
    private JPasswordField passwordField;
    public FrameField(String title){
        super(title);
        getContentPane().setLayout(new BorderLayout());
        JPanel jPanel1 = new JPanel();
        getContentPane().add(jPanel1, BorderLayout.NORTH);
        JLabel fieldLabel = new JLabel("TextField:");
        jPanel1.add(fieldLabel);
        textField = new JTextField("Type name", 12);
        jPanel1.add(textField);
        JLabel passwordLabel = new JLabel("PasswordField:");
        jPanel1.add(passwordLabel);
        passwordField = new JPasswordField("type password",12);
        jPanel1.add(passwordField);
        JPanel jPanel2 = new JPanel();
        getContentPane().add(jPanel2, BorderLayout.SOUTH);
        JLabel textAreaLabel = new JLabel("TextareaField");
        jPanel2.add(textAreaLabel);
        JTextArea textAreaFeild = new JTextArea(3, 20);
        jPanel2.add(textAreaFeild);
        pack();
        setVisible(true);
        textField.addActionListener((e) -> {
            textAreaFeild.setText("type enter in textField");
        });
    }
    
    public static void main(String[] args){
        new FrameField("Field Pra");
    }
}
