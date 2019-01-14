package traversal;
/*
 * Created by onkartalekar on 11/16/2018
 */

public class ConnectedCells {

    public static void main(String... args) {
        int[][] arr = {{0, 0, 0, 1, 1, 0, 0},
                       {0, 1, 0, 0, 1, 1, 0},
                       {1, 1, 0, 1, 0, 0, 1},
                       {0, 0, 0, 0, 0, 1, 0},
                       {1, 1, 0, 0, 0, 0, 0},
                       {0, 0, 0, 1, 0, 0, 0}};
        System.out.println(getMaxRegionSize(arr));
    }

    private static int getMaxRegionSize(int[][] arr) {
        int maxRegionSize = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 1) {
                    int size = getMaxRegionSize(arr, row, col);
                    maxRegionSize = Math.max(size, maxRegionSize);
                }
            }
        }
        return maxRegionSize;
    }

    private static int getMaxRegionSize(int[][] arr, int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[row].length) {
            return 0;
        }

        if (arr[row][col] == 0) {
            return 0;
        }
        arr[row][col] = 0;
        int size = 1;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r != row || c != col) {
                    size += getMaxRegionSize(arr, r, c);
                }
            }
        }


        return size;
    }
}
