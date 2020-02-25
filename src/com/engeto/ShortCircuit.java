package com.engeto;

public class ShortCircuit {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i++); //print 10, i=11
        System.out.println(i); //print 11
        System.out.println(++i); //print 12, i=12

        if (++i < 30 || i > 5)
        {
            System.out.println();
        }

        System.out.println(i);
    }
}
