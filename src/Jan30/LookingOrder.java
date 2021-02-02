package Jan30;

import java.util.Scanner;

public class LookingOrder {
    /**
     * This method will accept three integers from a user and
     * determine whether it is an increasing or decreasing or
     * neither. If a user tries to enter an expected data
     * will use the try catch exception and break the loop
     * @negash
     */
    public void orderCheck() {
        Scanner in = new Scanner(System.in);
        int numberOfTrial = 3;
        while (numberOfTrial > 0) {
            System.out.println("enter 3 numbers");
            try {
                int val = in.nextInt();
                int val1 = in.nextInt();
                int val2 = in.nextInt();

            if (val < val1 & val1 < val2) {
                System.out.println("it is decreasing ");
            } else if (val > val1 & val1 > val2) {
                System.out.println("it is increasing ");
            } else System.out.println("neither increasing or decreasing ");
          numberOfTrial--;
            System.out.println("you have "+numberOfTrial+" trial left");
            }catch (Exception e){
                System.out.println("The system expecting one Integer at a time");
                break;
            }
        } in.close();
    }
}
