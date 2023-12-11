package net.banking;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PinChangeFrame extends  JFrame implements  ActionListener{
    JPanel panel1, panel2, marginPanel1, marginPanel2;
    JLabel label1, label2, heading, loginHeading, transactionLabel, pinLabel, confirmPinLabel, accNoLabel, accNo;
    JButton savePin,  homeButton;
    JTextField pinField, confirmPinField;
    String strAccountNumber, last4Digits;

    Date date = new Date();
    public PinChangeFrame (String accountno) {


        this.strAccountNumber = accountno;

        last4Digits = strAccountNumber.substring(strAccountNumber.length() - 4);

        this.setSize(900, 650);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocation(240, 50);
        this.setLayout(new BorderLayout());

        this.setTitle("NET Banking");

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/rupee_logo.jpg"));
        Image scaledLogo = logo.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);

        this.setIconImage(scaledLogo);

        panel1 = new JPanel();
        panel2 = new JPanel();

        panel1.setPreferredSize(new Dimension(450, 325));
        panel2.setPreferredSize(new Dimension(450, 325));

        panel2.setBackground(Color.BLACK);

        //  Panel1 Design Here

        ImageIcon imageLogo1 = new ImageIcon(getClass().getResource("/images/online_banking.png"));
        Image scaledImage2 = imageLogo1.getImage().getScaledInstance(300, 180, Image.SCALE_SMOOTH);

        label1 = new JLabel(new ImageIcon(scaledImage2));

        marginPanel1 = new JPanel(new BorderLayout());
        marginPanel1.setBorder(new EmptyBorder(60, 0, 0, 0));

        marginPanel1.add(label1, BorderLayout.CENTER);

        panel1.add(marginPanel1, BorderLayout.CENTER);

        heading = new JLabel("Welcome to NET BANKING system");
        heading.setFont(new Font("Arial", Font.BOLD, 22));

        marginPanel2 = new JPanel(new BorderLayout());
        marginPanel2.setBorder(new EmptyBorder(60, 0, 0, 0));

        marginPanel2.add(heading, BorderLayout.CENTER);

        panel1.add(marginPanel2, BorderLayout.CENTER);

        //  Panel2 Design Here

        panel2.setLayout(null);

        loginHeading = new JLabel("Net Banking System");
        loginHeading.setFont(new Font("Arial", Font.BOLD, 24));
        loginHeading.setForeground(Color.WHITE);

        loginHeading.setBounds(115, 50, 250, 25);
        panel2.add(loginHeading);

        transactionLabel = new JLabel("Change Your Pin");
        transactionLabel.setBounds(50, 140, 200, 22);
        transactionLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        transactionLabel.setForeground(Color.WHITE);
        panel2.add(transactionLabel);

        accNoLabel = new JLabel("Account Number: ");
        accNoLabel.setBounds(50, 220, 200, 22);
        accNoLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        accNoLabel.setForeground(Color.WHITE);
        panel2.add(accNoLabel);

        accNo = new JLabel(strAccountNumber);
        accNo.setBounds(230, 220, 200, 22);
        accNo.setFont(new Font("Arial", Font.PLAIN, 18));
        accNo.setForeground(Color.WHITE);
        panel2.add(accNo);



        pinLabel = new JLabel("Enter New Pin: ");
        pinLabel.setBounds(50, 270, 200, 20);
        pinLabel.setFont(new Font("Arial", Font.ITALIC, 17));
        pinLabel.setForeground(Color.WHITE);

        panel2.add(pinLabel);

        pinField = new JTextField(50);
        pinField.setBounds(230, 270, 190, 25);
        pinField.setFont(new Font("Arial", Font.BOLD, 16));

        panel2.add(pinField);

        confirmPinLabel = new JLabel("Confirm New Pin: ");
        confirmPinLabel.setBounds(50, 320, 200, 20);
        confirmPinLabel.setFont(new Font("Arial", Font.ITALIC, 17));
        confirmPinLabel.setForeground(Color.WHITE);

        panel2.add(confirmPinLabel);

        confirmPinField = new JTextField(50);
        confirmPinField.setBounds(230, 320, 190, 25);
        confirmPinField.setFont(new Font("Arial", Font.BOLD, 16));

        panel2.add(confirmPinField);

        savePin = new JButton("Save & Change");
        savePin.setBounds(50, 380, 170, 30);
        savePin.setFont(new Font("Arial", Font.BOLD, 16));
        savePin.setBackground(Color.BLUE);
        savePin.setForeground(Color.WHITE);
        savePin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        savePin.addActionListener(this);

        panel2.add(savePin);


        homeButton = new JButton("Back To Home");
        homeButton.setBounds(50, 550, 150, 30);
        homeButton.setFont(new Font("Arial", Font.ITALIC, 16));
        homeButton.setBackground(Color.BLUE);
        homeButton.setForeground(Color.WHITE);
        homeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        homeButton.addActionListener(this);

        panel2.add(homeButton);

        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent ae) {

        if (ae.getSource() ==  homeButton) {

            setVisible(false);
            new Welcome(strAccountNumber).setVisible(true);
        }

        if (ae.getSource() == savePin) {

            String pin = pinField.getText();
            String cpin = confirmPinField.getText();

            if (pin.equals("") || cpin.equals("")) {

                JOptionPane.showMessageDialog(null, "Please Enter Pin !");
            }
            else {
                if (!pin.equals(cpin)) {

                    JOptionPane.showMessageDialog(null, "\nNew Pin and Confirm Pin doesn't match !\n");
                }

                if (pin.equals(cpin)) {

                    try {

                        Conn c1, c2;
                        c1 = new Conn();
                        c2 = new Conn();

                        String query1 = "update login set accountpin = '" + pin + "' where accountnumber = '" + strAccountNumber + "'";

                        String query2 = "update signupthree set accountpin = '" + pin + "' where accountnumber = '" + strAccountNumber + "'";


                        c1.s.executeUpdate(query1);
                        c2.s.executeUpdate(query2);

                        JOptionPane.showMessageDialog(null, "\nFor A/c XXXX-XXXX-XXXX-" + last4Digits + "\n\nPIN has been Updated Successfully !\n" + date);

                        pinField.setText("");
                        confirmPinField.setText("");
                    }
                    catch (Exception e) {

                        System.out.println(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new PinChangeFrame("");
            }
        });
    }
}
