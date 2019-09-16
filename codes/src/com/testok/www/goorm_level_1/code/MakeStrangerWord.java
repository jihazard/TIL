package com.testok.www.goorm_level_1.code;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeStrangerWord {
    public static void main(String[] args) {
        System.out.println(solution2Stream("try  hello world"));
    }


    public static String solution(String s) {
        String answer= "";
        String[] split = s.split("");
        int count = 0;

        for (String word : split){
            count = word.contains(" ") ? 0 : count + 1;
            answer += count % 2==0 ? word.toLowerCase(): word.toUpperCase();
        }

        return answer;
    }

    public static String solution2Stream(String s) {
        String answer= "";
        int i = 0;
/*        String[] words = s.split(" ");
        for (int j = 0; j < words.length ; j++) {
            char[] chars = words[j].toCharArray();
            answer +=  IntStream.range(0, chars.length)
                    .mapToObj(index -> String.format("%s", index % 2 != 0 ? String.valueOf(chars[index]).toLowerCase() : String.valueOf(chars[index]).toUpperCase()))
                    .collect(Collectors.joining());


        }*/
        char[] chars = s.toCharArray();
        int count = 0;
        String[] s2 = s.split(" ");
        IntStream.range(0, s2.length)
                .mapToObj(index -> {
                    char[] chars1 = s2[index].toCharArray();
                    return s2[index];
                })
                .collect(Collectors.joining());

        //System.out.println(s1);
        return null;
    }


    public static String isConvertWord(int index, char[] chars, int count){

        String word = String.valueOf(chars[index]);
        if(word.equals(" ")) count =0;
        String s = count % 2 == 0 ? word.toLowerCase() : word.toUpperCase();
        System.out.println(s + "/" + index +"/" + count);

        return s;
    }

}
