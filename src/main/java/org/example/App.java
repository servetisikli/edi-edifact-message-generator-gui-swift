package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EDI Demo");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Input fields
        JTextField poField = new JTextField(20);          // Purchase Order
        JTextField productField = new JTextField(20);     // Product Code
        JTextField qtyField = new JTextField(5);          // Quantity
        JButton generateButton = new JButton("Generate Message");
        JTextArea messageArea = new JTextArea(15, 35);    // Display message
        messageArea.setEditable(false);

        generateButton.addActionListener(e -> {
            String po = poField.getText();
            String product = productField.getText();
            int qty;

            try {
                qty = Integer.parseInt(qtyField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Quantity must be a number!");
                return;
            }

            if (Validator.validateInput(po, product, qty)) {
                String msg = MessageGenerator.generateOrder(po, product, qty);
                messageArea.setText(msg);

                // Save to file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("order.edi"))) {
                    writer.write(msg);
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(frame, "Failed to save the file!");
                }

            } else {
                JOptionPane.showMessageDialog(frame, "All fields must be filled!");
            }
        });

        // Add components to frame
        frame.add(new JLabel("Purchase Order Number:"));
        frame.add(poField);
        frame.add(new JLabel("Product Code:"));
        frame.add(productField);
        frame.add(new JLabel("Quantity:"));
        frame.add(qtyField);
        frame.add(generateButton);
        frame.add(new JScrollPane(messageArea));

        frame.setVisible(true);
    }
}
