package ua.lviv.iot;



public class Third extends Maсhine {
    public Third(int power, int width, int countPerHour, Material material) {
        super(power, width, countPerHour, material);
    }

    @Override
    public String toString() {
        return "Third{" +
                "power=" + getPower() +
                ", width=" + getWidth() +
                ", countPerHour=" + getCountPerHour() +
                ", material=" + getMaterial() +
                '}';
    }
}
