package javacoding.versionThree;

import java.util.ArrayList;
import java.util.List;

public class GenericClass <T>{
    private List <T> items;
    public void GenericClass(T item){
        this.items = new ArrayList <T> ();
    }
    public void queue(T item){
        this.items.add(item);
    }
    public T dequeue(){
        if(items.isEmpty()){
            return null;
        } else {
            return this.items.remove(0);
        }
    }

    @Override
    public String toString(){
        return items.toString();
    }

}
class showDemo{
    public static void main(String[] args){
        GenericClass <String> genericClass = new GenericClass<String>();
        genericClass.queue('A');
        genericClass.queue('B');

        System.out.println(genericClass);
    }
}
