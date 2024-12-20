package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int i=0; i<size; i++) {
          for (int j=0; j<size; j++) {
            grid[i][j]=" ";
          }
        }
        int mid = size/2;
        for (int i=0; i<size; i++) {
          grid[i][mid]="*";
          grid[mid][i]="*";
          if (i==mid) continue;
          grid[i][i]="*";
          grid[i][size - i - 1] = "*";
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
