package org.example;

public class StringExample {
    public static void main(String [] args){
        String str = "Whatever you want to type in this string is okay";
        System.out.println("The lenght of the string = " + str.length());

        String str2 = str.toUpperCase();
        System.out.println(str);
        System.out.println(str2);

        //                 0123456789
        String filename = "Hello.java";

        System.out.println("The file name is" + filename + "and the lenght is " + filename.length());
        System.out.println("The period is at index " + filename.indexOf('H'));
        System.out.println("The file extension is " + filename.substring(filename.indexOf('.') +1));
        System.out.println("The name of the file is " + filename.substring(0, filename.lastIndexOf('.'))); // example uses indexOf
    }
}
