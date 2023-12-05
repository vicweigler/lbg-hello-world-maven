package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Ruth"));
        System.out.println(sayHelloToSomeone("Hannah"));
        System.out.println(sayHelloToSomeone("Rebecca"));
        System.out.println(sayHelloToSomeone("Me"));
        System.out.println(sayHelloToSomeone("Hudson, my doggy"));
        System.out.println(sayHelloToSomeone("I don't really want to say Goodbye now but..."));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
