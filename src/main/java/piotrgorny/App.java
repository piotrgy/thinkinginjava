package piotrgorny;

import piotrgorny.chapter5.Ex10;
import piotrgorny.chapter5.Tank;

public class App 
{
    public static void main( String[] args ){
        // chapter 5 ex. 10
        /*new Ex10("Drive");
        System.gc();*/

        // chapter 5 ex. 12
        new Tank();
        System.gc();

        new Tank().fill();
        System.gc();

        new Tank().empty();
        System.gc();
    }
}
