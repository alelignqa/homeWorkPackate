package Jan24;

import java.util.Scanner;

public class JavaQuiz3 {
    /* in the week of jan 24 we have the following two java quizes
        1. Write a Java program that keeps a number from the user and
            generates an integer between 1 and 7 and displays the name of the weekday.
            Test Data Input number: 5
        2.	Given Three Numbers are 35,78,87 . Find out Greatest Number. *
     */
    //Given Three Numbers are 35,78,87 . Find out Greatest Number. *

     double result;
     int intResult;


    /**
     * this method will take an integer numbers 1 -7 as input from a user and
     * and return which day of th week is
     * @return
     * @negash
     */
    public static String weekDays() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number between 1 and 7?");
        int number = input.nextInt();
        String dateOfWeek = " ";

        switch (number) {
            case 1:
                dateOfWeek = "Monday, enjoy the first work day of the week";
                break;
            case 2:
                dateOfWeek = "Tuesday, hope will have a fun day";
                break;
            case 3:
                dateOfWeek = "Wednesday, is in the middle of the week";
                break;
            case 4:
                dateOfWeek = "Thursday, waw only a day left for Sat day  ";
                break;
            case 5:
                dateOfWeek = "Friday, should I like the TGIF";
                break;
            case 6:
                dateOfWeek = "Saturday, please sit and enjoy ";
                break;
            case 7:
                dateOfWeek = "Sunday, take enough sun energy for the week ";
                break;
            default:
                dateOfWeek = "not correct, would you like to try it again? \nThanks";
                break;
        }
        //   System.out.println("The day of the week you choose is " + dateOfWeek );
        return dateOfWeek;
    }


    /**
     * this method will take three double arguments from user
     * and reply the largest using a Math java Method
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public double findTheGreatestNumber(double num1, double num2, double num3) {
        return result = Math.max(Math.max(num1, num2), num2);
    }

    /**
     * this method will accept  three integer argument from a user and
     * give us the largest of then using an if else logic
     * @param num1
     * @param num2
     * @param num3
     * @return
     * @negash
     */
    public static int findTheGreatestNumber(int num1, int num2, int num3) {
        int theLargerIs;
        if(num1>num2 && num1>num3){
            theLargerIs = num1;
        }else if(num2>num1 && num2>num3){
            theLargerIs = num2;
        }else theLargerIs = num3;
      return theLargerIs;
    }
}



