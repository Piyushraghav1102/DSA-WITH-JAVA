
import java.util.ArrayList;

public class sort_linear {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 4, 4, 5, 6 };
        ArrayList<Integer> list = new ArrayList<>();

        // System.out.println(issorted(arr, 0));
        // System.out.println(search(arr, 9, 0));
        // System.out.println(Allsearch(arr, 4, 0, list));
    }

    static int search(int arr[], int tar, int i) { // one index return

        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == tar) {
            return i;
        }

        return search(arr, tar, i + 1);

    }

    static ArrayList<Integer> Allsearch(int arr[], int tar, int i, ArrayList<Integer> list) { // all index return in
                                                                                              // list

        if (i == arr.length - 1) {
            return list;
        }

        if (arr[i] == tar) {
            list.add(i);
        }

        return Allsearch(arr, tar, i + 1, list);

    }

    static Boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }
}
