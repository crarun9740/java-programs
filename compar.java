public class compar {
    public static void main(String[] args) {
    //     int[] numbers = {10, 20, 15, 30, 5};
    //     int max = numbers[0];

    //     for (int i = 1; i < numbers.length; i++) {
    //         if (numbers[i] > max) {
    //             max = numbers[i];
    //         }
    //     }

    //     System.out.println("Maximum value in the array: " + max);
    int a[]={44,6,7,9,};
    int max=a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    System.out.println(max);
    }
}
