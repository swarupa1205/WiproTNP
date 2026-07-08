package Demo;

import Packages.foundation;

public class TestAcess {
    public static void main(String[] args) {

        foundation f = new foundation();

        // System.out.println(f.var1); // Error - private
        // System.out.println(f.var2); // Error - default
        // System.out.println(f.var3); // Error - protected

        System.out.println(f.var4);    // Accessible
    }
}
