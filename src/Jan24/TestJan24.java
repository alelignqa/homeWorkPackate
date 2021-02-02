package Jan24;

public class TestJan24 {
    public static void main(String[] args) {

        System.out.println("The day of the week you choose is " + JavaQuiz3.weekDays());

        System.out.println("~~~~~~~~this is for largest number method~~~~");
        JavaQuiz3 greatestNumber = new JavaQuiz3();
        System.out.println("The greatest number is " + greatestNumber.findTheGreatestNumber(8.9, 8.1, 8.5));
        System.out.println("The greatest number is " + JavaQuiz3.findTheGreatestNumber(80, 5, 20));

    }
}
