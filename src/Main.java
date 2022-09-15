import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Use variables of different types (int, double, char, boolean, String).
        int Age = 17;//int
        double sleephours = 7.5;//double
        char Favletter = 'W';//char
        int a = 100;//boolean
        int b = 1000;//boolean
        String l = "aaaaa";//string

        System.out.println("I am " + Age + " years old");
        System.out.println("I sleep " + sleephours + " hours a day");
        System.out.println("My favourite letter is " + Favletter);
        System.out.println(b>a);
        System.out.println(l);

        //Demonstrate operations with Numbers
        a = 10;
        b = 7;
        int z = a + b;
        System.out.println(z);
        z = a*b;
        System.out.println(z);
        z = a/b;
        System.out.println(z);
        System.out.println(10.0 / 7.0);

        //Demonstrate String operations
        String txt = "HeLLo wOrLd";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //Demonstrate Input/Output operations
        String name;
        double years;
        double hours;
        Scanner main = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        name = main.nextLine();
        System.out.println("Cool, how old are you? ");
        years = main.nextDouble();
        System.out.println("Wow, how much hours a day do you sleep? ");
        hours = main.nextDouble();
        System.out.println("Well, your name is " + name + " you are " + years + " years old and you sleep " + hours + " hours per day");






    }
}
