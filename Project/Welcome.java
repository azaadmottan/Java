package net.banking;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome extends JFrame implements ActionListener {

    JPanel panel1, panel2, marginPanel1, marginPanel2;
    JLabel label1, label2, heading, loginHeading, transactionLabel, passwordLabel, signUpLabel, signUpLink;
    JButton depositButton, withDarawButton, fastCashButton, statementButton, pinButton, balanceButton, exitButton;
    String accountNo = "";

    public Welcome (String accountno) {

        this.accountNo = accountno;

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

        transactionLabel = new JLabel("Select Transaction");
        transactionLabel.setBounds(50, 140, 200, 22);
        transactionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        transactionLabel.setForeground(Color.WHITE);
        panel2.add(transactionLabel);

        depositButton = new JButton("Cash Deposit");
        depositButton.setBounds(50, 200, 180, 30);
        depositButton.setFont(new Font("Arial", Font.BOLD, 16));
        depositButton.setBackground(Color.BLUE);
        depositButton.setForeground(Color.WHITE);
        depositButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        depositButton.addActionListener(this);

        panel2.add(depositButton);

        withDarawButton = new JButton("Cash Withdraw");
        withDarawButton.setBounds(240, 200, 180, 30);
        withDarawButton.setFont(new Font("Arial", Font.BOLD, 16));
        withDarawButton.setBackground(Color.BLUE);
        withDarawButton.setForeground(Color.WHITE);
        withDarawButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        withDarawButton.addActionListener(this);

        panel2.add(withDarawButton);

        pinButton = new JButton("Pin Change");
        pinButton.setBounds(50, 260, 180, 30);
        pinButton.setFont(new Font("Arial", Font.BOLD, 16));
        pinButton.setBackground(Color.BLUE);
        pinButton.setForeground(Color.WHITE);
        pinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pinButton.addActionListener(this);

        panel2.add(pinButton);

        statementButton = new JButton("Mini Statement");
        statementButton.setBounds(240, 260, 180, 30);
        statementButton.setFont(new Font("Arial", Font.BOLD, 16));
        statementButton.setBackground(Color.BLUE);
        statementButton.setForeground(Color.WHITE);
        statementButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        statementButton.addActionListener(this);

        panel2.add(statementButton);

        fastCashButton = new JButton("Fast Cash");
        fastCashButton.setBounds(50, 320, 180, 30);
        fastCashButton.setFont(new Font("Arial", Font.BOLD, 16));
        fastCashButton.setBackground(Color.BLUE);
        fastCashButton.setForeground(Color.WHITE);
        fastCashButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fastCashButton.addActionListener(this);

        panel2.add(fastCashButton);

        balanceButton = new JButton("Check Balance");
        balanceButton.setBounds(240, 320, 180, 30);
        balanceButton.setFont(new Font("Arial", Font.BOLD, 16));
        balanceButton.setBackground(Color.BLUE);
        balanceButton.setForeground(Color.WHITE);
        balanceButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        balanceButton.addActionListener(this);

        panel2.add(balanceButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(50, 430, 180, 30);
        exitButton.setFont(new Font("Arial", Font.BOLD, 16));
        exitButton.setBackground(Color.BLUE);
        exitButton.setForeground(Color.WHITE);
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitButton.addActionListener(this);

        panel2.add(exitButton);

        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent ae) {

        if (ae.getSource() ==  exitButton) {

            System.exit(0);
        }

        if (ae.getSource() == depositButton) {

            setVisible(false);
            new DepositCashFrame(accountNo).setVisible(true);
        }

        if (ae.getSource() == withDarawButton) {

            setVisible(false);
            new WithdrawFrame(accountNo).setVisible(true);
        }

        if (ae.getSource() == pinButton) {

            setVisible(false);
            new PinChangeFrame(accountNo).setVisible(true);
        }

        if (ae.getSource() == statementButton) {

            setVisible(false);
            new MiniStatementFrame(accountNo).setVisible(true);
        }

        if (ae.getSource() == fastCashButton) {

            setVisible(false);
            new FastCashFrame(accountNo).setVisible(true);
        }

        if (ae.getSource() == balanceButton) {

            setVisible(false);
            new BalanceQueryFrame(accountNo).setVisible(true);
        }

    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Welcome ("");
            }
        });
    }
}
