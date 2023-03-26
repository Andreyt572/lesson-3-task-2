public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 80;
        double heightM = 1.79;
        int index = service.calculate((int) 80, (double) 1.79);
        System.out.println(index);

    }
}
