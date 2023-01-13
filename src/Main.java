public class Main {
    public static void main(String[] args) {
        task1_4();
        task5_7();
        task8_10();
    }
    public static void task1_4(){
        System.out.println("Task 1");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("Task 2");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }
    public static void task5_7(){
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }
    }
    public static void task8_10(){
        System.out.println("Task 8");
        int money = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++){
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("Task 9");
        total = 0;
        for (int i = 0; i <= 12; i++){
            total += total/100;
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}