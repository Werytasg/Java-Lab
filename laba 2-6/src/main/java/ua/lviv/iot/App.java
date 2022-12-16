package ua.lviv.iot;

import java.util.Arrays;
import java.util.List;

import static ua.lviv.iot.Material.*;

public class App
{
    public static void main( String[] args )
    {
        First obj1 = new First(9,2,3, Wool);
        Second obj2 = new Second(3, 4, 10, Textile);
        Third obj3 = new Third(6, 7, 8, Linen);
        Sort sort = new Sort();
        sort.add(obj1);
        sort.add(obj2);
        sort.add(obj3);
        sort.sort();
        sort.searchByMaterial(Wool);
        sort.searchByWidth(2);

        IMachineWriter IMachineWriter = new IMachineWriter();
        List<Maсhine> list = Arrays.asList(obj1, obj2, obj3);
        IMachineWriter.writeToFile(list);
    }
}
