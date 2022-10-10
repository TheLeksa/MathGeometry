package org.etsntesla.it;




public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Point prva = new Point(3, 4);
        Point druga = new Point(3, 6);

        System.out.println(prva.Distance(druga));
        System.out.println(prva.Radius());
    }
}