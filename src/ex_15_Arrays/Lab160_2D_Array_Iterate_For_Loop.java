package ex_15_Arrays;

public class Lab160_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) { //matrix.length -> will give row
            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length -> will give coulmn
                System.out.print( "*" + "  | ");

            }
            System.out.println();


        }


    }
    }