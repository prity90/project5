package oop.inharitance;

public class TestInheritance {
    public static void main(String[] args) {
       IphoneX x= new IphoneX();
       x.model= "Iphone 10";
       x.year= 2017;
       x.cpu= "A 11 Bionic";
       x.ram="4GB";
       x.x();
        System.out.println(">>>>><<<<<<");
        IphoneXs xs= new IphoneXs();
        xs.model= "Iphone XS";
        xs.year= 2018;
        xs.cpu= "A 12 Bionic";
        xs.ram="6GB";
        xs.dpSize="6.3 inch";
        xs.charge="Enable";
        xs.xs();
        System.out.println("<<<<<<<>>>>>>");
        Iphone11 i11= new Iphone11();
        i11.model= "Iphone 11";
        i11.year= 2019;
        i11.cpu= "A 13 Bionic";
        i11.ram="8GB";
        i11.camera="It has good Camera Module.";
        i11.battery="4200mAh";
        i11.i11();
    }
}
