public class Location {
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;

    private boolean hasShip;
    private int status;

    public Location() {
        hasShip = false;
        status = 0;
    }

    public boolean checkHit() {
        return status == HIT;
    }

    public boolean checkMiss() {
        return status == MISSED;
    }

    public boolean isUnguessed() {
        return status == UNGUESSED;
    }

    public void markHit() {
        this.status = 1;
    }

    public void markMiss() {
        this.status = 2;
    }

    public boolean hasShip() {
        return this.hasShip;
    }

    public void setShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}
