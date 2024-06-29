public class large {
    public static void main(String[] args) {
        int arr1[]={1,6,7,9,6,9,68,9,8,88,99};
        int a=0;
       
        for(int i=0;i<arr1.length;i++){
            for(int j=1;j<=arr1.length;j++){
                if(arr1[i]>arr1[j]){
                     a=arr1[i];
                }
                else{
                    break;
                }
            }
        }
        System.out.println(a);
    } 
}
