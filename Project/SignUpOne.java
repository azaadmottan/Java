package net.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// Date Picker
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

    JLabel labelLogo, signUpHeading, applFormNo, pageNo, name, fName, dob, gender, email, status, address, city, state, pinCode;
    JTextField nameField, fNameField, dobField, genderField, emailField, statusField, addressField, cityField, stateField, pinCodeField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, unmarried;
    ButtonGroup genderGroup1, marriedGroup2;
    Random ranNo = new Random();
    long formNo = Math.abs((ranNo.nextLong()) % 9000L + 10000L);

    public SignUpOne() {

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

        applFormNo = new JLabel("APPLICATION FORM NO.: " + formNo);
        applFormNo.setFont(new Font("Arial", Font.BOLD, 20));
        applFormNo.setBounds(50, 150, 350, 25);

        add(applFormNo);


        pageNo = new JLabel("Page-1 (Personal Details.)");
        pageNo.setFont(new Font("Arial", Font.BOLD, 20));
        pageNo.setBounds(580, 150, 350, 25);

        add(pageNo);

        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 16));
        name.setBounds(100, 200, 150, 20);

        add(name);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 16));
        nameField.setBounds(400, 200, 350, 20);

        add(nameField);

        fName = new JLabel("Father's Name: ");
        fName.setFont(new Font("Arial", Font.BOLD, 16));
        fName.setBounds(100, 240, 350, 20);

        add(fName);

        fNameField = new JTextField();
        fNameField.setFont(new Font("Arial", Font.BOLD, 16));
        fNameField.setBounds(400, 240, 350, 20);

        add(fNameField);

        dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Arial", Font.BOLD, 16));
        dob.setBounds(100, 280, 350, 20);

        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(400, 280, 350, 20);
        dateChooser.setForeground(new Color(105, 105, 105));

        add(dateChooser);


        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 16));
        gender.setBounds(100, 320, 350, 20);

        add(gender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(400, 320, 100, 20);
        male.setFont(new Font("Arial", Font.BOLD, 16));
        add(male);

        female.setBounds(500, 320, 100, 20);
        female.setFont(new Font("Arial", Font.BOLD, 16));
        add(female);

        genderGroup1 = new ButtonGroup();

        genderGroup1.add(male);
        genderGroup1.add(female);


        email = new JLabel("Email-Id: ");
        email.setFont(new Font("Arial", Font.BOLD, 16));
        email.setBounds(100, 360, 350, 20);

        add(email);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 16));
        emailField.setBounds(400, 360, 350, 20);

        add(emailField);

        status = new JLabel("Martial Status: ");
        status.setFont(new Font("Arial", Font.BOLD, 16));
        status.setBounds(100, 400, 350, 20);

        add(status);


        married = new JRadioButton("Married");
        unmarried = new JRadioButton("Unmarried");

        married.setBounds(400, 400, 100, 20);
        married.setFont(new Font("Arial", Font.BOLD, 16));
        add(married);

        unmarried.setBounds(500, 400, 120, 20);
        unmarried.setFont(new Font("Arial", Font.BOLD, 16));
        add(unmarried);

        marriedGroup2 = new ButtonGroup();

        marriedGroup2.add(married);
        marriedGroup2.add(unmarried);


        address = new JLabel("Address: ");
        address.setFont(new Font("Arial", Font.BOLD, 16));
        address.setBounds(100, 440, 350, 20);

        add(address);

        addressField = new JTextField();
        addressField.setFont(new Font("Arial", Font.BOLD, 16));
        addressField.setBounds(400, 440, 350, 20);

        add(addressField);

        city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 16));
        city.setBounds(100, 480, 350, 20);

        add(city);

        cityField = new JTextField();
        cityField.setFont(new Font("Arial", Font.BOLD, 16));
        cityField.setBounds(400, 480, 350, 20);

        add(cityField);

        state = new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 16));
        state.setBounds(100, 520, 350, 20);

        add(state);

        stateField = new JTextField();
        stateField.setFont(new Font("Arial", Font.BOLD, 16));
        stateField.setBounds(400, 520, 350, 20);

        add(stateField);

        pinCode = new JLabel("Pin-Code");
        pinCode.setFont(new Font("Arial", Font.BOLD, 16));
        pinCode.setBounds(100, 560, 350, 20);

        add(pinCode);

        pinCodeField = new JTextField();
        pinCodeField.setFont(new Font("Arial", Font.BOLD, 16));
        pinCodeField.setBounds(400, 560, 350, 20);

        add(pinCodeField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650, 620, 100, 25);

        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.addActionListener(this);

        add(next);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent ae) {

        String formno = "" + formNo;
        String name = nameField.getText();
        String fname = fNameField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        }
        else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailField.getText();
        String marriedStatus = "";
        if (married.isSelected()) {
            marriedStatus = "Married";
        }
        else if (unmarried.isSelected()) {
            marriedStatus = "UnMarried";
        }
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pin = pinCodeField.getText();

//            System.out.println(formno + name + fname + dob + gender + email + marriedStatus + address + city + state + pin);
        try {
            if (name.equals("") || fname.equals("") || dob.equals("") || gender.equals("") || email.equals("") || marriedStatus.equals("") || address.equals("") || city.equals("") || state.equals("") || pin.equals("")) {

                JOptionPane.showMessageDialog(null, "All Fields are Required");
            }
            else {

                Conn c = new Conn();
                String query = "insert into signup (formno, name, fname, dob, gender, marriedstatus, email, address, city, state, pin) values ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + marriedStatus + "', '" + email + "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";

                c.s.executeUpdate(query);

                setVisible(false);

                new SignUpTwo(formno).setVisible(true);
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignUpOne();
            }
        });
    }
}
