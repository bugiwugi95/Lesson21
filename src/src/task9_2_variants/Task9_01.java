package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class Task9_01 {
    //9.Скачайте цитату из breaking bad и замените все плохие слова звёздочками
    public static void main(String[] args) throws IOException {
        String page = downloadWebPage("https://api.breakingbadquotes.xyz/v1/quotes");
        int startQuote = page.lastIndexOf("quote");
        int endQuote = page.lastIndexOf(",");
        String quote = page.substring(startQuote + 8, endQuote - 1);
        String[] arr = {"Bitch", "bitch", "F*ck", "f*ck", "kill"};
        String[] word = new String[quote.length()];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i != arr.length; ++i) {
            builder.append("*");
            quote = quote.replaceAll(arr[i],builder.toString());



        }

        System.out.println(quote);

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