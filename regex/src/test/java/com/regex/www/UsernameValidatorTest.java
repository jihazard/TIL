package com.regex.www;

import com.tngtech.java.junit.dataprovider.DataProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsernameValidatorTest {
    private UsernameValidator usernameValidator;

  @Before
  public void setup(){
      usernameValidator = new UsernameValidator();
  }



    @Test
    public void ValidUsernameTest() {
        String[] Username = new String[] {
                "mkyong34", "mkyong_2002","mkyong-2002" ,"mk3-4_yong"
        };
        for(String temp : Username){
            boolean valid = usernameValidator.validate(temp);
            System.out.println("Username is valid : " + temp + " , " + valid);
            Assert.assertEquals(true, valid);
        }

    }

    @Test
    public void InvalidUsernameTest() {
      String[] username = new String[] {
              "mk","mk@yong","mkyong123456789_-"
      };

      for(String temp : username) {
          boolean valid = usernameValidator.validate(temp);
          System.out.println("Username is valid : " + temp + " , " + valid);
          Assert.assertEquals(false, valid);
      }
    }
}