public class King extends Piece {
    
    public King(int nx, int ny, int nside) {
	x = nx;
	y = ny;
	side = nside;
    }

    public void move(int nx, int ny) {

    }

    public int[][] getMoves() {
	int[][] temp = new int[0][0];
	return temp;
    }
    
}
