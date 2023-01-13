package com.driver;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    B Obj1 = new B(); // showing error if make method static
    System.out.peintln(Obj1.meth());
    return;

  }
  public  static class A{
    public static String meth(){
      return "Invoking method from class A";
    }

  }

  public static class B extends A{
    public static String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}

