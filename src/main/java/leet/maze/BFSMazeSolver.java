package leet.maze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//from; https://github.com/eugenp/tutorials/blob/master/algorithms-miscellaneous-2/src/main/java/com/baeldung/algorithms/maze/solver/BFSMazeSolver.java
public class BFSMazeSolver {
    private static final int[][] Directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public List<Coordinate> BFTraversal(BMaze maze){
        LinkedList<Coordinate> nextToVisit = new LinkedList<>();
        nextToVisit.add(maze.getStart());

        while(!nextToVisit.isEmpty()){
            Coordinate curr = nextToVisit.remove();

            if(!maze.isValidLocation(curr.getX(), curr.getY())) continue;

            if(maze.isWall(curr.getX(), curr.getY())) continue;

            if(maze.isExit(curr.getX(), curr.getY())){
                return backTrack(curr);
            }
            for(int[] dir : Directions){
                Coordinate cor = new Coordinate(curr.getX() + dir[0], curr.getY() + dir[1], curr);
                nextToVisit.add(cor);
                maze.setVisited(curr.getX(), curr.getY(), true);
            }
        }
        return Collections.emptyList();
    }

    private List<Coordinate> backTrack(Coordinate end){
        List<Coordinate> path = new ArrayList<>();
        Coordinate curr = end;
        while(curr != null){
            path.add(curr);
            curr = curr.parent;
        }
        return path;
    }
}
