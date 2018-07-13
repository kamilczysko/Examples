package OptionalTest;

import Color.Color;

import java.util.Optional;

public class OptTest {

    public static void main(String args[]){
        String a = "test";
        String a1 = Optional.ofNullable(a).orElse("dupa");
//        a1.ifPresent(value -> {
//            System.out.println(value.toString());
//        });
        System.out.println(a1);
        Optional<String> a2 = Optional.of(a);
        boolean kamil1 = a2.filter(b -> b.equals("kamil")).isPresent();

        Color c1 = null;
        Color c2 = new Color(1,2,3);
        Color c3 = new Color(6,2,3);

        System.out.println(isRed(c1));
        System.out.println(isRed(c2));
        System.out.println(isRed(c3));
    }


    static boolean isRed(Color col){
//        boolean present = Optional.ofNullable(col).map(
//                Color::getR
//        ).filter(red -> red > 5).isPresent();

                boolean present = Optional.ofNullable(col).map(
                v -> (v.getR())
        ).filter(red -> red > 5).isPresent();
        return present;
    }



}
