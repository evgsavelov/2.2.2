public class BmiService {

    public double calculate(double weight, double height) {
        double bmi = weight / (height * height) / 100;
        return bmi;
    }


    public static void main(String[] args) {
        BmiService person = new BmiService();
        double index = person.calculate(86, 175);
        System.out.println(index);
    }
}
