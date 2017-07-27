package num2;

import java.util.LinkedList;
import java.util.List;

public class Linkeds<T> {
    List<T> l;
  
    Linkeds(){
       l=new LinkedList<T>();
    }
    public void put(T o){
       l.add(o);
    }
    public T get(){
        T o= l.get(0);
       l.remove(0);
       return o;
    }
   
    public boolean isEmpty(){
       if(l.isEmpty()){
           return true;
       }
       return false;
    }
}