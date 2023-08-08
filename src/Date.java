import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        //Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023 "









    }
    //===Methods===
    static Scanner scanner = new Scanner(System.in);
    public static int  day (){
        System.out.println("Enter a day:  ");
        return scanner.nextInt();
    }
    public static int month (int m){
        System.out.println("Enter a month:  ");

        switch (m){
            case 01:
                return "January";

        }

    }



    //=============
}