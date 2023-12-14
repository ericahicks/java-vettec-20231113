package com.skillstorm;

import java.util.Arrays;

public class Hello {

   public static void main(String[] args) {
       // Print out the args array
       System.out.println(Arrays.toString(args));

       if (args.length <= 0) {
           System.out.println("Hello world!");
       } else {
           String name = args[0];
           System.out.println("Hello " + name);
       }
   }
}