package org.reflection;

@interface MyAnotation1 {
    String value() default "anotation info";
    int Count() default 0;
}
