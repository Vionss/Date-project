import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        //Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023 "

        int day = 8;
        int month = 8;
        int year = 2023;

        System.out.println(date(day,month,year));

    }
    //===Methods===
    public static String date (int day, int month, int year){
        String res = "";
        String strMonth ="";


        switch (month){
            case 1: strMonth = "January";    break;
            case 2: strMonth = "February";   break;
            case 3: strMonth = "March";      break;
            case 4: strMonth = "April";      break;
            case 5: strMonth = "May";        break;
            case 6: strMonth = "June";       break;
            case 7: strMonth = "July";       break;
            case 8: strMonth = "August";     break;
            case 9: strMonth = "September";  break;
            case 10: strMonth = "October";   break;
            case 11: strMonth = "November";  break;
            case 12: strMonth = "Decembeer"; break;
        }
        res = (day < 10? "0":"") + day +". " + strMonth +" " + year;

     return res;
    }

    //=============
}