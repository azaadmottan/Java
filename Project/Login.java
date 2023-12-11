package net.banking;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JPanel panel1, panel2, marginPanel1, marginPanel2;
    JLabel label1, heading, loginHeading, usernameLabel, passwordLabel, signUpLabel, signUpLink;
    JButton loginButton;
    JTextField usernameField, passwordField;

    public Login() {
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

        loginHeading = new JLabel("Login Now");
        loginHeading.setFont(new Font("Arial", Font.BOLD, 24));
        loginHeading.setForeground(Color.WHITE);

        loginHeading.setBounds(170, 50, 150, 25);
        panel2.add(loginHeading);



        // Create components for the right panel
        usernameLabel = new JLabel("Account No. :");
        usernameLabel.setBounds(50, 140, 130, 20);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        usernameLabel.setForeground(Color.WHITE);

        panel2.add(usernameLabel);

        usernameField = new JTextField(50);
        usernameField.setBounds(180, 140, 220, 25);
        usernameField.setFont(new Font("Arial", Font.BOLD, 16));

        panel2.add(usernameField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 200, 100, 20);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 18));
        passwordLabel.setForeground(Color.WHITE);

        panel2.add(passwordLabel);

        passwordField = new JPasswordField(50);
        passwordField.setBounds(180, 200, 220, 25);
        passwordField.setFont(new Font("Arial", Font.BOLD, 16));

        panel2.add(passwordField);

        signUpLabel = new JLabel("Don't have an account: ");
        signUpLabel.setBounds(50, 280, 210, 20);
        signUpLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signUpLabel.setForeground(Color.WHITE);

        panel2.add(signUpLabel);

        signUpLink = new JLabel("SignUp Now");
        signUpLink.setBounds(260, 280, 300, 20);
        signUpLink.setFont(new Font("Arial", Font.BOLD, 18));
        signUpLink.setForeground(Color.BLUE);

        signUpLink.setCursor(new Cursor(Cursor.HAND_CURSOR));

        signUpLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                System.out.println("signup link clicked");
                setVisible(false);

                new SignUpOne().setVisible(true);              // Open Sign Form
            }
        });

        panel2.add(signUpLink);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 350, 180, 30);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);

        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        loginButton.addActionListener(this);
        panel2.add(loginButton);


        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent ae) {

        if (ae.getSource() ==  loginButton) {
//            System.out.println("Login button clicked");
            String accountNumber = usernameField.getText();
            String password = passwordField.getText();

            if (accountNumber.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "All Fields are Required !");
            }
            else {
                String query = "select * from login where accountnumber = '"+accountNumber+"' and accountpin = '"+password+"'";

                try {

                    Conn c = new Conn();

                    ResultSet rs = c.s.executeQuery(query);

                    if (rs.next()) {

                        setVisible(false);
                        new Welcome(accountNumber).setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid Account Number or Pin !");
                    }
                }
                catch (Exception e) {

                    System.out.println(e);
                }


            }
        }
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Login();
            }
        });
    }
}
