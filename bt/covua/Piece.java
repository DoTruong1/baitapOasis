package covua;
public  abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    abstract public String getSymbol();

    abstract public boolean canMoveTo(int x, int y);
}