package com.testok.www.goorm_level_1.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("this is a java book " , "lamda express" , "java8 support lambda");
        List<Person> list2 = Arrays.asList(new Person("윤지환", 20 , "개발자")
                                        ,new Person("김지환", 20 , "기술자")
                                        ,new Person("이지환", 20 ,"구타유발자"));

        list.stream().filter(s-> s.contains("java")).forEach(System.out::println);
        double v = list2.stream().mapToInt(Person::getAge).average().orElse(0.0);

        List<Person> list3 = list2.stream().filter(s -> s.getJob().equals("개발자")).collect(Collectors.toList());

        System.out.println( v);
        System.out.println("list3" + list3);

        System.out.println(solution("try hello world"));

    }

    public static String solution(String s) {
        String answer= s;

        List<String> strings = Arrays.asList(s.split(" "));

        for (int i = 0; i < strings.size() ; i++) {
            IntStream intStream = strings.get(i).codePoints();

            intStream.filter(n->{
                System.out.println(n+"..");
                return true;
            }).forEach(d-> System.out.println((char)d));

        }


       /* strings.stream().map(word->{
            int i=0;
            System.out.println(word.charAt(i));;
            Stream<Character> characterStream = word.codePoints().mapToObj(c -> (char) c);
            characterStream.
            i++;
            return word;
        }).forEach(d-> System.out.println(d));*/

        return answer;
    }


    }


class Person {
    public String name;
    public int age;
    public String job;



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}