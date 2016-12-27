public abstract class Piece {
    protected int x, y, side;
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public abstract void move(int nx, int ny);
    public abstract int[][] getMoves();
   
}
