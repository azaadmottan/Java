package net.banking;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class BalanceQueryFrame extends  JFrame implements  ActionListener{
    JPanel panel1, panel2, marginPanel1, marginPanel2;
    JLabel label1, label2, heading, loginHeading, transactionLabel, amountLabel, amountField, accNoLabel, accNo;
    JButton homeButton;
    //    JTextField amountField;
    String strAccountNumber, last4Digits;

    Date date = new Date();
    public BalanceQueryFrame (String accountno) {


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

        transactionLabel = new JLabel("Chack Account Balance");
        transactionLabel.setBounds(50, 140, 200, 22);
        transactionLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        transactionLabel.setForeground(Color.WHITE);
        panel2.add(transactionLabel);

        accNoLabel = new JLabel("Account Number: ");
        accNoLabel.setBounds(50, 220, 200, 22);
        accNoLabel.setFont(new Font("Arial", Font.ITALIC, 17));
        accNoLabel.setForeground(Color.WHITE);
        panel2.add(accNoLabel);

        accNo = new JLabel(strAccountNumber);
        accNo.setBounds(230, 220, 200, 22);
        accNo.setFont(new Font("Arial", Font.BOLD, 18));
        accNo.setForeground(Color.WHITE);
        panel2.add(accNo);



        amountLabel = new JLabel("Total Balance : ");
        amountLabel.setBounds(50, 270, 200, 20);
        amountLabel.setFont(new Font("Arial", Font.ITALIC, 17));
        amountLabel.setForeground(Color.WHITE);

        panel2.add(amountLabel);

        double balance = 0;

        try {

            Conn c = new Conn();

            ResultSet resultSet = c.s.executeQuery("select * from bank where accountNumber = '" + strAccountNumber + "'");


            while (resultSet.next()) {

                if (resultSet.getString("type").equals("Deposit")) {

                    balance += resultSet.getInt("amount");
                }
                else {

                    balance -= resultSet.getInt("amount");
                }
            }
        }
        catch (Exception e) {

            System.out.println(e);
        }

        amountField = new JLabel("Rs. " + balance + "0");
        amountField.setFont(new Font("Arial", Font.BOLD, 18));
        amountField.setBounds(230, 270, 190, 25);
        amountField.setForeground(Color.WHITE);

        panel2.add(amountField);

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


        try {

            Conn c = new Conn();

            ResultSet resultSet = c.s.executeQuery("select * from bank where accountNumber = '" + strAccountNumber + "'");

            double balance = 0;

            while (resultSet.next()) {

                if (resultSet.getString("type").equals("Deposit")) {

                    balance += resultSet.getInt("amount");
                }
                else {

                    balance -= resultSet.getInt("amount");
                }
            }

            amountField.setText("" + balance);

        }
        catch (Exception e) {

            System.out.println(e);
        }

    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new BalanceQueryFrame("");
            }
        });
    }
}
