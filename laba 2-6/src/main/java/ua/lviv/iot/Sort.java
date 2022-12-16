package ua.lviv.iot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    List<Maсhine> list = new ArrayList<Maсhine>();

    public void add(Maсhine a){
        list.add(a);
    }

    public final void output(final List<Maсhine> a) {
        for (int i = 0; i < a.size(); i++) {
            int b = i + 1;
            System.out.println(b + "." + a.get(i));
        }
        System.out.println();
    }

    public List<Maсhine> sortUpByPower() {
        Collections.sort(list);
        System.out.println("Top Power:" + "\n");
        output(list);
        return list;
    }
    public List<Maсhine> sortDownByPower() {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Less Power:" + "\n");
        output(list);
        return list;
    }
    public final List<Maсhine> sortUpByCountPerHour() {
        Collections.sort(list, new SortByCountPerHour());
        System.out.println("Top CountPerHour:" + "\n");
        output(list);
        return list;
    }
    public final List<Maсhine> sortDownByCountPerHour() {
        Collections.sort(list, Collections.reverseOrder(new SortByCountPerHour()));
        System.out.println("Less CountPerHour:" + "\n");
        output(list);
        return list;
    }

    public void searchByMaterial(Material material){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getMaterial() == material){
                System.out.println(list.get(i) + "\n");
            }
            else{
                System.out.println("Maсhine with material " + material + "isn't exist");
            }
        }
    }

    public void searchByWidth( int width) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWidth() == width) {
                System.out.println(list.get(i) + "\n");
            }
            else{
                System.out.println("Maсhine with width " + width + "isn't exist");
            }
        }
    }

    public void sort (){
        sortUpByCountPerHour();
        sortDownByCountPerHour();
        sortUpByPower();
        sortDownByPower();
    }


    }
