import java.util.ArrayList;

public class Rook extends Piece {
    
    public Rook(int nx, int ny, int nside) {
	x = nx;
	y = ny;
	side = nside;
    }

    public int[][] getMoves(Board board) {
	ArrayList moves = new ArrayList<Integer[]>();
	int tempx = x;
	int tempy = y;
	int[] move = new int[2];
	while (tempx <= 7 && board.get(tempx, y) == null) {
	    move[0] = tempx;
	    move[1] = y;
	    moves.add(move);
	    tempx++;

	    if (tempx <= 7 && board.get(tempx, y).getSide() != side) {
		move[0] = tempx;
		moves.add(move);
	    }
	}
	tempx = x;
	while (tempx >= 0 && board.get(tempx, y) == null) {
	    move[0] = tempx;
	    move[1] = y;
	    moves.add(move);
	    tempx--;

	    if (tempx >= 0 && board.get(tempx, y).getSide() != side) {
		move[0] = tempx;
		moves.add(move);
	    }
	}
	tempx = x;
	while (tempy <= 7 && board.get(x, tempy) == null) {
	    move[0] = x;
	    move[1] = tempy;
	    moves.add(move);
	    tempy++;

	    if (tempy <= 7 && board.get(x, tempy).getSide() != side) {
		move[1] = tempy;
		moves.add(move);
	    }
	}
	tempy = y;
	while (tempy >= 0 && board.get(x, tempy) == null) {
	    move[0] = x;
	    move[1] = tempy;
	    moves.add(move);
	    tempy--;

	    if (tempy >= 0 && board.get(x, tempy).getSide() != side) {
		move[1] = tempy;
		moves.add(move);
	    }
	}

	int[][] ret = new int[moves.size()][2];
	for (int i = 0; i < ret.length; i++)
	    ret[i] = (int[]) moves.get(i);
	return ret;

    }
    
}
