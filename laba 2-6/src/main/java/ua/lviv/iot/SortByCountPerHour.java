package ua.lviv.iot;

import java.util.Comparator;

public class SortByCountPerHour implements Comparator<Maсhine> {

    @Override
    public int compare(Maсhine o1, Maсhine o2) {
        if (o1.getCountPerHour() == o2.getCountPerHour()) {
            return 0;
        }
        if (o1.getCountPerHour() > o2.getCountPerHour()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
