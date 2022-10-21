package org.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectMethods {
    public static void main(String[] args){
        try{
            Class c = Class.forName("java.lang.String");
            Method methods[] = c.getDeclaredMethods();
            for(Method method: methods) {
                System.out.print(Modifier.toString(method.getModifiers()));
                System.out.print(" " + method.getReturnType().getName() + " ");
                System.out.println(method.getName() + "();");
            }
        }catch(ClassNotFoundException e) {
            System.out.println("can not find the class");
        }

    }
    
}
