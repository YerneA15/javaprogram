
/*public class ankitay {
    public static void main(String[] args) {
        int a=10,b=10,c=10;
        if (a==b) {
     
        if (a==c) {
            System.out.println("Number is Equal");
        }
        else {
            System.out.println("Number is not Equal");
        }
    }
        else {
            System.out.println("Number is not Equal");
        }
    }
}*/

/*import java.util.Scanner;
public class ankitay
{
     public static void main(String[] args)
     {

        int a,b,ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter choice : ");
        ch =s.nextInt();
        switch(ch)
        {
            case 1:  System.out.println("Addition = "+(a+b));
            break;

            case 2: System.out.println("Substraction = "+(a-b));
            break;
        
            case 3:System.out.println("Multiplication = "+(a*b));
            break;

            case 4:System.out.println("Division = "+(a/b));
            break;

            case 5:System.out.println("Invalid choice");
            break;
     }
}
}*/

/*import java.util.Scanner;

public class ankitay {
    public static void main(String[] args) {

        int i = 1, a;
        System.out.println("Enter a");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        do {

            System.out.println(a * i);
            i++;

        }
        while(i<=10);

    }
}*/

// public class ankitay
// {
//     public static void main(String[] args)
//     {
//         int i=1;
//        do
//         {
//             System.out.println(i);
//             i++;
//         }
//         while(i<=10);
//     }
// }

import java.util.Scanner;
public class ankitay
{
    public static void main(String[] args) {
        int a[]=new int[5],i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Elements of array are :");
        for(int b:a)
        {
            System.out.println(b);
        }
    }
}