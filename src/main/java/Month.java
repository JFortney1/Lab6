/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfortney
 */
class Month {

    private int monthNumber;
// default constructor

    public Month() {
        monthNumber = 1;
    }
// overloaded constructor

    public Month(int monthNum) {
        if (monthNum < 1 || monthNum > 12) {
            monthNumber = 1;
        } else {
            monthNumber = monthNum;
        }
    }
// overloaded constructor

    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (monthName.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (monthName.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (monthName.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (monthName.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (monthName.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (monthName.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (monthName.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (monthName.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (monthName.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (monthName.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (monthName.equalsIgnoreCase("December")) {
            monthNumber = 12;
        }
    }

    public void setMonthNumber(int month_num) {
        if (month_num < 1 || month_num > 12) {
            monthNumber = 1;
        } else {
            monthNumber = month_num;
        }
    }

    public int getmonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        if (monthNumber == 1) {
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        } else if (monthNumber == 8) {
            return "August";
        } else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12) {
            return "December";
        }
        return "January";
    }

    public String toString() {
        return getMonthName();
    }

    public boolean equals(Month M) {
        return monthNumber == M.monthNumber;
    }

    public boolean greaterThan(Month M) {
        return monthNumber > M.monthNumber;
    }

    public boolean lessThan(Month M) {
        return monthNumber < M.monthNumber;
    }

    public static void main(String[] args) {
        Month m1 = new Month(4);
        Month m2 = new Month(10);
        System.out.println("The first month's name is " + m1);
        System.out.println("The second month's name is " + m2);
        System.out.println("Is the first month equal to the second month? " + m1.equals(m2));
    }
}

