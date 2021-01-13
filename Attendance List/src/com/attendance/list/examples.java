package com.attendance.list;


import javax.swing.*;
import java.util.Calendar;

public class examples {

    public static void main(String[] args) {

        int hoursToAdd = 1;
        Calendar currentC = Calendar.getInstance();


        JOptionPane.showMessageDialog(null, "Current Date: " + currentC.getTime());

        currentC.add(Calendar.HOUR, hoursToAdd);

        JOptionPane.showMessageDialog(null, "Current Date: " + currentC.getTime());
    }
}
