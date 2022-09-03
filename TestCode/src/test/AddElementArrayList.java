package test;

import java.util.ArrayList;

public class AddElementArrayList {
	
	public static void main(String args[]) {


        //Declaration of String ArrayList 
        ArrayList<String> arrlist = new ArrayList<String>(); 
 
        //Example of add method for String ArrayList
        arrlist.add("California");
        arrlist.add("New York");
        arrlist.add("Boston");
        arrlist.add("San jose");
        arrlist.add("San Francisco");
        System.out.println("ArrayList Elements of String Type: "+ arrlist);

        //Example of add method for Integer ArrayList
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(); 
 
        //Example of add method for Integer ArrayList
        arrlist2.add(12);
        arrlist2.add(3);
        arrlist2.add(9);
        arrlist2.add(96);
        arrlist2.add(8);
        System.out.println("ArrayList Elements of Integer Type: "+arrlist2);
    }

}
