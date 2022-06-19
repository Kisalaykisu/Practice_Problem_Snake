/* Q-7)

*/

package com.bridgelabz;

import java.util.Random;  // import random

public class Practice_Problem_Snake {
    public static void main(String[] args) {  //entry point of program

        int player1 = 0;  //player 1
        int player2 = 0;  //player 2
        boolean is_Player_1 = true;    //conditional initializer
        final int NO_PLAY=1;
        final int LADDER=2;    //Ladder will give you reward
        final int SNAKE=3;     // Snake will take your life
        int dieRolls = 0;

        Random rand = new Random();

        while(player1<100 && player2<100) {

            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            int options = rand.nextInt(3) + 1;

            switch (options) {
                case NO_PLAY: break;
                case LADDER:
                    if(is_Player_1) {
                        if (player1 + dice <= 100) {
                            player1 += dice;
                            is_Player_1=false;
                        }
                    }else
                    if (player2 + dice <=100) {
                        player2 += dice;
                        is_Player_1=true;
                    }
                    break;
                case SNAKE:
                    if(is_Player_1){
                        if (player1 - dice >= 0) {
                            player1 -= dice;
                        }else
                            player1=0;
                    }else
                    if(player2 - dice >= 0) {
                        player2 -= dice;
                    }else
                        player2=0;
                    break;
            }
            is_Player_1= !is_Player_1;
            System.out.println("Current positions of player1 and player2 are: "+player1+"and "+player2);
        }
        System.out.println("Number of times die has rolled: "+dieRolls);
        if (player1==100){
            System.out.println("Player1 has WON!");
        }else
            System.out.println("Player2 has WON!");

    }
}