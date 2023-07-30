public class Main {
    public static void main(String[] args) {
        int pounds = 10000;
        int day = 0;

        while (pounds > 0) {
            double change = 1 + (Math.random() * 2);
            day++;
            if (change > 1.15) {
                pounds -= 10000;
            }
            System.out.println("the remain pounds:" + pounds);
        }
        System.out.println("Days to sell all pounds:"+ day);
    }
}
