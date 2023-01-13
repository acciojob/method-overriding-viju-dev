package com.driver;

public class Main {
  public void main(String[] args) {
    B Obj1 = new B(); // showing error if make method static
    System.out.println(Obj1.meth());
    return;

  }
  public class A{
    public String meth(){
      return "Invoking method from class A";
    }

  }

  public class B extends A{
    @Override
    public String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}
