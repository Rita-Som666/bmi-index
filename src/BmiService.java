public class BmiService {
    public int calculate(int mKg, double hM) {
        double bmi = mKg / hM / hM;
return (int) bmi;
    }

}
