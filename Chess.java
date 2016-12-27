import java.util.Scanner;

public class Chess {
    private static Board board;
    private static Renderer renderer;
    private static int turn;
    
    public static void main(String[] args) {
        board = new Board();
	board.start();
        renderer = new Renderer();
	Scanner in = new Scanner(System.in);
	
	System.out.println("Chess in the terminal");
        renderer.render(board.getBoard());

	turn = 0;
	
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
        int[][] moves = p.getMoves(board);
	printArr(moves);
	boolean valid = false;
	for (int[] coord : moves) 
	    if (coord[0] == nx && coord[1] == ny)
		valid = true;

	if (p.getSide() != turn) valid = false;
	
	if (valid) {
	    p.move(nx, ny);
	    board.move(px, py, nx, ny);

	    switch (turn) {
	    case 0:
		turn = 1;
		break;
	    case 1:
		turn = 0;
		break;
	    }
	} else {
	    System.out.println("Invalid move");
	}
    }    

    public static void printArr(int[][] arr) {
	System.out.println("Printing moves:");
	for (int[] row : arr) {
	    for (int elem : row)
		System.out.print(elem);
	    System.out.println();
	}
	System.out.println();
    }
}
