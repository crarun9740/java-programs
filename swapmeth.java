import java.util.*;
public class swapmeth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b=8;
        System.out.println("before swapping a="+a+" "+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a="+a+" "+"b="+b);

    }
}