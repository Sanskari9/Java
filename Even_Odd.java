import java.util.*;
public class Even_Odd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no."); 
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("Number is even no.");
        }else{
              System.out.println("Number is odd");
        }

    }
}
