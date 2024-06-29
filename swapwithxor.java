import java.util.*;
public class swapwithxor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("before swapping \n a="+a+" "+"b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping \n a="+a+" "+"b="+b);
    }
}
