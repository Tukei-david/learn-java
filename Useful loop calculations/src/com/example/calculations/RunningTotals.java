package com.example.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales = 0.0;

        DecimalFormat decimal = new DecimalFormat("#,##0.00"); // Changing the float numbers

        String input = JOptionPane.showInputDialog("For how many days do you have sales?"); // Ask the user question
        days = Integer.parseInt(input); // Change user input to integer

        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Enter the sales for day " + count );
            sales = Double.parseDouble(input); // Change input to doubles

            totalSales = totalSales + sales; // Adding to day sales to original totalsales
        }

        JOptionPane.showMessageDialog(null, "The total sales are KES " + decimal.format(totalSales));

        System.exit(0);
    }
}
