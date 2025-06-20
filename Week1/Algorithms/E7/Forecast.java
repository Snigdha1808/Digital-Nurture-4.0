public class Forecast {
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return (1 + growthRate) * forecastValue(initialValue, growthRate, years - 1);
    }
    public static double forecastValueIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
    public static void main(String[] args) {
        double baseValue = 10000;
        double growthRate = 0.10;  
        int years = 5;

        double futureValueRecursive = forecastValue(baseValue, growthRate, years);
        double futureValueIterative = forecastValueIterative(baseValue, growthRate, years);

        System.out.printf("Recursive Forecast: ₹%.2f\n", futureValueRecursive);
        System.out.printf("Iterative Forecast: ₹%.2f\n", futureValueIterative);
    }
}
