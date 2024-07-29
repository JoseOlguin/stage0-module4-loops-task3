package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int factor = 10, sum = 0;
        for (int i = lengthOfLastNumber; i > 0; i--) {
            sum += (factor - 1);
            factor *= 10;
        }
        System.out.println(sum);
    }
}
