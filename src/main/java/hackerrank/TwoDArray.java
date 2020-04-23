package hackerrank;

public class TwoDArray {
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 2; row < arr.length; row++){
            for(int col = 2; col < arr[row].length; col++){
                int newNum = getIValue(arr, row , col);
                max = Math.max(max, newNum);
            }
        }

        return max;
    }

    static int getIValue(int[][] arr, int row, int col){
        int total = 0;
        for(int i = col; i >= col - 2; i--){
            total += arr[row][i];
            total += arr[row-2][i];
        }
        total += arr[row-1][col-1];
        System.out.println(total);

        return total;
    }
}
