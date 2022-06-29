public class Factorial {

    private final int number;
    private int fact = 1;

    public Factorial(int number) {
        this.number = number;
    }

    public int factorial() {
        if (number == 0) {
            return 1;
        }
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
