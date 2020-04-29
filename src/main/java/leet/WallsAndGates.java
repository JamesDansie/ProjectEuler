package leet;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    // found here; https://leetcode.com/problems/walls-and-gates/
    // bds of a 2d array
    // go through and add all 0s to a queue
    // start a distance counter and add a distance marker to the queue
    // while queue is not empty then run
//      if the current loc is distanceMarker then ++ distance
//      else
//      check neighbors
//      if neighbor is in bound
//          if neighbor is not -1 and is greater than dist
//          then add to que and set
//          value to distance
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> queue = new LinkedList<>();
        int dist = 1;
        int ROWS = rooms.length;
        int COLS = rooms[0].length;
        int INF = Integer.MAX_VALUE;
        int[][] directions = new int[][]{
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        for(int row = 0; row < ROWS; row++){
            for(int col = 0; col < COLS; col++){
                if(rooms[row][col] == 0){
                    queue.add(new int[]{row, col});
                }
            }
        }

        // distance marker
        queue.add(new int[]{-2, -2});

        while(!queue.isEmpty() && dist < 20){
            int[] currLoc = queue.poll();
            int currRow = currLoc[0];
            int currCol = currLoc[1];

            //checking for distance
            if(currRow == -2){
                dist++;
                if(!queue.isEmpty()){
                    queue.add(new int[]{-2, -2});
                }
            }

            for(int dir[] : directions){
                int neighborRow = currRow + dir[0];
                int neighborCol = currCol + dir[1];
                // checking if in bounds
                if(
                        neighborRow >= 0 &&
                        neighborRow < ROWS &&
                        neighborCol >= 0 &&
                        neighborCol < COLS
                ){
                    // checking values
                    if(rooms[neighborRow][neighborCol] != -1 &&
                       rooms[neighborRow][neighborCol] > dist){
                        rooms[neighborRow][neighborCol] = dist;
                        queue.add(new int[]{neighborRow, neighborCol});
                    }
                }
            }
        }

        // debugging
        for(int row = 0; row < ROWS; row++){
            for(int col = 0; col < COLS; col++){
                if(rooms[row][col] == INF){
                    System.out.print(" INF");
                } else {
                    System.out.print(" " + rooms[row][col]);
                }
            }
            System.out.println("");
        }
    }
}
