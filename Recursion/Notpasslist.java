import java.util.ArrayList;

public class Notpasslist {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 9, 9, 4, 5, 6 };
        System.out.println(Allsearchnotpasslist(arr, 9, 0));
    }

    static ArrayList<Integer> Allsearchnotpasslist(int arr[], int tar, int i) { // one index return
        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length - 1) {
            return list;
        }

        if (arr[i] == tar) {
            list.add(i);
        }

        ArrayList<Integer> allreturn = Allsearchnotpasslist(arr, tar, i + 1);

        list.addAll(allreturn);
        return list;
    }
}
