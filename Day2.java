import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Operator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();

        double tip = mealCost*tipPercent/100;
        double tax = mealCost*taxPercent/100;
        int totalCost = (int)Math.round(tip+tax+mealCost);
        System.out.println(""+totalCost);
    }
}