public class BmiService {
    public int calculate(int weightKg, double heightM) {
        int result;
        result = (int) (weightKg / (heightM * heightM));
        return result;
    }
}
