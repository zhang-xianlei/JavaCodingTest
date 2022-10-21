package org.reflection;

public class GetClassPra {
    public static void main(String[] args){
        Class clz1 = String.class;
        String str = "hello";
        Class clz2 = str.getClass();
        Class clz3 = int.class;
        Class clz4 = Integer.class;

        System.out.println("clz2 class name " + clz2.getName());
        System.out.println("clz2 is interface " + clz2.isInterface());
        System.out.println("clz2 is Array " + clz2.isArray());
        System.out.println("clz2 parent class name " + clz2.getSuperclass().getName());
        System.out.println("clz2 is base type " + clz2.isPrimitive());
        System.out.println("clz3 is base type " + clz3.isPrimitive());
        System.out.println("clz4 is base type " + clz4.isPrimitive());
    }
}
