package ua.lviv.iot;

public class First extends Maсhine{
    public First(int power, int width, int countPerHour, Material material) {
        super(power, width, countPerHour, material);
    }

    @Override
    public String toString() {
        return "First{" +
                "power=" + getPower() +
                ", width=" + getWidth() +
                ", countPerHour=" + getCountPerHour() +
                ", material=" + getMaterial() +
                '}';
    }
}
