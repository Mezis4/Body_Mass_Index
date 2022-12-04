public class BmiService {

    public double calculate(int mass, double height) {
        double h = height / 100;
        double index = mass / (h * h);
        return index;
    }
}
