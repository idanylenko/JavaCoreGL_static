public class Calculator {
    public static double calcPi (int n) {
        double pi = 0;
        int numerator = 4;
        double denominator = 1;

        for (int i = 0; i < n; i++) {
            pi += numerator / denominator;
            numerator *= (-1);
            denominator += 2;
        }

        return pi;
    }
}
