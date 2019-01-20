import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    static int findDiagonalDifference (int[][] arr) {
        
        // Find matrix dimensions
        int rows = arr.length;
        
        int leftright = 0;
        int rightleft = 0;
        for (int i = 0; i < rows ; i++) {
            leftright += arr[i][i];
            rightleft += arr[i][(rows - 1) - i];
        }
        
        return Math.abs(leftright - rightleft);
    }

    public static void main(String args[]) {
        int[][] matrix = new int [][] {
            
                {11,2,4},
                {4,5,6},
                {10,8,-12}
            
        };

        int ret = findDiagonalDifference(matrix);
        System.out.println("Return: " + ret);
    }
}