class Pair {
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    private static final int[] dy = {1, -1, 0, 0};
    private static final int[] dx = {0, 0, 1, -1};

    public static void solve(char[][] board) {
        int rowLen = board.length;
        int colLen = board[0].length;

        boolean[][] visited = new boolean[rowLen][colLen];

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (board[row][col] == 'O' && !visited[row][col]) {
                    List<Pair> pairs = new ArrayList<>();
                    boolean xFlag = bfs(board, visited, row, col, rowLen, colLen, pairs);

                    if (!xFlag) {
                        for (Pair p : pairs) {
                            board[p.row][p.col] = 'X';
                        }
                    }
                }
            }
        }
    }

    private static boolean bfs(char[][] board, boolean[][] visited, int row, int col, int rowLen, int colLen, List<Pair> pairs) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(row, col));
        visited[row][col] = true;
        boolean xFlag = false;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            pairs.add(current);

            if (current.row == 0 || current.row == rowLen - 1 || current.col == 0 || current.col == colLen - 1) {
                xFlag = true;
            }

            for (int i = 0; i < 4; i++) {
                int nRow = current.row + dy[i];
                int nCol = current.col + dx[i];

                if (nRow >= 0 && nRow < rowLen && nCol >= 0 && nCol < colLen && board[nRow][nCol] == 'O' && !visited[nRow][nCol]) {
                    queue.offer(new Pair(nRow, nCol));
                    visited[nRow][nCol] = true;
                }
            }
        }

        return xFlag;
    }
}