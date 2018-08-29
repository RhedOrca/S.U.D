/* POPULATES ROOMS BY INCREMENTING THROUGH MAP ARRAY ONCE IMMEDIATELY AFTER
MAP IS GENERATED, CHECKS IF ROOM.EXISTS, AND ADDS A RANDOM MONSTER (D6), AND
TREASURE (D3, LOOT ON 3). */
import java.util.random;
Random rand = new Random();
int nextRoomCardinal = rand.nextInt(2) + 1;
/* generates a random between 1-3, inclusively. (3 cardinal directions that
aren't previous room) Without adjustment, can potentially overlap rooms */

Scanner
