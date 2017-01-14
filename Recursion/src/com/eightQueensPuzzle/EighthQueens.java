package com.eightQueensPuzzle;

import java.util.HashSet;
import java.util.Set;

public class EighthQueens {
    private static final int queensCount = 8;

    private int size;
    private boolean[][] chessboard;
    private Set<Integer> attackedRows = new HashSet<>();
    private Set<Integer> attackedColumns = new HashSet<>();
    private Set<Integer> attackedLeftDiagonals = new HashSet<>();
    private Set<Integer> attackedRightDiagonals = new HashSet<>();

    int solutionsCount = 0;

    public EighthQueens(int size) {
        this.size = size;
        this.chessboard = new boolean[size][size];
    }

    public EighthQueens() {
        this.size = queensCount;
        this.chessboard = new boolean[size][size];
    }

    public void putQueens(int row){
        if (row == size){
            this.printSolution();
        } else {
            for (int col = 0; col < size; col++) {
                if (canPlaceQueen(row, col)){
                    this.markAllAttackPositions(row, col);
                    this.putQueens(row + 1);
                    this.unmarkAllAttackPositions(row, col);
                }
            }
        }
    }

    private boolean canPlaceQueen(int row, int col){
        boolean positionOccupied = this.attackedRows.contains(row) ||
                this.attackedColumns.contains(col) ||
                this.attackedLeftDiagonals.contains(col - row) ||
                this.attackedRightDiagonals.contains(row + col);

        return !positionOccupied;
    }

    private void markAllAttackPositions(int row, int col) {
        this.attackedRows.add(row);
        this.attackedColumns.add(col);
        this.attackedLeftDiagonals.add(col - row);
        this.attackedRightDiagonals.add(row + col);
        this.chessboard[row][col] = true;
    }

    private void unmarkAllAttackPositions(int row, int col) {
        this.attackedRows.remove(row);
        this.attackedColumns.remove(col);
        this.attackedLeftDiagonals.remove(col - row);
        this.attackedRightDiagonals.remove(row + col);
        this.chessboard[row][col] = false;
    }

    private void printSolution() {
        this.solutionsCount++;
        System.out.println(this.solutionsCount);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (this.chessboard[row][col]){
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}
