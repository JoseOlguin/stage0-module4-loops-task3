package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        number = (number < 0 ? number * -1 : number);
        String strNumber = number + "";
        int sum = 0;
        for (int i = strNumber.length(); i > 0; i--) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
