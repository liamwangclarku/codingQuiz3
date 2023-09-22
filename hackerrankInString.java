import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        String compareString = "hackerrank";
        String buildString = "";
        int stringLength = s.length();
        int compI = 0;
        char compChar = compareString.charAt(compI);
        for (int i = 0; i < stringLength; i++) {
            char c = s.charAt(i);
            if (c == compChar && buildString.length() < 10) {
                buildString = buildString + c;
                if (compI < 9) {
                    compI++;
                    compChar = compareString.charAt(compI);
                }
            }
        }
        System.out.println(buildString);
        if (buildString.equals(compareString)) {
            return "YES";
        } else {
            return "NO";
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
