import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by alexei.yakushyn on 25.09.2017.
 */
public class MultiplyMatrix {

    private int[][] matrixA;
    private int[][] matrixB;
    public int[][] res;
    private int[][] matrix;
    private int column;
    private int row;

    public MultiplyMatrix(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    public int[][] generateMatrix(int column, int row) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

//        try {
//            System.out.println("Input column quantity");
//            this.column = Integer.parseInt(reader.readLine());
//            System.out.println("Input row quantity");
//            this.row = Integer.parseInt(reader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        matrix = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                matrix[column][row] = random.nextInt(1000);
            }
        }

        return matrix;
    }

    public int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {

        res = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {

            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    res[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int[] re : res) {
            for (int j = 0; j < re.length; j++) {
                System.out.print(re[j] + " ");
            }
            System.out.println();
        }
        return res;
    }
}