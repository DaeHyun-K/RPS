package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        //	    Create a Rock-Paper-Scissors game that allows 2 people to play against each other.
        //	    Requirements:
        //	    - use Scanner to get user input
        //	    - use control-flow statements to determine the winner and print it out
        //	    - allow user to repeatedly play games
        //	    - must create at least one class
        //	    - Make your own Git Repo and paste the link in the excel sheet.
        //	    - have the computer randomly pick a an option ("rock", "paper", or "scissors")
        //	    - Use this link https://www.codegrepper.com/code-examples/java/how+to+select+a+random+element+from+an+array+in+java for assistance with picking a random element from an array
        //	    Stretch Goals:
        //	    - allow players to enter their name for a more personalized experience
        //	    - keep track of score
        //	    - Extend your game to be tic-tac-toe instead of Rock-Paper-Scissors
        */

        // This is the main page we will see.
        System.out.println("Let's play Rock Paper Scissor!");
        System.out.print("Enter your name: ");

        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println("Hello " + name);
        System.out.println("");

        int i = 0;
        int j = 0;


        while (true) {
            System.out.println("Rock, Paper, Scissor");
            System.out.print(name + "'s choice: ");

            // Using Scanner to help with my choice
            Scanner scan = new Scanner(System.in);
            String my_choice = scan.nextLine();
            System.out.println(name + ": " + my_choice);

            // This is the computer's random choice
            String[] arr = {"Rock", "Paper", "Scissor"};
            Random r = new Random();
            int randomNumber = r.nextInt(arr.length);
            System.out.println("Computer: " + arr[randomNumber]);

            //Instantiate a class
            DetTest d = new DetTest(my_choice, arr[randomNumber]);
            System.out.println(d.winner());

            // Keeping track of score
            switch(d.winner()){
                case "You Win!":
                    i+=1;
                    break;
                case "You Lose..":
                    j+=1;
                    break;
                default:
                    break;
            }
            System.out.println(i +" : " + j);

            // place a space
            System.out.println("");

        }
    }
}

