package com.driver;

public class Main {
  public static void main(String[] args) {
    B Obj1 = new B(); // showing error if make method static
    System.out.peintln(Obj1.meth());
    return;

  }
  public static class A{
    public String meth(){
      return "Invoking method from class A";
    }

  }

  public static class B extends A{
    @Override
    public String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}

