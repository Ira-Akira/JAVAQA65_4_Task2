public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.65;
        double weight = 53;
        double bodyMassIndex = service.calculate(height, weight);
        System.out.println("При росте: " + height + "м");
        System.out.println("и весе: " + weight + "кг");
        System.out.println("Ваш индекс массы тела равен: " + (int) bodyMassIndex);

    }
}


