import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab grade //+ one or more spaces
                Birthdate:\\s+(?<month>\\d{2})/(?<day>\\d{2})/(?<year>\\d{4}).* # Grab birthday 
                Gender:\\s+(?<gender>\\w+)\\b.* # Grab gender
                State\\sID:\\s+(?<stateID>\\d+)\\b.* # Grab state id
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* # Grab weightedGPA
                Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.]+)\\b.* # Grab unweightedGPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);

        if (mat.matches()) {
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("month"));
            System.out.println(mat.group("day"));
            System.out.println(mat.group("year"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateID"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("unweightedGPA"));

        }
    }
}
