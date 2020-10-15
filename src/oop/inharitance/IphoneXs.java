package oop.inharitance;

public class IphoneXs extends IphoneX {
    String dpSize;
    String charge;
    public void xs(){
        x();
        System.out.println("Display:" + dpSize);
        System.out.println("Wireless Charge: " + charge);
    }
}
