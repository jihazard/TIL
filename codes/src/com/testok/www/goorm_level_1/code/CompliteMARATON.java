package com.testok.www.goorm_level_1.code;

import java.util.*;
import java.util.stream.Collectors;


public class CompliteMARATON {
    public static void main(String[] args) {

        String[] A = {  "kiki", "eden" };
        String[] B = {"leo", "kiki", "eden", "eden"};



        Set<String> a = new TreeSet<String>(Arrays.asList(A));
        Set<String> b = new TreeSet<String>(Arrays.asList(B));

        List<String> lista = Arrays.asList(A);
        List<String> listb = Arrays.asList(B);
        Map<String,Integer> map = new HashMap<>();
        for(String value : listb ){
            if(map.containsKey(value)){
                Integer values = map.get(value);
                map.put(value,++values);
            }else {
                map.put(value,1);
            }
        }

        for (String postion : lista){
            map.computeIfPresent(postion,(String key,Integer value )-> --value);
        }

        //union
        Set<String> c= new TreeSet<String>(b);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<String> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<String> e = new TreeSet<>(b);
        e.removeAll(a);
        System.out.println(e);



    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> participantList = Arrays.asList(participant);
        List<String> completionList = Arrays.asList(completion);

        List<String> union = new ArrayList<>(completionList);
        participantList.stream().filter(e->!union.contains(e)).forEach(union::add);



        return answer;
    }
}
