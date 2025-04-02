import java.util.*;
import java.io.*;
public class Pattern1{
    public static void main(String args[]) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        c=sc.nextInt();
        for (int i=1;i<=c;i++){  //c=5
          for (int j=1;j<=c-i;j++){   // j=1 j<=4 j=2
            System.out.print("1");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("Center aligned pyramid:");
    for (int i=1;i<=c;i++){  //c=5

        for (int j=1;j<=c-i;j++){   // j=1 j<=4 j=2
          System.out.print("   ");
        }
        for (int j=1;j<=i;j++){    
              System.out.print(" *   ");
        }
        System.out.println(); 
    }
    System.out.println("Right aligned pyramid:");
    for (int i=1;i<=c;i++){  
        {
        for (int j=1;j<=c-i;j++){   
          System.out.print("   ");

        }
        for (int j=1;j<=i;j++){    
              System.out.print("*  ");
        }
        System.out.println();  
    } 
}
System.out.println("Left aligned pyramid:");
for (int i=1;i<=c;i++){  
    {
    for (int j=1;j<=c-1;j++){   
      System.out.print("   ");

    }
    for (int j=1;j<=i;j++){    
          System.out.print("* ");
    }
    System.out.println();  
} 
    }

  System.out.println("Center aligned pyramid:");
    for (int i=1;i<=c;i++){  //c=5

        for (int j=1;j<=c-i;j++){   // j=1 j<=4 j=2
          System.out.print("  ");
        }
        for (int j=1;j<=i;j++){    
              System.out.print(10+"   ");
        }
        System.out.println(); 
    } 
    System.out.println("Left aligned pyramid:");
for (int i=1;i<=c;i++){  
    {
    for (int j=1;j<=c-1;j++){   
      System.out.print("   ");

    }
    for (int j=1;j<=i;j++){    
          System.out.print(10+"  ");
    }
    System.out.println();  
} 
    } 
    System.out.println("Right aligned pyramid:");
    for (int i=1;i<=c;i++){  
        {
        for (int j=1;j<=c-i;j++){   
          System.out.print("  ");

        }
        for (int j=1;j<=i;j++){    
              System.out.print("10");
        }
        System.out.println();  
    } 
}
}
}

