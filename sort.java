public class sort {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("JAVA J2EE");
        for(int i=0;i<=sb.length();i++){
            for(int j=1;j<=sb.length()-1;j++){
                if(i==j){
                    sb.deleteCharAt(j);
                }
            }
        }
        System.out.println(sb);

    }
        
}
