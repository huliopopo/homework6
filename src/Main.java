public class Main {
    public static void main(String[] args) {
        //Task1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //Task2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Task3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        //Task4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //Task5
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Task6
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //Task7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Task8
        int sum = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            sum = sum + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        //Task9
        sum = 0;
        deposit = 29000;
        for (int i = 0; i < 12; i++) {
            sum = sum + sum / 100 + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        //Task10
        int multiplier = 2;
        int product;
        for (int i = 1; i < 11; i++) {
            product = multiplier * i;
            System.out.println(multiplier + "*" + i + "=" + product);
        }
    }
}