import java.util.ArrayList;

public class Knight extends Piece {
    
    public Knight(int nx, int ny, int nside) {
	x = nx;
	y = ny;
	side = nside;
    }

    public int[][] getMoves(Board board) {
	ArrayList moves = new ArrayList<Integer[]>();
	int[] move = new int[2];
	if (x + 1 <= 7 && y - 2 >= 0) {
	    Piece otherPiece = board.get(x+1, y-2);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x+1;
		move[1] = y-2;
		moves.add(move);
	    }
	}
	if (x + 2 <= 7 && y - 1 >= 0) {
	    Piece otherPiece = board.get(x+2, y-1);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x+2;
		move[1] = y-1;
		moves.add(move);
	    }
	}
	if (x + 2 <= 7 && y + 1 <= 7) {
	    Piece otherPiece = board.get(x+2, y+1);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x+2;
		move[1] = y+1;
		moves.add(move);
	    }
	}
	if (x + 1 <= 7 && y + 2 <= 7) {
	    Piece otherPiece = board.get(x+1, y+2);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x+1;
		move[1] = y+2;
		moves.add(move);
	    }
	}
	if (x - 1 >= 0 && y - 2 >= 0) {
	    Piece otherPiece = board.get(x-1, y-2);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x-1;
		move[1] = y-2;
		moves.add(move);
	    }
	}
	if (x - 2 >= 0 && y - 1 >= 0) {
	    Piece otherPiece = board.get(x-2, y-1);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x-2;
		move[1] = y-1;
		moves.add(move);
	    }
	}
	if (x - 2 >= 0 && y + 1 <= 7) {
	    Piece otherPiece = board.get(x-2, y+1);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x-2;
		move[1] = y+1;
		moves.add(move);
	    }
	}
	if (x - 1 >= 0 && y - 2 >= 0) {
	    Piece otherPiece = board.get(x-1, y-2);
	    if (otherPiece != null && otherPiece.getSide() != side) {
		move[0] = x-1;
		move[1] = y-2;
		moves.add(move);
	    }
	}

	int[][] ret = new int[moves.size()][2];
	for (int i = 0; i < ret.length; i++)
	    ret[i] = (int[]) moves.get(i);
	return ret;

    }
    
}
