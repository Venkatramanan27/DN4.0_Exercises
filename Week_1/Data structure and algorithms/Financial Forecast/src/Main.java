public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;      
        double growthRate = 0.05;          
        int years = 5;
        System.out.println("Initial Value: $" + initialValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "% per year");
        System.out.println("Years: " + years);
        double futureValue = ForecastCalculator.calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years: $%.2f%n", years, futureValue);
        ForecastAnalysis.explain();
    }
}
