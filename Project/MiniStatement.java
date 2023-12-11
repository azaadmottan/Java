package net.banking;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MiniStatement extends  JFrame implements ActionListener{
    JPanel mainPanel, miniStatementPanel;
    JLabel logoLabel, accNoLabel, accNo;
    JButton closeButton, homeButton;
    JTable table;
    String strAccountNumber, last4Digits;

    Date date = new Date();
    public MiniStatement (String accountno) {

        this.strAccountNumber = accountno;

        last4Digits = strAccountNumber.substring(strAccountNumber.length() - 4);

        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(430, 120);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle("Mini Statement");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a main panel
        mainPanel = new JPanel(null);

        ImageIcon logo = new ImageIcon(getClass().getResource("/images/rupee_logo.jpg"));
        Image scaledLogo = logo.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);

        this.setIconImage(scaledLogo);


        ImageIcon imageLogo1 = new ImageIcon(getClass().getResource("/images/online_banking.png"));
        Image scaledImage2 = imageLogo1.getImage().getScaledInstance(140, 70, Image.SCALE_SMOOTH);
        logoLabel = new JLabel(new ImageIcon(scaledImage2));

        logoLabel.setBounds(180, 5, 140, 70);
        mainPanel.add(logoLabel);

        accNoLabel = new JLabel("Account Number: ");
        accNoLabel.setBounds(30, 100, 200, 22);
        accNoLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        accNoLabel.setForeground(Color.BLACK);
        mainPanel.add(accNoLabel);

        accNo = new JLabel(strAccountNumber);
        accNo.setBounds(170, 100, 200, 22);
        accNo.setFont(new Font("Arial", Font.BOLD, 16));
        accNo.setForeground(Color.BLACK);
        mainPanel.add(accNo);

        accNoLabel = new JLabel("Mini Statement");
        accNoLabel.setBounds(160, 140, 200, 22);
        accNoLabel.setFont(new Font("Arial", Font.ITALIC, 25));
        accNoLabel.setForeground(Color.BLACK);
        mainPanel.add(accNoLabel);

        // Create a scrollable panel for the mini-statement content
        miniStatementPanel = new JPanel(new BorderLayout());
        miniStatementPanel.setLayout(new BoxLayout(miniStatementPanel, BoxLayout.Y_AXIS));

        mainPanel.add(miniStatementPanel);

        Vector<Vector<String>> data = getMiniStatementData();

        // Column names
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Date");
        columnNames.add("Type");
        columnNames.add("Amount");

        // Create a table model
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Create a JTable with the model
        table = new JTable(tableModel);

        // Set column widths
        setColumnWidths(table);

        miniStatementPanel.add(table);

        // Create a scroll pane and add the mini-statement panel to it
        JScrollPane scrollPane = new JScrollPane(miniStatementPanel);
        scrollPane.setBounds(30, 170, 428, 230); // Adjust the bounds accordingly
        mainPanel.add(scrollPane);

        // Set the main panel as the content pane
        this.setContentPane(mainPanel);


        closeButton = new JButton("Close");
        closeButton.setBounds(355, 415, 100, 30);
        closeButton.setFont(new Font("Arial", Font.BOLD, 16));
        closeButton.setBackground(Color.BLUE);
        closeButton.setForeground(Color.WHITE);
        closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeButton.addActionListener(this);

        mainPanel.add(closeButton);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == closeButton) {

//            System.exit(0);
            setVisible(false);
        }
    }

    private void setColumnWidths(JTable table) {
        int[] columnWidths = {150, 100, 100}; // Adjust the widths as needed

        for (int i = 0; i < columnWidths.length; i++) {

            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(columnWidths[i]);
        }
    }

    private Vector<Vector<String>> getMiniStatementData() {

        Conn c = new Conn();
        Vector<Vector<String>> data = new Vector<>();

        try {

            ResultSet rs = c.s.executeQuery("select * from bank where accountNumber = '" + strAccountNumber + "'");

            Vector<String> row = new Vector<>();

            if (0 < 1) {

                row.add("                   Date & Time");
                row.add("           Type");
                row.add("           Amount");
            }

            data.add(row);

            while (rs.next()) {

                Vector<String> row2 = new Vector<>();

                row2.add(" " + rs.getString("date"));
                row2.add("  " + rs.getString("type"));
                row2.add("  " + rs.getString("amount"));
                data.add(row2);
            }

        } catch (Exception e) {

            System.out.println(e);
        }

        return data;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new MiniStatement("");
            }
        });
    }
}
