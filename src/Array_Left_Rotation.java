import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array_Left_Rotation {

    private static int[] arrayLeftRotation(int[] a, int n, int k) {

        int[] rotated = new int[n];
        for(int i = 0; i < a.length; i++) {
            rotated[i] = a[(i + k) % a.length];
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output;
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
