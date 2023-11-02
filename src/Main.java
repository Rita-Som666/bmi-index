public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mKg = 98;
        double hM = 1.87;
        int bmi = service.calculate(mKg, hM);
        System.out.println(bmi);
    }
}