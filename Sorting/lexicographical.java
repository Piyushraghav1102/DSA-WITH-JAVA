class lexicographical {

    static void printarr(String arr2[]) {

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    static void Sortinlexico(String arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        printarr(arr);
    }

    public static void main(String[] args) {
        String fruits[] = { "kiwi", "apple", "papaya", "mango" };

        Sortinlexico(fruits);
    }
}