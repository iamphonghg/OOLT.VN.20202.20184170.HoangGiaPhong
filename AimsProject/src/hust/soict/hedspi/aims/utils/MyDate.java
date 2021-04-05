package hust.soict.hedspi.aims.utils;


import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private String date;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date) {
        this.date = date;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public boolean accept() {
        System.out.println("Enter a date: ");
        date = new Scanner(System.in).nextLine();
        String[] arrDate = date.split("\\s");
        year = Integer.parseInt(arrDate[2]);
        if (year < 0) {
            System.out.println("This date does not exist!");
            return false;
        }
        arrDate[0] = arrDate[0].toLowerCase();
        int limitDate = 0;
        switch (arrDate[0]) {
            case "january": {
                month = 1;
                limitDate = 31;
                break;
            }
            case "february": {
                month = 2;
                if(year%4 == 0 && year%100 != 0)
                    limitDate = 29;
                else if (year%400 == 0)
                    limitDate = 29;
                else
                    limitDate = 28;
                break;
            }
            case "march": {
                month = 3;
                limitDate = 31;
                break;
            }
            case "april": {
                month = 4;
                limitDate = 30;
                break;
            }
            case "may": {
                month = 5;
                limitDate = 31;
                break;
            }
            case "june": {
                month = 6;
                limitDate = 30;
                break;
            }
            case "july": {
                month = 7;
                limitDate = 31;
                break;
            }
            case "august": {
                month = 8;
                limitDate = 31;
                break;
            }
            case "september": {
                month = 9;
                limitDate = 30;
                break;
            }
            case "october": {
                month = 10;
                limitDate = 31;
                break;
            }
            case "november": {
                month = 11;
                limitDate = 30;
                break;
            }
            case "december": {
                month = 12;
                limitDate = 31;
                break;
            }
            default:
                System.out.println("This date does not exist!");
        }
        day = Integer.parseInt(arrDate[1].substring(0, arrDate[1].length() - 2));
        if (day > limitDate || day < 0) {
            System.out.println("This date does not exist!");
            return false;
        }
        System.out.println(day + " - " + month + " - " + year);
        return true;
    }
    public void print() {
        System.out.println("Current date is: " + java.time.LocalDate.now());
    }
}
