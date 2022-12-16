package ua.lviv.iot;

public abstract class Maсhine implements Comparable<Maсhine>{
    private int power;
    private int width;
    private int countPerHour;
    private Material material;

    public void setPower(int power) {
        this.power = power;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setCountPerHour(int countPerHour) {
        this.countPerHour = countPerHour;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getPower() {
        return power;
    }

    public int getWidth() {
        return width;
    }

    public int getCountPerHour() {
        return countPerHour;
    }

    public Material getMaterial() {
        return material;
    }

    public Maсhine(int power, int width, int countPerHour, Material material) {
        this.power = power;
        this.width = width;
        this.countPerHour = countPerHour;
        this.material = material;
    }
    @Override
    public String toString() {
        return "Maсhine{" +
                "power=" + power +
                ", width=" + width +
                ", countPerHour=" + countPerHour +
                ", material=" + material +
                '}';
    }

    @Override
    public int compareTo(final Maсhine a) {
        return this.power - a.power;
    }
    public static String getHeader() {
        return String.format("%s, %s, %s, %s\n", "power", "width", "countPerHour", "material");
    }

    public String toCSV() {
        return String.format("%s, %s, %s, %s\n", getPower(), getWidth(), getCountPerHour(), getMaterial());
    }

}
