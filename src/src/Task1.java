import java.util.Scanner;

public class Task1 {
    //1.Пользователь вводит стихотворение из четырёх строк.
    // Соберите их в одну переменную, между каждой строкой вставьте символ переноса строки: «\n»
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String user = sc.nextLine();
            builder.append(user);
            if (i < 3) {
                builder.append("\n");
            }
        }
        String str = builder.toString();
        System.out.println(str);

    }
}