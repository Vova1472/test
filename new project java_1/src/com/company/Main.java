package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int cards = 36;
        int player_score = 0;
        int program_choice = 0;
        int program_score = 0;
        int player_choice = 0;
        boolean istrue = true;
        boolean isfalse = true;
        here:
        while (true) {
            while (istrue == true) {
                System.out.println("Make your choice(0 - take card; 1 - stop taking): ");
                Scanner scan = new Scanner(System.in);
                player_choice = scan.nextInt();
                if (player_choice == 0) {
                    cards--;
                    Random rand = new Random();
                    player_score = player_score + (rand.nextInt(20) + 1);
                    System.out.println("Your score = " + player_score);
                    if (player_score > 21) {
                        System.out.println("You lose,program won");
                        return;
                    }
                } else {
                    System.out.println("Your score = " + player_score);
                    break;
                }
            }
            while (isfalse == true) {
                System.out.println("Program chooses");
                program_choice = 0;
                Random rand = new Random();
                program_choice = rand.nextInt(1);
                if (program_choice == 0) {
                    cards--;
                    Random rand_1 = new Random();
                    program_score = program_score + (rand.nextInt(20) + 1);
                    System.out.println("Program score = " + program_score);
                    if (program_score > 21) {
                        System.out.println("Program lose,you won");
                        return;
                    }
                } else {
                    System.out.println("Program score = " + program_score);
                    isfalse = true;
                    istrue = true;
                    continue here;
                }
            }
        }
    }

}
