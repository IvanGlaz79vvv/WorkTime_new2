package org.Trash;

import org.example.Order;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
    String data = null;

    SimpleWindow(Order order, String path) {
        super(path);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel gridPanel = new JPanel(gbl);


//        JPanel panel = new JPanel();
//        JPanel gridPanel = new JPanel(new GridLayout());
//        gridPanel.setLayout(new FlowLayout());

/**Name*/



//        setContentPane(panel);
        setContentPane(gridPanel);

        JLabel nameLabel = new JLabel();
        JLabel orderLabel = new JLabel();
        JLabel timeLabel = new JLabel();

        /*nameLabel = new JLabel("Name", JLabel.LEFT);
        nameLabel.setBounds(20, 20, 350, 100);
        orderLabel = new JLabel("Order", JLabel.LEFT);
        orderLabel.setBounds(20, 20, 350, 100);
        timeLabel = new JLabel("Time", JLabel.LEFT);
        timeLabel.setBounds(20, 20, 350, 100);*/

        JTextField nameField = new JTextField(20);
        nameField.setEditable(true);
        nameField.setBounds(20, 50, 500, 20);

        JTextField orderField = new JTextField(20);
        orderField.setEditable(true);
        orderField.setBounds(20, 20, 500, 20);

        JTextField timeField = new JTextField(20);
        timeField.setEditable(true);
        timeField.setBounds(20, 100, 500, 20);

        gridPanel.setLayout(new FlowLayout());

        /*String user = order.getUser().name.toString();
        JButton nameButton = new JButton(user);
        nameButton.setBounds(50, 50, 100, 30);*/

//        nameButton.setBounds(50, 300, 100, 30);

//        JButton okButton = new JButton("OK");
//        okButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                data = "Name: " + new String(nameField.getText()) + "\nOrder: " + new String(orderField.getText()) + "\nTime: " + new String(timeField.getText());
//                JFrame jFrame = new JFrame("Info");
//                JLabel infoLabel = new JLabel(data);
//                jFrame.add(infoLabel);
//                jFrame.setBounds(20, 20, 300, 100);
//                jFrame.setVisible(true);
//                jFrame.setLocationRelativeTo(null);
//
//                System.out.println(data);
//            }
//        });
//
//        panel.add(okButton);
////        panel.add(nameButton);
////        String orderName = order.orderName.toString();
////        JButton orderButton = new JButton(orderName);
////        orderButton.setBounds(50, 100, 100, 30);
////        panel.add(orderButton);
////        String orderWorkTime = order.orderWorkTime.toString();
////        JButton timeButton = new JButton(orderWorkTime);
////        orderButton.setBounds(50, 150, 100, 30);
//


        setBounds(300, 300, 400, 200);
    }
}
