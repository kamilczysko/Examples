package collections;

import java.util.*;


public class CollectionsEx {

    public static void main(String args[]){
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("a", 15);
        hmap.put("ab", 1500);
        hmap.put("av", 150);

        System.out.println(hmap);

        HashMap<String, Integer> tmap = new LinkedHashMap<>();
        hmap.put("a", 15);
        hmap.put("ab", 1500);
        hmap.put("av", 150);

        System.out.println(tmap);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(98);

        Collections.sort(list, Collections.reverseOrder());
        list.forEach(e -> { System.out.println(e);}
        );


        System.out.println(list);



    }
}
