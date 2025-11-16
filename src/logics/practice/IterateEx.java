package logics.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateEx {



    public static void main(String[] args) {
        //int[] arr={1,3,5,7};

        ArrayList<Integer> l=new ArrayList<>();

        l.add(10);
        l.add(38);
        l.add(45);
        l.add(97);

        System.out.println(l);
        Iterator<Integer> i2=l.iterator();

        for(Integer n:l){
            if(i2.hasNext()){
                i2.remove();
            }
        }
//        for(int i=0; i<l.size();i++){
//            if(l.get(i).equals(38)){
//                l.add(4);
//            }
//        }


//        while(i2.hasNext()){
//
//            if(i1==38){
//                i2.remove();
//            }
//        }
////        while (i.hasNext()) {
////            Integer i1 = i.next();          // call next() to get current element
////            if (i1.equals(38)) {            // use equals() when comparing Integer values
////                i.remove();                 // safe removal through iterator
////            }
////        }
        System.out.println(l);
    }
}
