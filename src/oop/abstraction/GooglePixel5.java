package oop.abstraction;

import oop.abstraction.Camera;
import oop.abstraction.Cellphone;

public class GooglePixel5 extends Camera implements Cellphone {

    public void price() {
        System.out.println("$699");
    }
    public void display() {
        System.out.print("Pixel5 has 6.3' Oled display");
    }
    public void battery() {
        System.out.println("Comes with 4000mAh battery with wireless charging.");
    }
    public void cpu() {
        System.out.println("processor is Snapdragon 765G");
    }
    public void ram() {
        System.out.print("it has 8GB ram,");
    }
    public void rom() {
        System.out.println(" also comes with 128 storage.");
    }
    public void Camera() {
     System.out.println("pixel 5 can take good picture and it has google software support.");
    }
}

