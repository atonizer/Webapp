package edu.javalearn.app.model;

/**
 * Created by user
 * on 8/25/16.
 * Webapp
 */
public class Main {
    public static void main(String[] args) {
        Link l1 = new Link("JavaLearn", "javalearn.edu");
        Link l2 = l1;
        Link l3 = new Link(l1);
        System.out.println(l1.getClass());
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
        System.out.println(l1);
        System.out.println(Link.EMPTY);
        System.out.println(l1.empty());
        System.out.println(Link.empty());
    }
}
