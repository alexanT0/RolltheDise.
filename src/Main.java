import com.sun.source.tree.Scope;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо найти и уничтожить запущенный злоумышленниками вирус");
        int range = 100;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали! Вирус уничтожен!");
                break;
            }

            int a = 0;
                if (input_number < number) {
                    System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                    a++;
                    System.out.println("Количество попыток: " + a);
                } else {
                int b = a;
                    System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
                    b++;
                    System.out.println("Количество попыток: " + b);
                }
            }
        }
    }





