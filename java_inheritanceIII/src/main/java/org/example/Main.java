package org.example;
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book {
    void setTitle(String s) {
        this.title = s;
    }
}

public class Main{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}


//This code defines an abstract class Book and then creates a subclass MyBook that extends Book. Here's the explanation:
//
//Abstract Class Book:
//The Book class is declared as abstract using the abstract keyword. This means it cannot be instantiated directly.
//It contains three elements:
//A String variable named title.
//An abstract method setTitle(String s) without a method body. Subclasses must provide an implementation for this method.
//A method getTitle() that returns the value of the title variable.
//Subclass MyBook:
//MyBook is declared as a subclass of Book using the extends keyword.
//It implements the abstract method setTitle(String s) by providing a method body that assigns the value of the parameter s to the title variable.
//Main Class:
//The Main class contains the main method, which is the entry point of the program.
//It creates an instance of Scanner to read input from the console.
//It prompts the user to enter a title and reads the input using sc.nextLine().
//It creates an instance of MyBook using the default constructor.
//It calls the setTitle method of MyBook to set the title entered by the user.
//Finally, it prints the title using System.out.println.
//This program demonstrates the use of abstract classes and inheritance in Java, where Book serves as a base class providing a common structure, and MyBook extends it to provide a concrete implementation.