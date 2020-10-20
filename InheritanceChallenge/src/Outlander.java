public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", 8, "land", 2000, 5, 5, 135, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changingGears(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changingGears(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changingGears(3);
        } else {
            changingGears(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
