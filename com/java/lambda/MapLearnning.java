package com.java.lambda;

import java.util.HashMap;
import java.util.Map;

public class MapLearnning {
    public static void main(String[] args) {
        Map<String, String> map1= new HashMap<>();
        map1.put("akhil","wdas");
        map1.put("chella","jsdbjh");
        map1.put("adoni", "dgbja");
        map1.put("done","close");
        for(Map.Entry<String, String> m: map1.entrySet()){
            System.out.println(m.getValue());

        }

    }

}
