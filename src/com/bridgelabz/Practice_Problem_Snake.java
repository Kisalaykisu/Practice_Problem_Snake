/* Q-3)The Player then checks for a Option. They are No Play,
        Ladder or Snake.
        - Use ((RANDOM)) to check for Options - In Case of No Play the player
        stays in the same position
        - In Case of Ladder the player moves ahead by the
          number of position received in the die
        -  In Case of Snake the player moves behind by the
          number of position received in the die
*/

package com.bridgelabz;

import java.util.Random;  // import random

public class Practice_Problem_Snake {
    public static void main(String[] args) {  //entry point of program

        int position = 0;
        final int NO_PLAY=1;
        final int LADDER=2;
        final int SNAKE=3;

        Random rand = new Random();  // Make Random object

        int dice = rand.nextInt(6) + 1;  //Input random integer

        int options = rand.nextInt(3) + 1;

        switch (options) {
            case NO_PLAY:
                break;
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

}
