package ua.lviv.iot;

public class Second extends Maсhine{
    public Second(int power, int width, int countPerHour, Material material) {
        super(power, width, countPerHour, material);
    }

    @Override
    public String toString() {
        return "Second{" +
                "power=" + getPower() +
                ", width=" + getWidth() +
                ", countPerHour=" + getCountPerHour() +
                ", material=" + getMaterial() +
                '}';
    }
}
