package com.testok.www.goorm_level_1;

import java.util.HashMap;
import java.util.stream.Stream;

public class Number {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    public static boolean solution(String s ) {
/*        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length ; i++) {
            if(map.get(chars[i])!=null){
                int value = map.get(chars[i]);
                map.put(chars[i],++value);
            }else {
                map.put(chars[i],1);
            }
        }

        if(map.get('p') != null && map.get('y') != null ) {
            return map.get('p') == map.get('y')?true:false;
        }*/

        return s.toLowerCase().chars().filter(e->'p'==e).count() == s. chars().filter(e->'y'==e).count();
    }
}
