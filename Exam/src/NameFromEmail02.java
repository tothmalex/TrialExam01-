
import java.util.Scanner;

public class NameFromEmail02{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me the e-mail address!");
        nameFromEmail(sc.nextLine());
    }

    static String nameFromEmail(String input) {
        String splitEmail[] = input.split("[.\\@]");
        String name = splitEmail[1] + " " + splitEmail[0];
        System.out.println(name);
        return name;
    }
}