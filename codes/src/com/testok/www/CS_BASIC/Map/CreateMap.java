package com.testok.www.CS_BASIC.Map;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("key1","value1");
        System.out.println(map.get("key1"));  //== > value1

        map.put("key1","newValue ");
        System.out.println(map.get("key1"));  //== > newValue

    }
}
