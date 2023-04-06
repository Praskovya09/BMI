public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 61;
        double heightInMeters = 1.67;
        int result = service.calculate(weightInKg, heightInMeters);

        System.out.println("Ваш индекс массы тела:" + result);

        System.out.println();
        System.out.println("Ваш индекс массы тела:" + service.calculate(88, 1.82));

        System.out.println();
        System.out.println("Ваш индекс массы тела:" + service.calculate(96, 2.01));
    }
}