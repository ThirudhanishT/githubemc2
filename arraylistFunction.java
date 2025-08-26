import java.lang.System;
import java.util.*;
class arraylistFunction
{
    public static void main(String args[])
    {
        ArrayList<String>list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        System.out.println(list);
        list.add(2,"grapes");
        list.add(0,"pumkin");
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0,"greenApple");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        
   }
}
