package exerciseWeek3;

public class ex2 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 11, 12, 13, 14},
                {20, 21, 22},
                {30, 31, 32, 33},
                {40},
                {50, 51}
        };


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
