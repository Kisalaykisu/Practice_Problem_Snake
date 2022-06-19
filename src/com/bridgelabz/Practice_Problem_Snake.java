/* Q-6) Report the number of
        times the dice was
        played to win the game
        and also the position
        after every die role.

*/

package com.bridgelabz;

import java.util.Random;  // import random

public class Practice_Problem_Snake {
    public static void main(String[] args) {  //entry point of program

        int position = 0;
        final int NO_PLAY=1;  // no of player
        final int LADDER=2;   // ladder will award you reward
        final int SNAKE=3;    // Snake take your life
        int dieRolls = 0;

        Random rand = new Random();  //Random obj initializer

        while(position<100) {
            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            int options = rand.nextInt(3) + 1;

            switch (options) {
                case NO_PLAY: break;
                case LADDER:
                    if (position + dice <= 100) {
                        position += dice;
                    }
                    break;
                case SNAKE:
                    if (position - dice >= 0) {
                        position -= dice;
                    } else
                        position = 0;
                    break;
            }
            System.out.println("Current position is: "+position);
        }
        System.out.println("Number of times die has rolled: "+dieRolls);
        System.out.println("Player has WON!");

    }
}