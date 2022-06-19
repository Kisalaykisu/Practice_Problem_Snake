/* Q-4) Repeat till the Player
        reaches the winning
        position 100. - Note In case the player position moves
        below 0, then the player restarts from 0
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

        Random rand = new Random();

        while(position<100) {
            int dice = rand.nextInt(6) + 1;   //Random input integer
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