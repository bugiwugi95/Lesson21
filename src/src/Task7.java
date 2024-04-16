package src;

import java.util.Scanner;

public class Task6 {
    //6.Пользователь вводит число, любое. 237, например.
    // Выведите: 237 программистов, окончание должно зависеть от числа. 1 программист, 2 программиста, и так далее
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder builder = new StringBuilder();
        if (num > 1) {
            builder.insert(0, num);
            builder.append(" программиста");
        } else {
            builder.insert(0, num);
            builder.append(" программист");
        }
        String str = builder.toString();
        System.out.println(str);


    }
}