import java.util.Scanner;

public class NameFromEmailTrialExam{

    public static void main(String[] args) {

        String email;
        String firstName;
        String lastName;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the email address (firstName.lastName@exam.com):\n ");
        email = keyboard.nextLine();

        int index = email.indexOf('.');
        int index2 = email.indexOf('@');

        firstName = email.substring(0, index);
        lastName = email.substring(index + 1, index2);

        System.out.println(upperCase(lastName, firstName));
    }
        public static String upperCase (String input1, String input2) {
            String x = input1.substring(0, 1).toUpperCase() + input1.substring(1);
            String y = input2.substring(0, 1).toUpperCase() + input2.substring(1);

            String name = x + " " + y;
            return name;
    }
  }



        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter

      //  System.out.println(nameFromEmail("elek.viz@exam.com"));
