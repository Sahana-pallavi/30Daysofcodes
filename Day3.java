import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
       if(N%2 > 0)
       {
           System.out.println("Weird");
       }
       else
       {
           if(2 <= N && N <= 5)
           {
               System.out.println("Not Weird");
           }
else if(6<=N && N<= 20)
{
System.out.println("Weird");
}
else if(20<N)
{
    System.out.println("Not Weird");
}
       }
    
    }
    }