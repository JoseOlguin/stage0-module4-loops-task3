package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = first > second ? first : second;
        while (gcd > 0 && ((first % gcd != 0) || (second % gcd != 0))) {
            gcd--;
        }
        System.out.println(gcd);
    }
}
