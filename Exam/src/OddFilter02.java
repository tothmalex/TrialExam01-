import java.util.ArrayList;

public class OddFilter02 {
    public static void main(String[] args) {

        int[] numberArray;
        numberArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(oddFilter(numberArray));
    }

    public static ArrayList<Integer> oddFilter(int[] numberArray) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                oddList.add(numberArray[i]);
            } else {}
        }
        return oddList;
    }
}

// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the orignal list
// System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
// should print [1, 3, 5]
