class revbubble {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void Bubblesor(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printarr(arr);
    }

    static void OptBubblesor(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag == false)
                return;
        }

        printarr(arr);
    }

    public static void main(String[] args) {

        int nums[] = { 4, 5, 6, 7, 1, 2, 5 };

        Bubblesor(nums);
    }
}