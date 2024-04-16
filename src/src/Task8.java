package src;

import java.util.Scanner;

public class Task7 {
    //7.Пользователь вводит предложение, удалите все пробелы из него
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder builder = new StringBuilder(line);
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            if (ch == ' ') {
                builder.deleteCharAt(i);
                i--;
            }
        }
        String str = builder.toString();
        System.out.println(str);
    }
}