package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class Task9 {
    //9.Скачайте цитату из breaking bad и замените все плохие слова звёздочками
    public static void main(String[] args) throws IOException {
        String page = downloadWebPage("https://api.breakingbadquotes.xyz/v1/quotes");
        int startQuote = page.lastIndexOf("quote");
        int endQuote = page.lastIndexOf(",");
        String quote = page.substring(startQuote + 8, endQuote - 1);
        StringBuilder builder = new StringBuilder(quote);
        String[] arr = {"Bitch", "bitch", "F*ck", "f*ck", "kill"};

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                char ch1 = Arrays.toString(arr).charAt(j);
                if (ch == ch1) {
                    builder.deleteCharAt(i);
                    i--;
                    i++;
                    builder.insert(i, "*");

                }

            }


        }
        String str = builder.toString();
        System.out.println(str);

    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();


        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }

        return result.toString();

    }
}