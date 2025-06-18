public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double amount, double rate, int years) {
        if (years == 0) return amount;
        return (1 + rate) * futureValue(amount, rate, years - 1);
    }

    public static void main(String[] args) {
        double amount = 1000;
        double rate = 0.05;
        int years = 5;

        double result = futureValue(amount, rate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, result);
    }
}

