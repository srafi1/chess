public abstract class Piece {
    protected int x, y, side;
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getSide() {
	return side;
    }

    public void move(int nx, int ny) {
	x = nx;
	y = ny;
    }
    public abstract int[][] getMoves(Board board);
   
}
