package leet;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    //    from here; https://leetcode.com/problems/rotting-oranges/
    // rotten oranges are 2
    // fresh oranges are 1
    // empty is 0
    // timestamp is -1
    // how many iterations to infect all oranges?
    // -1 if not possible

//    algo
//    make a count for fresh oranges
//    add all rotten oranges to a queue
//    add a timestamp to the queue
//    make a directions array
//    while the queue is not empty
//      pop the queue
//      if timestamp then time++ and add another timestamp
//      check current rotten oranges neighbors with dirctions arr
//      if a neighbor is fresh then add it to queue and freshOranges--
//    after the while loop, if the queue is empty return time else -1
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int row = 0; row < ROWS; row++){
            for(int col = 0; col < COLS; col++){
                if(grid[row][col] == 1){
                    freshOranges++;
                } else if(grid[row][col] == 2){
                    queue.add(new int[]{row, col});
                }
            }
        }

        int[][] directions = new int[][]{
                {1, 0},
                {0, 1},
                {-1, 0},
                {0, -1}
        };

        // adding initial timestamp
        queue.offer(new int[]{-1, -1});
        int time = -1;

        while(!queue.isEmpty() && time < 10){
            int[] currentRottenOrangeLocation = queue.poll();
            int rotRow = currentRottenOrangeLocation[0];
            int rotCol = currentRottenOrangeLocation[1];

            if(rotRow == -1){
                time++;
                if(!queue.isEmpty()){
                    queue.add(new int[]{-1, -1});
                }

            } else {
                for(int[] dir : directions){
                    int neighborRow = rotRow + dir[0];
                    int neighborCol = rotCol + dir[1];
                    // check if inbounds of grid
                    if(neighborRow >= 0 &&
                            neighborRow < ROWS &&
                            neighborCol >= 0 &&
                            neighborCol < COLS){
                        // if the neighbor is fresh then...
                        if(grid[neighborRow][neighborCol] == 1){
                            freshOranges--;
                            queue.offer(new int[]{neighborRow, neighborCol});
                            grid[neighborRow][neighborCol] = 2;
                        }
                    }
                }
            }


        }

        return freshOranges == 0 ? time : -1;
    }
}
