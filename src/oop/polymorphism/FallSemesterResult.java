package oop.polymorphism;

public class FallSemesterResult {
    public int eng101(int reading , int writing){
        int total= reading+writing;
        return total;
    }
    public int eng101(int reading , int writing,int speaking){
        int total= reading+reading+speaking;
        return total;
    }
    public int eng101(int reading, int writing, int speaking, int essay ){
        int total= reading+writing+speaking+essay;
        return total;
    }
}
