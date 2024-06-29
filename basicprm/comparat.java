package basicprm;
import java.util.*;

public class comparat {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>(){

           public int compare(Integer i,Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
            
        List <Integer> a1=new ArrayList<Integer>();

        a1.add(28);
        a1.add(37);
        a1.add(42);
        a1.add(98);
        Collections.sort(a1,com);
        System.out.println(a1);

    }
}
