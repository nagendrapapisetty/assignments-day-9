package com.bridgelabz.employeewages;

public class EmployeeWages {

    public static void main(String[] args) {
        //constants
        int IS_FULL_TIME = 1;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println(" Employee is present");
        else
            System.out.println(" Employee is abscent");
    }
}
