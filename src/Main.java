public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.printStatus();
        System.out.println();
        grid.markHit(0,1);
        grid.markMiss(0,2);
        grid.printStatus();
    }
}