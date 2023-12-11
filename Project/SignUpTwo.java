package net.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {

    JLabel labelLogo, signUpHeading, aadhar, pageNo, religionLabel, categoryLabel, incomeLabel, eduLabel, occpLabel, panLabel, seniorLabel, existLabel, state, pinCode;
    JTextField panField, addressField, aadharField, cityField, stateField, pinCodeField;
    JComboBox religion, category, income, education, occupation;
    JRadioButton sYes, sNo, eYes, eNo;
    ButtonGroup seniorGroup, accountGroup;
    String formNo;

    public SignUpTwo(String formno) {

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

        pageNo = new JLabel("Page-2 (Additional Details.)");
        pageNo.setFont(new Font("Arial", Font.BOLD, 20));
        pageNo.setBounds(580, 150, 350, 25);

        add(pageNo);

        religionLabel = new JLabel("Religion: ");
        religionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        religionLabel.setBounds(100, 200, 150, 20);

        add(religionLabel);

        String relVal[] = {"Hindu", "Sikh", "Muslim", "Christian", "Others"};
        religion = new JComboBox(relVal);
        religion.setFont(new Font("Arial", Font.BOLD, 16));
        religion.setBounds(400, 200, 350, 20);
        religion.setForeground(Color.BLACK);

        add(religion);

        categoryLabel = new JLabel("Category: ");
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 16));
        categoryLabel.setBounds(100, 240, 350, 20);

        add(categoryLabel);

        String catVal[] = {"General", "SC", "ST", "OBC", "Others"};
        category = new JComboBox(catVal);
        category.setFont(new Font("Arial", Font.BOLD, 16));
        category.setBounds(400, 240, 350, 20);
        category.setForeground(Color.BLACK);

        add(category);

        incomeLabel = new JLabel("Income: ");
        incomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        incomeLabel.setBounds(100, 280, 350, 20);

        add(incomeLabel);

        String incomVal[] = {"< 50,000", "< 100,000", "< 150,000", "< 200,000", "< 300,000", "< 400,000", "< 500,000", "> 600,000"};
        income = new JComboBox(incomVal);
        income.setFont(new Font("Arial", Font.BOLD, 16));
        income.setBounds(400, 280, 350, 20);
        income.setForeground(Color.BLACK);

        add(income);

        eduLabel = new JLabel("Edu. Qualification: ");
        eduLabel.setFont(new Font("Arial", Font.BOLD, 16));
        eduLabel.setBounds(100, 320, 350, 20);

        add(eduLabel);

        String eduVal[] = {"Metric", "Post Metric", "Graduate", "Post Graduate", "Docterate", "Others"};
        education = new JComboBox(eduVal);
        education.setFont(new Font("Arial", Font.BOLD, 16));
        education.setBounds(400, 320, 350, 20);
        education.setForeground(Color.BLACK);

        add(education);

        occpLabel = new JLabel("Occupation: ");
        occpLabel.setFont(new Font("Arial", Font.BOLD, 16));
        occpLabel.setBounds(100, 360, 350, 20);

        add(occpLabel);

        String occupVal[] = {"Salaried", "Self-Employeed", "Private-Job", "Govt-Job", "Retired", "Others"};

        occupation = new JComboBox(occupVal);
        occupation.setFont(new Font("Arial", Font.BOLD, 16));
        occupation.setBounds(400, 360, 350, 20);
        occupation.setForeground(Color.BLACK);

        add(occupation);

        panLabel = new JLabel("PAN No.: ");
        panLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panLabel.setBounds(100, 400, 350, 20);

        add(panLabel);

        panField = new JTextField();
        panField.setFont(new Font("Arial", Font.BOLD, 16));
        panField.setBounds(400, 400, 350, 20);

        add(panField);

        aadhar = new JLabel("Aadhar No.: ");
        aadhar.setFont(new Font("Arial", Font.BOLD, 16));
        aadhar.setBounds(100, 440, 350, 20);

        add(aadhar);

        aadharField = new JTextField();
        aadharField.setFont(new Font("Arial", Font.BOLD, 16));
        aadharField.setBounds(400, 440, 350, 20);

        add(aadharField);

        seniorLabel = new JLabel("Senior Citizen: ");
        seniorLabel.setFont(new Font("Arial", Font.BOLD, 16));
        seniorLabel.setBounds(100, 480, 350, 20);

        add(seniorLabel);

        sYes = new JRadioButton("Yes");
        sNo = new JRadioButton("No");

        sYes.setBounds(400, 480, 100, 20);
        sYes.setFont(new Font("Arial", Font.BOLD, 16));
        add(sYes);

        sNo.setBounds(600, 480, 100, 20);
        sNo.setFont(new Font("Arial", Font.BOLD, 16));
        add(sNo);

        seniorGroup = new ButtonGroup();

        seniorGroup.add(sYes);
        seniorGroup.add(sNo);

        existLabel = new JLabel("Existing Account: ");
        existLabel.setFont(new Font("Arial", Font.BOLD, 16));
        existLabel.setBounds(100, 520, 350, 20);

        add(existLabel);

        eYes = new JRadioButton("Yes");
        eNo = new JRadioButton("No");

        eYes.setBounds(400, 520, 100, 20);
        eYes.setFont(new Font("Arial", Font.BOLD, 16));
        add(eYes);

        eNo.setBounds(600, 520, 100, 20);
        eNo.setFont(new Font("Arial", Font.BOLD, 16));
        add(eNo);

        accountGroup = new ButtonGroup();

        accountGroup.add(eYes);
        accountGroup.add(eNo);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650, 600, 100, 25);

        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.addActionListener(this);

        add(next);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent ae) {

        String selectReligion = (String) religion.getSelectedItem();
        String selectCategory = (String) category.getSelectedItem();
        String selectIncome = (String) income.getSelectedItem();
        String selectEduct = (String) education.getSelectedItem();
        String selectOccpt = (String) occupation.getSelectedItem();
        String pan = panField.getText();
        String aadhar = aadharField.getText();

        String senior = "";
        if (sYes.isSelected()) {
            senior = "Yes";
        }
        else if (sNo.isSelected()) {
            senior = "No";
        }

        String existAcc = "";
        if (eYes.isSelected()) {
            existAcc = "Yes";
        }
        else if (eNo.isSelected()) {
            existAcc = "No";
        }

//        System.out.println(selectReligion + selectCategory + selectIncome + selectEduct + selectOccpt + senior + pan + aadhar + state + pin);

        try {
            if (selectReligion.equals("") || selectIncome.equals("") || selectEduct.equals("") || selectOccpt.equals("") || selectCategory.equals("") || pan.equals("") || aadhar.equals("") || senior.equals("") || existAcc.equals("")) {

                JOptionPane.showMessageDialog(null, "All Fields are Required");
            }
            else {

                Conn c = new Conn();
                String query = "insert into signuptwo (formno, religion, category, education, occupation, income, aadhar, pan, senior, existAcc) values ('" + formNo + "', '" + selectReligion + "', '" + selectCategory + "', '" + selectEduct + "', '" + selectOccpt + "', '" + selectIncome + "', '" + aadhar + "', '" + pan + "', '" + senior + "', '" + existAcc + "')";

                c.s.executeUpdate(query);

                setVisible(false);

                new SignUpThree(formNo).setVisible(true);       // Open third signup form
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
                new SignUpTwo("");
            }
        });
    }
}
