package oop.polymorphism;

public class Attendance extends FallSemesterResult {
    public int eng101(int reading, int writing, int speaking, int essay ){
        int total= reading+writing+speaking+essay- 15;
        return total;
    }
    }
