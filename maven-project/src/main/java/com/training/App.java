package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Book bookOne=new Book("Maraintha manam",299);
        System.out.println("Book Name:"+bookOne.getBookName());
        System.out.println("Book Price: $"+bookOne.getBookPrice());
        
        Book bookTwo=new Book("Vekkai",899);
        System.out.println("Book Name:"+bookTwo.getBookName());
        System.out.println("Book Price: $"+bookTwo.getBookPrice());
        
//        bookOne.toString();
//        bookTwo.toString();
    }
}
