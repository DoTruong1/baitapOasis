package covua;

import java.util.ArrayList;

public class Board {
    public final int WIDTH = 8;
    public final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    Board(){}

    public boolean validate(int x, int y) {
        if(x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    public Piece getAt(int x, int y) {
        for(Piece piece : pieces) {
            if(piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    public void removeAt(int x, int y) {
        pieces.removeIf(e -> getAt(x, y) != null);
    }

    public void addPiece(Piece piece) {
        if(validate(piece.getCoordinatesX(), piece.getCoordinatesY())
            && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }
}
