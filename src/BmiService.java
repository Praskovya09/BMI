public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        double result = weightInKg / (heightInMeters * heightInMeters);
        return (int) result;
    }
}
