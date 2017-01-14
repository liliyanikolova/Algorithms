package com.allPathsInLabyrinth;

public class Main {
    public static void main(String[] args) {
        char[][] labyrinth = {
                {' ', ' ', ' ', '*', ' ', ' ', ' '},
                {'*', '*', ' ', '*', ' ', '*', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', '*', '*', '*', '*', '*', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
        };

        AllPathsInLabyrinth allPathsInLabyrinth = new AllPathsInLabyrinth(labyrinth);
        allPathsInLabyrinth.findPathToExit(0, 0, 'S');
    }
}
