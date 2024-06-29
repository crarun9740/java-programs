public class strsb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ramesh");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.setCharAt(3, 'h');
        System.out.println(sb);
        //inserting t
        sb.insert(0, 't');
        System.out.println(sb);
        //replacing char using setchar() method
        sb.setCharAt(4, 'e');
        System.out.println(sb);
        //delete the t
        sb.delete(0, 1);
        System.out.println(sb);
    }
    
}
