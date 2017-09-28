/**
 * Created by alexei.yakushyn on 27.09.2017.
 */
public class Main {

    public static void main(String[] args) {
        MultiplyMatrix matrix = new MultiplyMatrix();

        int[][] first = matrix.generateMatrix(50, 40);
        int[][] second = matrix.generateMatrix(50, 500);
        System.currentTimeMillis();
        int[][] res = matrix.matrixMultiply(first, second);

//        Thread thread = new Thread(new MultiplyMatrixThread());
//
//        thread.start();
    }
}
