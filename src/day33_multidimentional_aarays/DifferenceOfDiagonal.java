package day33_multidimentional_aarays;

public class DifferenceOfDiagonal {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int difference=0;
        for (int i = 0; i < matrix.length; i++) {
            leftDiagonal += matrix[i][i];
            for (int j = matrix.length-1; j >= 0; j--) {
                rightDiagonal += matrix[i][j];
                break;
                }
        }
        difference = leftDiagonal-rightDiagonal;

        System.out.println(Math.abs(difference));
        }

    }

