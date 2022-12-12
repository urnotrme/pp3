public class Car extends Vehicle {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        return new int[] {super.getSeats(), maxSpeed};
    }


    public static void main(String[] args) {
        Car c1 = new Car(4, 250);
        System.out.println(c1.spec());
    }
}
