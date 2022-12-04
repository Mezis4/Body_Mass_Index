public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        String bmi = String.format("%.2f",service.calculate (49, 157));
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}