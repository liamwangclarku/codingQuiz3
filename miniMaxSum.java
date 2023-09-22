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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int listLength = arr.size();
        long miniSum = -1;
        long maxSum = 0;
        for (int i = 0; i < listLength; i++) {
            long sum = 0;
            for (int j = 0; j < 4; j++) {
                int indexTrue = (i + j) % listLength;
                sum = sum + arr.get(indexTrue);
            }
            if (miniSum == -1 || sum < miniSum) {
                miniSum = sum;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        System.out.println(miniSum + " " + maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
