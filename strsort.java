class Stringsort {
    static String a[] = {"NOW", "IS", "the", "time", "to", "do", "something"};

    public static void main(String[] args) {
        // Bubble sort algorithm
        for (int j = 0; j < a.length; j++) {
            for (int i = j + 1; i < a.length; i++) {
                // Compare adjacent strings and swap if necessary
                if (a[j].compareToIgnoreCase(a[i]) > 0) {
                    String temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        // Print the sorted array
        for (String s : a) {
            System.out.print(s + " ");
        }
    }
}
