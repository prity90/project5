package oop.polymorphism;

public class TestPolimorphism {
    public static void main(String[] args) {
        FallSemesterResult e101 = new FallSemesterResult();
        int result = e101.eng101(65,70);
    System.out.println("Fall 2020. Sub.E101 Result for Sam:"+ " " +result);
        int result2 = e101.eng101(90,86,92);
    System.out.println("Fall 2020. Sub.E101 Result for Samuel:"+" "+result2);
        int result3 = e101.eng101(67,87,92,87);
    System.out.println("Fall 2020. Sub.E101 Result for Nicole:"+" "+result3);
    }

}
