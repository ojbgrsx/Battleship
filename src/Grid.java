public class Grid {

    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;

    public static final String[] ROW_NAMES = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    private Location[][] grid = new Location[NUM_ROWS][NUM_COLS];

    public Grid() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                grid[i][j] = new Location();
            }
        }
    }

    public void markHit(int row, int col) {
        grid[row][col].markHit();
    }

    public void markMiss(int row, int col) {
        grid[row][col].markMiss();
    }

    public void setStatus(int row, int col, int status) {
        grid[row][col].setStatus(status);
    }

    public int getStatus(int row, int col) {
        return grid[row][col].getStatus();
    }

    public boolean alreadyGuessed(int row, int col) {
        return !grid[row][col].isUnguessed();
    }

    public void setShip(int row, int col, boolean val) {
        grid[row][col].setShip(val);
    }

    public boolean hasShip(int row, int col) {
        return grid[row][col].hasShip();
    }

    public Location get(int row, int col) {
        return grid[row][col];
    }

    public int numRows() {
        return NUM_ROWS;
    }

    public int numCols() {
        return NUM_COLS;
    }

    public void printStatus() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.print(ROW_NAMES[i] + " ");
            for (int k = 0; k < NUM_COLS; k++) {
                if (!alreadyGuessed(i, k)) {
                    System.out.print("- ");
                } else if (getStatus(i, k) == Location.HIT) {
                    System.out.print("O ");
                } else if (getStatus(i, k) == Location.MISSED) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void printShips() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.print(ROW_NAMES[i] + " ");
            for (int k = 0; k < NUM_COLS; k++) {
                if (!hasShip(i,k)) {
                    System.out.print("- ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
