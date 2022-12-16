package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.Material.*;

class SortTest {

    First obj1 = new First(9,2,3, Wool);
    Second obj2 = new Second(3, 4, 10, Textile);
    Third obj3 = new Third(6, 7, 8, Linen);
    Sort sort = new Sort();
    
    @Test
    void sortUpByPower() {
        sort.add(obj1);
        sort.add(obj2);
        sort.add(obj3);
        List<Maсhine> list = Arrays.asList(obj2, obj3, obj1);
        assertEquals(list, sort.sortUpByPower());
    }

    @Test
    void sortDownByPower() {
        sort.add(obj1);
        sort.add(obj2);
        sort.add(obj3);
        List<Maсhine> list = Arrays.asList(obj1, obj3, obj2);
        assertEquals(list, sort.sortDownByPower());
    }

    @Test
    void sortUpByCountPerHour() {
        sort.add(obj1);
        sort.add(obj2);
        sort.add(obj3);
        List<Maсhine> list = Arrays.asList(obj1, obj3, obj2);
        assertEquals(list, sort.sortUpByCountPerHour());
    }

    @Test
    void sortDownByCountPerHour() {
            sort.add(obj1);
            sort.add(obj2);
            sort.add(obj3);
            List<Maсhine> list = Arrays.asList(obj2, obj3, obj1);
            assertEquals(list, sort.sortDownByCountPerHour());
        }
}