package org.reflection;

@Marker
public class TestAnotation {
    @MyAnotation(value = "Annotation")
    private String info = "";

    @MyAnotation1(Count = 10)
    public static void main(String[] args){
        // System.out.println("test annotation");
    }
}
