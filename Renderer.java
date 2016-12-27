public class Renderer {

    public void render(Piece[][] board) {
	for (Piece[] row : board) {
	    for (Piece p : row) {
		if (p == null)
		    System.out.print(" ");
		else if (p instanceof Pawn)
		    System.out.print("p");
		else if (p instanceof Rook)
		    System.out.print("R");
		else if (p instanceof Knight)
		    System.out.print("k");
		else if (p instanceof Bishop)
		    System.out.print("B");
		else if (p instanceof Queen)
		    System.out.print("Q");
		else if (p instanceof King)
		    System.out.print("K");
	    }
	    System.out.println();
	}
    }
    
}
