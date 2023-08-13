import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Привет, введи первое число");
        int firstNumber;
        int secondNumber;
        firstNumber = scanner.nextInt();
        System.out.println("Твоё первое число:" + firstNumber + "введи второе число");
        secondNumber= scanner.nextInt();
        int aruth = (firstNumber+secondNumber) / 2;
        int geom = ((int) Math.sqrt(firstNumber * secondNumber));
        System.out.println("Среднее арифметическое твоих чисел" + aruth);
        System.out.println("Среднее геометрическое твоих чисел" + geom);
        }catch (Exception ex) {
            System.out.println("Ты ввёл что то не так, дурачёк");
        }

    }
}