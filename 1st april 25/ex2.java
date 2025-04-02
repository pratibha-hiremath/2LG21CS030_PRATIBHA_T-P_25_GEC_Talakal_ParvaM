import java.io.*;
import java.util.Scanner;
public class ex2{
    public static void main(String[] args) {
        int b=5,h=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breadth of triangle:");
        b=sc.nextInt();
        System.out.println("Enter the height of triangle:");
        h=sc.nextInt();
      // b X h       b*h  
        System.out.println("Area of triangle is:"+((b*h)/2));
    }
}