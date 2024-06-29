import java.util.*;
public class comp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="my name is arun";
        String s2="my name is satish";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(11));
        System.out.println(s1.regionMatches(5, s2, 0, s2.length()));
    }
}