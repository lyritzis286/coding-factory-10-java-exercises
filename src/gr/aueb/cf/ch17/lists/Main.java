package gr.aueb.cf.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        //Add
       cities.add("London");  //index 0
        cities.add("Paris");    //index 1
        cities.add("New York"); //index 2

        //Get
        String city = cities.get(0);
        System.out.println(city);

        //Update
        int position = cities.indexOf("Paris"); //Override equals.
        if (position == -1) {
            System.out.println("Not found");
        }else {
            cities.set(position, "Athens");
        }

        //Remove
        if (cities.contains("Athens")) {    //override equals
            cities.remove("Athens");    //override equals
        }else {
            System.out.println("Not found");
        }

        //Traverse

        //For
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String c : cities) {
            System.out.println(c);
        }

        //Iterator
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String aCity = iterator.next();
            System.out.println(aCity);
        }

        Iterator<String> iterator2 = cities.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals("New York")) {
                iterator2.remove();  //cities.remove("New York"); fails fast
            }
        }


        //Functional over Iterative
        cities.forEach(c -> System.out.println(c));
        cities.forEach(System.out::println);
    }
}
