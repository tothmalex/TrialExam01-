import java.util.ArrayList;
import java.util.Arrays;

public class UrlsFromHandles{
    public static void main(String[] args){

        ArrayList<String> handles = new ArrayList<>();
        handles.addAll(Arrays.asList("tothmalex", "kaghee"));
        System.out.println(urlsFromHandles(handles));
    }

    public static ArrayList<String> urlsFromHandles(ArrayList<String> list) {
        String url = "https://github.com/greenfox-academy/";
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            links.add(url.concat(list.get(i)));
        }
        return links;
    }
}

// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

