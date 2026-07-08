package Packages;

import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestFourWheeler {
    public static void main(String[] args) {

        Logan l = new Logan();
        System.out.println(l.getModelName());
        System.out.println(l.speed());
        l.gps();

        Ford f = new Ford();
        System.out.println(f.getModelName());
        System.out.println(f.speed());
        f.tempControl();
    }
}