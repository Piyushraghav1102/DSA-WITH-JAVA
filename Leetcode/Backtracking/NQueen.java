public class NQueen {

    public static boolean checkcondition(char nums[][], int row, int col) {

        //for the middle column
        for (int i = row - 1; i >= 0; i--) {
            if (nums[i][col] == 'Q')
                return false;
        }

        //For the upper left row&col
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nums[i][j] == 'Q')
                return false;

        }

        //For the upper left row&col
        for (int i = row - 1, j = col + 1; i >= 0 && j < nums.length; i--, j++) {
            if (nums[i][j] == 'Q')
                return false;

        }
        return true;
    }

    public static boolean PlaceQueens(char CB[][], int row) {

        //Base case
        if (row == CB.length) {
            System.out.println("-----------chess board-----------");
            return true;

        }

        //Recursion
        for (int j = 0; j < CB.length; j++) {
            if (checkcondition(CB, row, j)) {
                CB[row][j] = 'Q';
                if (PlaceQueens(CB, row + 1)) {
                    return true;
                }

                CB[row][j] = '*';
            }
        }
        return false;
    }

    public static void PrintCB(char CB[][]) {
        for (int i = 0; i < CB.length; i++) {
            for (int j = 0; j < CB.length; j++) {
                System.out.print(CB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char chessboard[][] = new char[n][n];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                chessboard[i][j] = '*';
            }
        }

        if (PlaceQueens(chessboard, 0)) {
            System.out.println("Solution is possible :- ");
            PrintCB(chessboard);
        }
        else {
        System.out.println("Solution is not possible ");
        }
    }
}

