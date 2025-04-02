import java.io.*;
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        int l=5,w=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        l=sc.nextInt();
        System.out.println("Enter the width of rectangle:");
        w=sc.nextInt();
      // l X w        l*w  
        System.out.println("Area of rectangle is:"+(l*w));
    }
}