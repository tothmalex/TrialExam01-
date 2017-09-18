import java.util.Arrays;
import java.util.List;

public class OddFilterExam {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }
}

// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the orignal list

//System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
//System.out.println(oddFilter(Arrays.asList(1,2, 3, 4, 5)));

// should print [1, 3, 5]

