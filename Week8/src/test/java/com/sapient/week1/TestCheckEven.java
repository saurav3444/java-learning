package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCheckEven {
    private CheckEven app;
    
    @Before
    public void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public void test1() {
        Boolean ans = app.check(2);
        assertTrue(ans == true);
    }

      @Test
    public void test2() {
        Boolean ans = app.check(3);
        assertTrue(ans == false);
    }
 
   @Test
    public void test3() {
        Boolean ans = app.check(-1);
        assertTrue(ans == false);
    }


}