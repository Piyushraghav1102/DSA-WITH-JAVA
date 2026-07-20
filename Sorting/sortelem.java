class sortele {
    static void printarr(int arr22[]) {

        for (int i = 0; i < arr22.length - 1; i++) {
            System.out.print(arr22[i] + " ");
        }

    }

    static void Sortele(int num[]) {
        int n = num.length;
        int x = -1, y = -1;

        for (int i = 1; i < n; i++) {
            if (num[i - 1] > num[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;

        printarr(num);

    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 6, 7, 8, 9, 3 };
        Sortele(arr);
    }
}