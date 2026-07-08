package com.wipro.automobile;

import com.wipro.automobile.ship.Compartment;

public class TestCompartment {
    public static void main(String[] args) {

        Compartment c = new Compartment(10.5, 8.2, 5.4);
        c.display();
    }
}