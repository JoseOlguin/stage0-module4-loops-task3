package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int ready = 0, next = 1;
        for (int i = lastFibonacci; i > 0; i--) {
            System.out.println(ready);
            int t = next;
            next += ready;
            ready = t;
        }
    }
}
