package oop.abstraction;

public class TestCellphone {
    public static void main(String[] args) {
        System.out.println("Iphone 11");
        Camera cam =new Iphone11();
        Cellphone cell1 = new Iphone11();
        cell1.price();
        cell1.display();
        cam.Camera();
        cell1.battery();
        cell1.cpu();
        cell1.ram();
        cell1.rom();
        System.out.println("Google Pixel 5");
        Camera cam2 =new GooglePixel5();
        Cellphone cell2 = new GooglePixel5();
        cell2.price();
        cell2.display();
        cell2.battery();
        cell2.cpu();
        cell2.ram();
        cell2.rom();
        cam2.Camera();
    }
}

