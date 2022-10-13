package org.graphic;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class FrameTable extends JFrame{
    private double sWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private double sHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private JTable table;
    public FrameTable(String title){
        super(title);
        table = new JTable(rowData, columnNames);
        table.setFont(new Font("Microsoft Yahei", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("Microsoft Yahei", Font.BOLD, 16));
        table.setRowHeight(40);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel rowSM = table.getSelectionModel();
        /* rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting() == false) {
                    return;
                }
                ListSelectionModel lsm = (ListSelectionModel) e.getSource();
                if(lsm.isSelectionEmpty()){
                    System.out.println("not selected");
                } else {
                    int selectedRow = lsm.getMinSelectionIndex();
                    System.out.printf("get the %d row\n", selectedRow);
                }
            }
        }); */
        rowSM.addListSelectionListener(e -> {
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();
            if(lsm.isSelectionEmpty()){
                System.out.println("not been selected");
            } else {
                int slectRow = lsm.getMinSelectionIndex();
                System.out.printf("get the %d row\n", slectRow);
            }
        });
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setSize(960, 640);
        int x = (int)(sWidth - 960) / 2;
        int y = (int)(sHeight - 640) / 2;
        setLocation(x, y);
        setVisible(true);
    }

    String[] columnNames = {"book sn", "book name", "author", "publision", "publish time", "inventory data"};
    Object[][] rowData = {
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
        {"0036", "Math", "John", "sungrow power lcd", "19911124", 8},
    };
    public static void main(String[] args){
        new FrameTable("frame table");
    }
    
}
