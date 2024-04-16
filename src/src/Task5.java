package src;

import java.util.Scanner;

public class Task4 {
    //4.Пользователь вводит пять слов, соберите из них целую строку, между каждым словом вставьте «, и»
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            String user = sc.nextLine();
            builder.append(user);
            if (i < 4) {
                builder.append(", и");
            }
        }
        String str = builder.toString();
        System.out.println(str);

    }
}