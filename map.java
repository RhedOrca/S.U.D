/* 2D ARRAY OF ROOMS, STARTED FROM THE MIDDLE LEFT, RANDOMLY GENERATED ONCE AT
BEGINNING OF GAME, THREE SIZES (NUMBER OF ROOMS FROM 5-7-9), THAT CONNECT
TO EACHOTHER ONLY IN CARDINAL DIRECTIONS, NO REPEAT GENERATION OR OFF-MAP */

import java.util.random;


Random rand = new Random();
int nextRoomCardinal = rand.nextInt(2) + 1;
/* generates a random between 1-3, inclusively. (3 cardinal directions that
aren't previous room) Without adjustment, can potentially overlap rooms */

Scanner
