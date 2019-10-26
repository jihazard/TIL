package com.regex.www;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator;


    @Before
    public void setup() {
        passwordValidator = new PasswordValidator();
    }


    @Test
    public void ValidPasswordTest() {
        String[] pass = new String[] {
                "mkyong1A@", "mkYOn12$",
        };

        for(String x : pass) {
            boolean valid = passwordValidator.validate(x);
            System.out.println("password is valid = > " + x +" , " + valid);
            Assert.assertEquals(true,valid);
        }
    }


    @Test
    public void InvalidPasswordTest() {
        String[] pass = new String[] {
                "mY1A@","mkyong12@","mkyoNg12*",
                "mkyonG$$","MKYONG12$"
        };
        for(String x : pass) {
            boolean valid = passwordValidator.validate(x);
            System.out.println("password is valid = > " + x +" , " + valid);
            Assert.assertEquals(false,valid);
        }

    }

}