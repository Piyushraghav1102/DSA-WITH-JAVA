public class spiral {
    public static void sprial(int arr1[][]) {
        int startrow = 0;
        int endrow = arr1.length - 1;
        int startcol = 0;
        int endcol = arr1[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // for top boundary
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr1[startrow][j] + " ");
            }

            // Right boundary
            for (int i = startrow + 1; i <= endrow; i++) {

                System.out.print(arr1[i][endcol] + " ");
            }

            // bottom boundary
            for (int j = endcol - 1; j >= startcol; j--) {
                if (endrow == startrow) {
                    break;
                }
                System.out.print(arr1[endrow][j] + " ");
            }

            // left boundary
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr1[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr1[][] = { { 1, 2, 3, 4 },
                { 14, 15, 16, 5 },
                { 13, 20, 17, 6 },
                { 12, 19, 18, 7 },
                { 11, 10, 9, 8 } };

        sprial(arr1);
    }
}
