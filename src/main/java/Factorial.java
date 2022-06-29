public class Factorial {

    private final int number;
    private int fact = 1;

    public Factorial(int number) {
        this.number = number;
    }

    public int factorial() {
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
