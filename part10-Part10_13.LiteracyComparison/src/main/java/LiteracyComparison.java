
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            //read all lines from the csv and is an element in stream
            Files.lines(Paths.get("literacy.csv"))
                    //splitting at comma
                    .map(s -> s.split(","))
                    //sorting array which represents literacypercent in index 5
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    //printing, p[3]=countryname , Year is converted from string to integer p[4], male/female % is splitted at space and gender is fetched, String is converted to double of literacy
                    .forEach(p -> System.out.println(p[3] + " (" + Integer.parseInt(p[4]) + "), " + p[2].split(" ")[1].trim() + ", " + Double.parseDouble(p[5])));
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}
