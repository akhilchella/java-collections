package com.java.lambda;

public class Recording {
    public String name;
    private int age;
    public Recording(String NameRec){
        name = NameRec;
    }

    private void SetAge(int AgeRec){
        age = AgeRec;
    }
    public void printRec(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
    public static void main(String[] args) {
        Recording r = new Recording("Krisna");
        r.SetAge(23);
        r.printRec();
    }
}
