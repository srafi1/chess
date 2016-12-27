import java.util.ArrayList;

public class Pawn extends Piece {
    
    public Pawn(int nx, int ny, int nside) {
	x = nx;
	y = ny;
	side = nside;
    }

    public void move(int nx, int ny) {
	x = nx;
	y = ny;
    }

    public int[][] getMoves() {
	int[][] temp = new int[0][0];
	return temp;
    }
    
}
