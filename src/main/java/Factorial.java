public class Factorial {

    private final int number;
    private int fact = 1;

    public Factorial(int i) {
        this.number = i;
    }

    public int factorial() {
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
