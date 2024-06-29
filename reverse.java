public class reverse {
    public static void main(String[] args) {
        String input = "Arun chavan";
        char[] charArray = input.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
             System.out.print(charArray[i]);
            }


    }
}
