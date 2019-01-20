import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class largesum {

    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (int i = 0; i < ar.length;i++){
            result += ar[i]; 
        }
        return result;
    }

    public static void main(String[] args) {
        long[] vals ={1000000001,1000000002,1000000003,1000000004,1000000005};

        long ret = aVeryBigSum(vals);
        System.out.println("return: " + ret);
    }
}