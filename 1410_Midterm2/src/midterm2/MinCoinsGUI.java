// Assignment: 1410_Midterm2
// program:    MinCoinsGUI
// Created:    Nov 30, 2017
// Author:     Tenzin
//
package midterm2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // Needed for ActionListener

//////////////////////////////////////////////////////// class DogYears2
@SuppressWarnings("serial")
class MinCoinsGUI extends JFrame //the program container
{
    //======================================================== constants

    private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;      //Note 1
    //=============================================== instance variables
    private static JTextField changeTF = new JTextField(3);
    private static JLabel quartersLBL = new JLabel("");
    private static JLabel dimesLBL = new JLabel("");
    private static JLabel nickelsLBL = new JLabel("");
    private static JLabel penniesLBL = new JLabel("");
    private static int quarters = 0;
    private static int dimes = 0;
    private static int nickels = 0;
    private static int pennies = 0;
    private static int change = 0;

    //====================================================== constructor
    public MinCoinsGUI()
    {                                        //Note 3
        // 1... Create/initialize components
        JButton calcBtn = new JButton("Calculate");
        JButton clearBtn = new JButton("Clear");
        calcBtn.addActionListener(new CalcBtnListener()); //Note 5
        clearBtn.addActionListener(new ClearBtnListener()); //Note 5

        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(6, 2, 2, 2));

        // 3... Add the components to the content panel.
        content.add(new JLabel("Enter Change (1-99):"));
        content.add(changeTF);
        JLabel q = new JLabel("Quarters");
        q.setFont(new Font("Serif", Font.BOLD, 28));// Add input field
        content.add(q);
        content.add(quartersLBL);
        content.add(new JLabel("Dimes"));
        content.add(dimesLBL);
        content.add(new JLabel("Nickels"));
        content.add(nickelsLBL);
        content.add(new JLabel("Pennies"));
        content.add(penniesLBL);
        content.add(calcBtn);               // Add button
        content.add(clearBtn);               // Add button

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Minimum Coins");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.
    }

    ////////////////////////////////////////////////// ConvertBtnListener
    class CalcBtnListener implements ActionListener
    {         //Note 6

        public void actionPerformed(ActionEvent e)
        {
            try
            {
                //... Get the value from the change textfield.
                String changeStr = changeTF.getText();
                change = Integer.parseInt(changeStr);

                while (change != 0)
                {//true
                    //quarters loop
                    while (change >= 25)
                    {//true
                        change = change - 25;
                        quarters++;
                    }
                    //dimes loop
                    while (change >= 10)
                    {//true
                        change = change - 10;
                        dimes++;
                    }
                    //nickels loop
                    while (change >= 5)
                    {//true
                        change = change - 5;
                        nickels++;
                    }
                    pennies = change;
                    change = 0;
                    //min coins output
                    quartersLBL.setText("" + quarters);
                    dimesLBL.setText("" + dimes);
                    nickelsLBL.setText("" + nickels);
                    penniesLBL.setText("" + pennies);
                }
            } catch (NumberFormatException f)
            {
                changeTF.setText("Invalid");
                changeTF.requestFocus();
                changeTF.selectAll();
            }
        }
    }
    ////////////////////////////////////////////////// ConvertBtnListener
    class ClearBtnListener implements ActionListener
    {         //Note 6

        public void actionPerformed(ActionEvent e)
        {
            //clear counter labels
            changeTF.setText("");
            quartersLBL.setText("");
            dimesLBL.setText("");
            nickelsLBL.setText("");
            penniesLBL.setText("");
            //set to change field
            changeTF.requestFocus();
            changeTF.selectAll();

            //Min Coins Logic Goes Here
        }
    }

    //================================================ main method 
    public static void main(String[] args)
    {
        MinCoinsGUI window = new MinCoinsGUI();
        //window.setBounds(400, 300, 400, 300);
        window.setVisible(true);
    }
}

