import java.util.Scanner;
public class data2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value 1:");//fixed the scanner instantiation
        int a=sc.nextInt();
        System.out.print("enter value 2:");
        int b=sc.nextInt();
        System.out.println("before swap:a="+ a +",b="+ b);
        int temp=a;
         a=b;
        b=temp;
        System.out.println("after swap:a="+ a +",b="+ b);
    }
}
