import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        System.out.println("the table of"+" "+n);
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    }

}
