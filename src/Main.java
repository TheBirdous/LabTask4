import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.print("Please enter a time of the day value in the range from 1 to 24: ");
        int currTime = sin.nextInt();

        while (currTime < 1 || currTime > 24) {
            System.out.print("The time entered is outside the allowed range," +
                    " please enter the time again: ");
            currTime = sin.nextInt();
        }

        System.out.println();
        final int nightStart = 20;

        if(currTime >= 1 && currTime <= 12) {
            System.out.println("Good morning.");
        }

        else if(currTime > 12 && currTime <= nightStart){
            System.out.println("Good afternoon.");
        }

        else if (currTime > nightStart && currTime <= 24){
            System.out.println("Good night.");
        }
        else
            System.out.println("Error, the number you entered is outsite the allowed range.");







    }

}
