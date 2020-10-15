package oop.abstraction;

import oop.abstraction.Camera;
import oop.abstraction.Cellphone;

public class Iphone11 extends Camera implements Cellphone {
    public void price() {
        System.out.println("$699");
    }
    public void display() {
        System.out.print("Display is 6.1',");
    }
    public void battery() {
        System.out.println("also has 3100mAh battery with fast charging capability.");
    }
    public void Camera() {
        System.out.println("and 12 megapixel camera system.");
    }
    public void cpu() {
        System.out.println("Iphone 11 has A13 bionic chipset.");
    }
    public void ram() {
       System.out.print("it comes with only 4Gb of ram ");
    }
    public void rom() {
        System.out.println("and 64gb,128gb or 256gb storage.");
    }


}
