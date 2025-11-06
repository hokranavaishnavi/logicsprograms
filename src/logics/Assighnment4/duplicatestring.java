package logics.Assighnment4;

import java.util.HashMap;
import java.util.Map;

public class duplicatestring {
    public static void main(String[] args) {
        String str="Hurry hurry we're late";
        str=str.toLowerCase();
        String[] ch=str.split(" ");

        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }

        map.forEach((key,value)->{
            if(value>1){
                System.out.print(key+" ");
            }
        });

    }
}
