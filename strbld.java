public class strbld {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("my name is c r arun and i am studying in bapuji institute of engineering and the ..");
        System.out.println(sb);
        sb.indexOf("a", 0);
        System.out.println(sb.indexOf("a", 0));   
        System.out.println(sb.indexOf("the", 10));
        System.out.println(sb.lastIndexOf("is"));
    }
    
}
