public class BMI {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.height = 175;
    person1.weight = 85;
    BmiService service = new BmiService();
        System.out.println(service.calculate(person1));
    }

    public static class BmiService {
        double calculate(Person p) {
            return p.weight / (p.height * p.height) / 10_000;
        }
    }

    public static class Person {
        double height;
        double weight;
    }
}
