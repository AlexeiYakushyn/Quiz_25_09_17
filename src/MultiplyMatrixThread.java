import java.util.concurrent.Callable;

/**
 * Created by alexei.yakushyn on 28.09.2017.
 */
public class MultiplyMatrixThread implements Callable<Integer> {
    private int x;
    private int y;

    public MultiplyMatrixThread(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        return x*y;
    }
}
