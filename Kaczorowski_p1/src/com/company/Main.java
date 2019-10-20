package com.company;
import java.security.SecureRandom;
import java.util.Scanner;



public class Main {

    public static int add (int int1, int int2 ){
        Scanner s = new Scanner(System.in);
        double ans;
        double val1 = (double)(int1);
        double val2 = (double)(int2);

        System.out.println("How much is " + int1 + " plus " + int2 + "?");
        ans = s.nextInt();

        if (ans == (val1 + val2)){
            System.out.println(correct());
            System.out.println("");
            return 1;
        }
        else {
            System.out.println(incorrect());
            System.out.println("");
            return 0;
        }
    }

    public static int mult (int int1, int int2 ){
        Scanner s = new Scanner(System.in);
        double ans;
        double val1 = (double)(int1);
        double val2 = (double)(int2);

        System.out.println("How much is " + int1 + " times " + int2 + "?");
        ans = s.nextInt();

        if (ans == (val1 * val2)){
            System.out.println(correct());
            System.out.println("");
            return 1;
        }
        else {
            System.out.println(incorrect());
            System.out.println("");
            return 0;
        }
    }

    public static int sub (int int1, int int2 ){
        Scanner s = new Scanner(System.in);
        double ans;
        double val1 = (double)(int1);
        double val2 = (double)(int2);

        System.out.println("How much is " + int1 + " minus " + int2 + "?");
        ans = s.nextInt();

        if (ans == (val1 - val2)){
            System.out.println(correct());
            System.out.println("");
            return 1;
        }
        else {
            System.out.println(incorrect());
            System.out.println("");
            return 0;
        }
    }

    public static int div (int range ){
        Scanner s = new Scanner(System.in);
        SecureRandom rand4 = new SecureRandom();
        double ans;
        double val1 = (double)(rand4.nextInt(range));
        double val2 = (double)(rand4.nextInt(range-1) + 1);

        System.out.println("How much is " + (int)val1 + " divided by " + (int)val2 + "?");
        ans = s.nextDouble();

        if (ans == (val1 / val2)){
            System.out.println(correct());
            System.out.println("");
            return 1;
        }
        else {
            System.out.println(incorrect());
            System.out.println("");
            return 0;
        }
    }

    public static int random (int int1, int int2, int range){
        SecureRandom rand3 = new SecureRandom();
        int opperation = rand3.nextInt(4);
        int ans = 0;

        if (opperation == 0){
            ans = add(int1, int2);
        }
        else if (opperation == 1){
            ans = mult(int1, int2);
        }
        else if (opperation == 2){
            ans = sub(int1, int2);
        }
        else if (opperation == 3){
            ans = div(range);
        }
        return ans;
    }

    public static int diff(){
        Scanner s = new Scanner(System.in);
        int diffChoice;
        int range = 0;
        System.out.println("Please enter a difficulty level (1-4):");
        diffChoice = s.nextInt();
        if (diffChoice == 1) {
            range = 10;
        } else if (diffChoice == 2) {
            range = 100;
        } else if (diffChoice == 3) {
            range = 1000;
        } else if (diffChoice == 4) {
            range = 10000;
        }
        return range;
    }

    public static int menu (){
        Scanner s = new Scanner(System.in);

        System.out.println("PLEASE SELECT A PROBLEM TYPE");
        System.out.println("1) Addition");
        System.out.println("2) Multiplication");
        System.out.println("3) Subtraction");
        System.out.println("4) Division");
        System.out.println("5) Random");

        int choice = s.nextInt();

        return choice;
    }

    public static String correct() {
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(4);

        switch (rand1){
            case 0:
                return "Very good!";
            case 1:
                return "Excellent!";
            case 2:
                return "Nice work!";
            case 3:
                return "Keep up the good work!";
            default:
                return "ERROR";
        }
    }

    public static String incorrect(){
        SecureRandom rand = new SecureRandom();
        int rand2 = rand.nextInt(4);

        switch (rand2){
            case 0:
                return "No. Please try again.";
            case 1:
                return "Wrong. Try once more.";
            case 2:
                return "Don’t give up!";
            case 3:
                return "No. Keep trying.";
            default:
                return "ERROR";
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int numCorrect;
        int diffChoice;
        int menuChoice;
        int range = 10;
        int int1;
        int int2;
        String cont = "yes";

        while (cont.equals("yes")) {
            numCorrect = 0;

            range = diff();

            menuChoice = menu();

            int1 = rand.nextInt(range);
            int2 = rand.nextInt(range);


            if (menuChoice == 1){
                for (int i = 0; i < 10; i++) {
                    numCorrect += add(int1, int2);
                    int1 = rand.nextInt(range);
                    int2 = rand.nextInt(range);
                }
            }
            else if (menuChoice == 2) {
                for (int i = 0; i < 10; i++) {
                    numCorrect += mult(int1, int2);
                    int1 = rand.nextInt(range);
                    int2 = rand.nextInt(range);
                }
            }
            else if (menuChoice == 3) {
                for (int i = 0; i < 10; i++) {
                    numCorrect += sub(int1, int2);
                    int1 = rand.nextInt(range);
                    int2 = rand.nextInt(range);
                }
            }
            else if (menuChoice == 4) {
                for (int i = 0; i < 10; i++) {
                    numCorrect += div(range);
                }
            }
            else if (menuChoice == 5) {
                for (int i = 0; i < 10; i++) {
                    numCorrect += random(int1, int2, range);
                    int1 = rand.nextInt(range);
                    int2 = rand.nextInt(range);
                }
            }

            System.out.println("You got " + numCorrect + " correct and " + (10-numCorrect) + " incorrect.");

            if (numCorrect < 8) {
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("");
            }
            else if (numCorrect >= 8) {
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("");
            }

            System.out.println("Do you wish to begin a new session (yes/no)?");
            cont = s.next();

        }



    }
}
