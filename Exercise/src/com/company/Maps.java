package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

   public static void printMap(){

       Map<String,Integer> map=new HashMap<String, Integer>();

       map.put("Saman",58);
       map.put("Nayani",37);
       map.put("Sunil",44);
       map.put("Kamal",80);
       map.put("Seneha",66);
       map.put("Priya",78);

       for(Map.Entry m:map.entrySet())
           System.out.println(m.getKey()+" - "+m.getValue());


   }


   public static Map<String,Integer> getDetails(){

       Map<String,Integer> map=new HashMap<String, Integer>();

       map.put("Saman",58);
       map.put("Nayani",37);
       map.put("Sunil",44);
       map.put("Kamal",80);
       map.put("Seneha",66);
       map.put("Priya",78);

       return map;

       /*for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());
       }*/


   }

}
