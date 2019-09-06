package com.testok.www.goorm_level_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Stream_reg {
    public static void main(String[] args) {

        List<User> persons = Arrays.asList(
                new User("aeiou", "jack234@gmail.com"),
                new User("Peter", "pete2@post.com"),
                new User("Lucy", "lucy17@gmail.com"),
                new User("Robert", "bob56@post.com"),
                new User("Martin", "mato4@imail.com")
        );

     /*   String pattern = "[aeiou]?";
        boolean i = Pattern.matches("[a-zA-Z]*", "Aeter");
        boolean e = Pattern.matches("[au]*", "aeter");
        System.out.println(i + "// " + e);

        // persons.stream().filter(p -> p.getEmail().matches(".*gmail\\.com")).forEach(s-> System.out.println(s));
        // persons.stream().filter(p -> p.getName().matches( "\\^([aeiou])\\w+")).forEach(s-> System.out.println(s));
         persons.stream().filter(p ->
            // p.getName().contains("ae|et|in")
            p.getName().matches("[aeiouAEIOU]+")
         ).forEach(s-> System.out.println(s));*/

        Predicate<String> filter = Pattern
                .compile(" m/[aeiou]+/")
                .asPredicate();

        persons.stream().filter(s-> s.getName().matches(" m/[aeiou]+/")).forEach(s-> System.out.println(s) );

    }

}
