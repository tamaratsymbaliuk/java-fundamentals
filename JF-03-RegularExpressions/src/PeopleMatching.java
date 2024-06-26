import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {
    public static void main(String[] args) {

         String people = """
                Flinstone, Fred, 1/01/1900
                Rubble, Barney, 2/02/1905
                Flinstone, Wilma, 3/03/1910
                Rubble, Betty, 4/4/1915
                """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);


        while (mat.find()) {
            System.out.printf("%s %s %s%n", mat.group("firstName"), mat.group("lastName"), mat.group("dob"));
            /*System.out.println(mat.group("firstName"));
            System.out.println(mat.group("lastName"));
            System.out.println(mat.group("dob"));
            System.out.println(mat.start("firstName"));
            System.out.println(mat.end("firstName"));*/
        }
    }
}
