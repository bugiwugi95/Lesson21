package src;

import java.util.Scanner;

public class Task5 {
    //5.Пользователь вводит предложение их двух слов (считайте в одну переменную String phrase).
    // Вставьте между этими словами «так сказать» используя StringBuilder.insert.
    // Было: «Учу Java». Станет: «Учу, так сказать, Java»
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(line);
        int index;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == ' ') {
                index = i;
                builder.insert(index,",так сказать,");
            }
        }
        String phrase = builder.toString();
        System.out.println(phrase);


    }
}