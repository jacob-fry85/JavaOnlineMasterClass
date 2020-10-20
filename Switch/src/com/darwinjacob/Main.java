package com.darwinjacob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        char c;
        String string;
        Scanner keyboard = new Scanner(System.in);
       do {
           //c = keyboard.next().charAt(0);
           string = keyboard.nextLine();
           switch (string.toLowerCase()) {
               case "january": case "february": case "march":
                   System.out.println("was " + string);
                   break;
               /*case 'A': case 'B': case 'C': case 'D':
                   System.out.println("was A, B, C, D");
                   System.out.println("Actually it was a + " + c);
                   break;
               case 1:
                   System.out.println("Number is 1");
                   break;
               case 2:
                   System.out.println("Number is 2");
                   break;
               case 3: case 4: case 5:
                   System.out.println("was a 3, was a 4, was a 5");
                   System.out.println("Actually it was a " + number);
                   break;*/
               default:
                   System.out.println("Was not found");
                   break;
           }
       } while(string != "a");
    }
}
