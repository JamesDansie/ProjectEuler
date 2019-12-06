package leet.maze;

import java.util.Arrays;
import java.util.List;

//from; https: www.baeldung.com/java-solve-maze
//from; https: github.com/eugenp/tutorials/blob/master/algorithms-miscellaneous-2/src/main/java/com/baeldung/algorithms/maze/solver/Maze.java
public class BMaze {
    private static final int ROAD = 0;
    private static final int WALL = 1;
    private static final int START = 2;
    private static final int EXIT = 3;
    private static final int PATH = 4;

    private int[][] maze;
    private boolean[][] visited;
    private Coordinate start;
    private Coordinate end;

    public BMaze(int[][] maze){
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                if(maze[i][j] == BMaze.START){
                    this.start = new Coordinate(i, j);
                }
                if(maze[i][j] == BMaze.EXIT){
                    this.end = new Coordinate(i, j);
                }
            }
        }
    }

    public Coordinate getStart(){
        return start;
    }

    public Coordinate getEnd(){
        return end;
    }

    public boolean isExit(int x, int y){
        return x == end.getX() && y == end.getY();
    }

    public boolean isExplored(int x, int y){
        return visited[x][y];
    }

    public boolean isWall(int x, int y){
        return maze[x][y] == WALL;
    }

    public void setVisited(int x, int y, boolean visit){
        visited[x][y] = visit;
    }

    public boolean isValidLocation(int x, int y){
        if(x < 0 || x >= maze.length || y < 0 || y >= maze[0].length){
            return false;
        }
        return true;
    }

    public String stringPath(List<Coordinate> path){
        int[][] tempMaze = Arrays.stream(maze)
                .map(int[]::clone)
                .toArray(int[][]::new);
        for(Coordinate pCoord : path){
            tempMaze[pCoord.getX()][ pCoord.getY()] = PATH;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tempMaze.length; i++){
            for(int j=0; j < tempMaze[i].length; j++){
                if(tempMaze[i][j] == ROAD){
                    sb.append(" ");
                } else if (tempMaze[i][j] == WALL){
                    sb.append("#");
                } else if (tempMaze[i][j] == START){
                    sb.append("S");
                } else if (tempMaze[i][j] == EXIT){
                    sb.append("E");
                } else if (tempMaze[i][j] == PATH){
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
