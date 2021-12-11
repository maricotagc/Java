//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true 

package mari.moita.com.Exercise8.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Adder extends Arithmetic {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int line1 = scanner.nextInt();
        int[] A = new int[line1];
        scanner.nextLine();
        String B = "";
        B = B + scanner.nextLine();
        String[] intParts = B.split(" ");
        for (int i = 0; i < line1; i++) {
            A[i] = Integer.parseInt(intParts[i]);
        }
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                sum++;
            }
            for (int j = i + 1; j < A.length; j++) {
                int[] subArr = Arrays.copyOfRange(A, i, j + 1);
                if (Arrays.stream(subArr).sum() < 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
