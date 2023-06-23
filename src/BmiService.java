public class BmiService {
    public int calculate(double height, double weight) {
        double bodyMassIndex = weight / (height * height);
        return (int) bodyMassIndex;
    }
}