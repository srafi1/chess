import java.util.Scanner;

public class Chess {
    private static Board board;
    private static Renderer renderer;
    
    public static void main(String[] args) {
        board = new Board();
	board.start();
        renderer = new Renderer();
	Scanner in = new Scanner(System.in);
	
	System.out.println("Chess in the terminal");
        renderer.render(board.getBoard());

	while (true) {
	    System.out.println("Choose piece to move (x y):");
	    int px = in.nextInt();
	    int py = in.nextInt();
	    System.out.println("Specify new position (x y):");
	    int nx = in.nextInt();
	    int ny = in.nextInt();
	    move(px, py, nx, ny);
	    renderer.render(board.getBoard());
	}
    }

    public static void move(int px, int py, int nx, int ny) {
	Piece p = board.get(px, py);
        int[][] moves = p.getMoves();
	boolean valid = false;
	for (int[] coord : moves) 
	    if (coord[0] == nx && coord[1] == ny)
		valid = true;

	if (valid) {
	    p.move(nx, ny);
	    board.set(px, py, nx, ny);
	} else {
	    System.out.println("Invalid move");
	}
    }
    
}
