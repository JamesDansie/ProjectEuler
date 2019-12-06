package leet.maze;

import java.util.List;

public class MazeDriver {
    public static void main(String[] args){
        int[][] numMaze = {
                {1, 2, 1, 1, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 1, 3}
        };
        BMaze maze = new BMaze(numMaze);

        BFSMazeSolver solver = new BFSMazeSolver();
        List<Coordinate> path = solver.BFTraversal(maze);
        System.out.println(path);
        System.out.println(maze.stringPath(path));
    }
}
