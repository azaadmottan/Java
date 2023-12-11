package net.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {

    JLabel labelLogo, signUpHeading, pageNo, religionLabel, cardLabel, cardNoLabel, cardDetail, pinLabel, pinNoLabel, pinDetail, serviceLabel;
    JRadioButton savAccount, currAccount, fixedAccount, recurrAccount;
    ButtonGroup accountTypeGroup;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;

    String formNo;

    public SignUpThree(String formno) {

        this.formNo = formno;

        this.setSize(900, 700);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocation(240, 25);
        this.setLayout(null);

        this.setTitle("NET Banking");

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/rupee_logo.jpg"));
        Image scaledLogo = logo.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);

        this.setIconImage(scaledLogo);

        ImageIcon imageLogo1 = new ImageIcon(getClass().getResource("/images/online_banking.png"));
        Image scaledImage2 = imageLogo1.getImage().getScaledInstance(150, 90, Image.SCALE_SMOOTH);
        labelLogo = new JLabel(new ImageIcon(scaledImage2));
        labelLogo.setBounds(50, 0, 150, 150);

        add(labelLogo);

        signUpHeading = new JLabel("Register Now");
        signUpHeading.setFont(new Font("Arial", Font.BOLD, 30));
        signUpHeading.setBounds(370, 50, 200, 32);

        add(signUpHeading);

        pageNo = new JLabel("Page-3 (Account Details.)");
        pageNo.setFont(new Font("Arial", Font.BOLD, 20));
        pageNo.setBounds(580, 150, 350, 25);

        add(pageNo);

        religionLabel = new JLabel("Account Type ");
        religionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        religionLabel.setBounds(100, 200, 150, 20);
        add(religionLabel);

        savAccount = new JRadioButton("Saving Account");
        currAccount = new JRadioButton("Current Account");
        fixedAccount = new JRadioButton("Fixed Deposit Account");
        recurrAccount = new JRadioButton("Recurring Deposit Account");

        savAccount.setBounds(100, 240, 300, 20);
        savAccount.setFont(new Font("Arial", Font.BOLD, 16));
        add(savAccount);

        currAccount.setBounds(450, 240, 300, 20);
        currAccount.setFont(new Font("Arial", Font.BOLD, 16));
        add(currAccount);


        fixedAccount.setBounds(100, 270, 300, 20);
        fixedAccount.setFont(new Font("Arial", Font.BOLD, 16));
        add(fixedAccount);

        recurrAccount.setBounds(450, 270, 300, 20);
        recurrAccount.setFont(new Font("Arial", Font.BOLD, 16));
        add(recurrAccount);

        accountTypeGroup = new ButtonGroup();

        accountTypeGroup.add(savAccount);
        accountTypeGroup.add(currAccount);
        accountTypeGroup.add(fixedAccount);
        accountTypeGroup.add(recurrAccount);

        cardLabel = new JLabel("Card Number ");
        cardLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cardLabel.setBounds(100, 310, 350, 20);

        add(cardLabel);

        cardNoLabel = new JLabel("XXXX-XXXX-XXXX-XXXX");
        cardNoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cardNoLabel.setBounds(450, 310, 350, 20);

        add(cardNoLabel);

        cardDetail = new JLabel("16-digit Account Number.");
        cardDetail.setFont(new Font("Arial", Font.ITALIC, 16));
        cardDetail.setBounds(450, 330, 350, 20);

        add(cardDetail);

        pinLabel = new JLabel("PIN");
        pinLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pinLabel.setBounds(100, 370, 350, 20);

        add(pinLabel);

        pinNoLabel = new JLabel("XXXX");
        pinNoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pinNoLabel.setBounds(450, 370, 350, 20);

        add(pinNoLabel);

        pinDetail = new JLabel("4-digit Pin Number.");
        pinDetail.setFont(new Font("Arial", Font.ITALIC, 16));
        pinDetail.setBounds(450, 390, 350, 20);

        add(pinDetail);

        serviceLabel = new JLabel("Service Required");
        serviceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        serviceLabel.setBounds(100, 420, 350, 20);

        add(serviceLabel);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Arial", Font.BOLD, 16));
        c1.setBounds(100, 460, 180, 20);

        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Arial", Font.BOLD, 16));
        c2.setBounds(300, 460, 180, 20);

        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Arial", Font.BOLD, 16));
        c3.setBounds(550, 460, 180, 20);

        add(c3);

        c4 = new JCheckBox("E-Statement");
        c4.setFont(new Font("Arial", Font.BOLD, 16));
        c4.setBounds(100, 490, 180, 20);

        add(c4);

        c5 = new JCheckBox("Email & SMS alerts");
        c5.setFont(new Font("Arial", Font.BOLD, 16));
        c5.setBounds(300, 490, 180, 20);

        add(c5);

        c6 = new JCheckBox("Cheque Book");
        c6.setFont(new Font("Arial", Font.BOLD, 16));
        c6.setBounds(550, 490, 180, 20);

        add(c6);


        c7 = new JCheckBox("I hereby declared that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Arial", Font.BOLD, 16));
        c7.setBounds(100, 540, 700, 20);

        add(c7);


        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial", Font.ITALIC, 20));
        submit.setBounds(240, 600, 100, 25);

        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.addActionListener(this);

        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Arial", Font.ITALIC, 20));
        cancel.setBounds(540, 600, 100, 25);

        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.addActionListener(this);

        add(cancel);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent ae) {

        if (c7.isSelected()) {

            if (ae.getSource() == submit) {

                String accType = "";

                if (savAccount.isSelected()) {
                    accType = "Saving Account";
                }
                else if (currAccount.isSelected()) {
                    accType = "Current Account";
                }
                else if (fixedAccount.isSelected()) {
                    accType = "Fixed Deposit Account";
                }
                else if (recurrAccount.isSelected()) {
                    accType = "Recurring Deposit Account";
                }

                Random random = new Random();

                String accountNumber = "" + Math.abs((random.nextLong() % 90000000L) + 2023153875000000L);
                String pinNumber = String.format("%04d", Math.abs((random.nextLong() % 9000L) + 1000L));

                String service = "";

                if (c1.isSelected()) {
                    service += " ATM Card";
                }
                if (c2.isSelected()) {
                    service += " Internet Banking";
                }
                if (c3.isSelected()) {
                    service += " Mobile Banking";
                }
                if (c4.isSelected()) {
                    service += " E-Statement";
                }
                if (c5.isSelected()) {
                    service += " Email & SMS alerts";
                }
                if (c6.isSelected()) {
                    service += " Cheque Book";
                }

                if (accType.equals("") || service.equals("")) {

                    JOptionPane.showMessageDialog(null, "All Fields are Required");
                }
                else {

                    try {
                        Conn c = new Conn();

                        String query1 = "insert into signupthree (formno, acctype, accountnumber, accountpin, service) values ('" + formNo + "', '" + accType + "', '" + accountNumber + "', '" + pinNumber + "', '" + service + "')";
                        String query2 = "insert into login (formno, accountnumber, accountpin) values ('" + formNo + "', '" + accountNumber + "', '" + pinNumber + "')";

                        c.s.executeUpdate(query1);
                        c.s.executeUpdate(query2);

                        JOptionPane.showMessageDialog(null, "SAVE YOUR ACCOUNT DETAILS\n\nAccount Number: " + accountNumber + "\nPin: " + pinNumber);

                        setVisible(false);
                        new DepositCashFrame(accountNumber);
                    }
                    catch (Exception e) {

                        System.out.println(e);
                    }

                }
            }
        }
        else if (ae.getSource() == cancel) {

            System.exit(0);
        }
        else {

            JOptionPane.showMessageDialog(null, "Accept The Terms & Conditions !");
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignUpThree("");
            }
        });
    }
}
