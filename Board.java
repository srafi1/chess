public class Board {
    private Piece[][] board;
    
    public Board() {
	board = new Piece[8][8];
    }

    public void start() {
	for (int i = 0; i < 2; i++) {
	    board[i*7][0] = new Rook(i*7, 0, i);
	    board[i*7][1] = new Knight(i*7, 1, i);
	    board[i*7][2] = new Bishop(i*7, 2, i);
	    board[i*7][3] = new Queen(i*7, 3, i);
	    board[i*7][4] = new King(i*7, 4, i);
	    board[i*7][5] = new Bishop(i*7, 5, i);
	    board[i*7][6] = new Knight(i*7, 6, i);
	    board[i*7][7] = new Rook(i*7, 7, i);
	    int y;
	    if (i == 0) y = 1;
	    else y = 6;
	    for (int j = 0; j < 8; j++)
		board[y][j] = new Pawn(y, j, i);
	}
    }

    public Piece[][] getBoard() {
	return board;
    }

    public Piece get(int x, int y) {
	return board[y][x];
    }

    public void set(int px, int py, int nx, int ny) {
	board[ny][nx] = board[py][px];
    }
    
}
