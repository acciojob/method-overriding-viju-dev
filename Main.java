package com.driver;
import java.util.*;
public class Main {
  public void main(String[] args) {
    B Obj1 = new B(); // showing error if make method static
    Obj1.meth();
    return;

  }
  class A{
    public String meth(){
      return "Invoking method from class A";
    }

  }

  class B extends A{
    public String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}

