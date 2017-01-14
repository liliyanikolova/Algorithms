package com.allPathsInLabyrinth;

import java.util.ArrayList;
import java.util.List;

public class AllPathsInLabyrinth {
    private char[][] labyrinth;
    private List<Character> path;

    public AllPathsInLabyrinth(char[][] labyrinth) {
        this.labyrinth = labyrinth;
        this.path = new ArrayList<>();
    }

    public void findPathToExit(int row, int col, char direction){
        if (!inRange(row, col)){
            return;
        }

        this.path.add(direction);

        if (this.labyrinth[row][col] == 'e'){
            this.printPath();
            return;
        }

        if (this.labyrinth[row][col] != ' '){
            this.path.remove(this.path.size() - 1);
            return;
        }

        this.labyrinth[row][col] = 'v';

        this.findPathToExit(row, col + 1, 'R');
        this.findPathToExit(row, col - 1, 'L');
        this.findPathToExit(row + 1, col, 'D');
        this.findPathToExit(row - 1, col, 'U');

        this.labyrinth[row][col] = ' ';
        this.path.remove(this.path.size() - 1);
    }

    private boolean inRange(int row, int col){
        boolean rowInRange = row >= 0 && row < labyrinth.length;
        boolean columnInRange = false;
        if (rowInRange){
            columnInRange = col >= 0  && col < labyrinth[row].length;
        }

        return rowInRange && columnInRange;
    }

    private void printPath() {
        for (Character direction : path) {
            System.out.print(direction);
        }

        System.out.println();
    }
}
