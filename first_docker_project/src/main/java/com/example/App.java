package com.example;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        List<String> names=Arrays.asList("Surya","Abishek","Sathya","Poovarasan");
        names.forEach(System.out::println);
    }
}
