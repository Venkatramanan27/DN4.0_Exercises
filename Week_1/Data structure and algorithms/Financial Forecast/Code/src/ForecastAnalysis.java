public class ForecastAnalysis {
    public static void explain() {
        System.out.println("\n--- Recursive Forecasting Analysis ---");
        System.out.println("Time Complexity: O(n), because we call the method once per year.");
        System.out.println("Problem: Too many recursive calls for large n → Stack Overflow risk.");
        System.out.println("Solution: Use Memoization or convert to Iterative approach for optimization.");
    }
}
