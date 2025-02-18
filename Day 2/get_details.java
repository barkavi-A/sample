import java.util.Scanner;
class get_details{

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);  // To get user input data
        System.out.print("enter your name:");
        String name=obj.nextLine();
        System.out.print("enter your age:");
        int age=obj.nextInt();
        obj.nextLine();
        System.out.print("enter your address:");
        String address=obj.nextLine();
        System.out.print("enter three integer(a,b,c):");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println("d/e:"+(d/e));

        System.out.print("enter your score:");
        int score=obj.nextInt();
        double mark=score/10.0;
        System.out.print("your result:"+mark);
    }
}    
        
        


    

        
       
        

             
  

        
             


       



