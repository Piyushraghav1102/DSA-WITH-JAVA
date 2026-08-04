public class Lc130 {


    public static void dfs(char[][] board, int i, int j) {

        int n = board.length;
        int m = board[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != 'O') return;

        // Mark as "Safe" (connected to boundary)
        board[i][j] = '#';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }

    public static void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int n = board.length;
        int m = board[0].length;

        // Step 1: DFS from boundary 'O's
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][m - 1] == 'O') dfs(board, i, m - 1);
        }
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[n - 1][j] == 'O') dfs(board, n - 1, j);
        }

        // Step 2 & 3: Flip 'O' to 'X', and '#' back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }

    }

    public static void printboard(char[][] grid){
        int n=grid.length;
        int m=grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(grid[i][j]+",");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {

        char[][] grid = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        printboard(grid);
        solve(grid);
        System.out.println();
        printboard(grid);

    }
}
