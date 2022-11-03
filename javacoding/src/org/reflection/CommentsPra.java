package org.reflection;

public class CommentsPra {
    public static void main(String[] args){
        display(10,20,30);
        display("10", 20, 30);

    }
    @SafeVarargs
    public static <T> void display(T...array){
        for(T arg: array) {
            System.out.println(arg.getClass().getName() + ':' + arg);
        }
    }
    
}
