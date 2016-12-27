import java.util.ArrayList;

public class Pawn extends Piece {
    private int movenum;
    
    public Pawn(int nx, int ny, int nside) {
	x = nx;
	y = ny;
	side = nside;
	movenum = 0;
    }

    public void move(int nx, int ny) {
	x = nx;
	y = ny;
	movenum++;
    }

    public int[][] getMoves(Board board) {
	ArrayList moves = new ArrayList<Integer[]>();
	int progress;
	if (side == 1) progress = -1;
	else progress = 1;
	if (y != 7 && y!= 0) {
	    int[] move = new int[2];
	    if (board.get(x, y+progress) == null) {
		move[0] = x;
		move[1] = y + progress;
		moves.add(move);

		if (movenum == 0&&board.get(x, y+2*progress) == null) {
		    move = new int[2];
		    move[0] = x;
		    move[1] = y+2*progress;
		    moves.add(move);
		}
	    }

	    Piece otherPiece;
	    if (x < 7) {
	        otherPiece = board.get(x + 1, y + progress);
		if (otherPiece != null && otherPiece.getSide() != side) {
		    move = new int[2];
		    move[0] = x + 1;
		    move[1] = y + progress;
		}
	    }
	    if (x > 0) {
		otherPiece = board.get(x - 1, y + progress);
		if (otherPiece != null && otherPiece.getSide() != side) {
		    move = new int[2];
		    move[0] = x - 1;
		    move[1] = y + progress;
		}
	    }
	}
	
	int[][] ret = new int[moves.size()][2];
	for (int i = 0; i < ret.length; i++)
	    ret[i] = (int[]) moves.get(i);
	return ret;
    }
    
}
