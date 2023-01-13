package com.driver;

public class Main {
    public static void main(String[] args) {
        B Obj1 = new B();
        Obj1.meth();
        Obj1.meth();

    }
}

class A{
    String meth(){
        return "";
    }

}

class B extends A{
    @Override
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}