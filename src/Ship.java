public class Ship {
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    private int row;
    private int col;
    private int length;
    private int direction;

    public Ship(int length) {
        this.length = length;
        direction = UNSET;
        col = UNSET;
        row = UNSET;
    }

    public boolean isLocationSet() {
        return col != UNSET && row != UNSET;
    }

    public boolean isDirectionSet() {
        return direction != UNSET;
    }

    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getLength() {
        return length;
    }

    public int getDirection() {
        return direction;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    private String directionToString() {
        if (direction == HORIZONTAL) {
            return "horizontal";
        }
        else if (direction == VERTICAL) {
            return "vertical";
        }
        return "unset direction";
    }

    private String locationToString() {
        if(isLocationSet()){
            return "(" + row + ", " + col + ")";
        }
        return "(unset location)";
    }

    @Override
    public String toString() {
        return String.format("%s ship of length %d at %s", directionToString(), length, locationToString());
    }
}
