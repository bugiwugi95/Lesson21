package src;

public class Task11 {
    //10.Напишите крестики-нолики, используя StringBuilder
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("|.||.||.|\n");
        builder.append("|.||.||.|\n");
        builder.append("|.||.||.|");
        builder.replace(1,2,"x");
        builder.replace(4,5,"x");
        builder.replace(7,8,"0");
        String str = builder.toString();
        System.out.println(str);


    }
}