package com.examples;

public class Excerpt {
    public static boolean checkArgs(String[] args) throws Exception {
        if (args.length != 2) {
            throw new BadArgsException();
        }
        return true;
    }
    public static void main(String[] args) {
       /* try {
           // Excerpt.checkArgs(args);
        } catch (BadArgsException b) {
            System.out.println("Bad arguments");
            System.exit(-1);
        } catch (MyException e) {
            System.out.println("Unknown exception");
            System.exit(-2);
        }
        System.out.println("Success");*/
    }
}

class BadArgsException extends MyException {}