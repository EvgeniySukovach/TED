package com.deveducation.febr2019.sukovach;
import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCore {

    private Core core;

    @Before
    public void run(){
        core = new Core();
    }
    @After
    public void stop(){
        core = null;
    }

    // Test Addition +++++++++++++++++++++++++++++++++++++++++++++++
    @Test
    public void testAddition_001(){
        double a = 0.012;
        double b = 0.00012;
        double expectedResult = 0.01212;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testAddition_002(){
        double a = 2;
        double b = 11;
        double expectedResult = 13;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testAddition_003(){
        double a = -5 ;
        double b = 5 ;
        double expectedResult = 0;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testAddition_004(){
        double a = -3;
        double b = -7;
        double expectedResult = -10;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testAddition_005(){
        double a = 5;
        double b = 0.789;
        double expectedResult = 5.789;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testAddition_006(){
        double a = 1234567890;
        double b = -5;
        double expectedResult = 1234567885;
        double testResult = core.addition(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
// Test Subtraction ----------------------------------------------------
    @Test
    public void testSubtraction_001(){
        double a = 0.01212;
        double b = 0.00012;
        double expectedResult = 0.012;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSubtraction_002(){
        double a = -0.012;
        double b = 0.00012;
        double expectedResult = -0.01212;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSubtraction_003(){
        double a = 5;
        double b = 0;
        double expectedResult = 5;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSubtraction_004(){
        double a = 9;
        double b = 9;
        double expectedResult = 0;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSubtraction_005(){
        double a = 15;
        double b = -14;
        double expectedResult = 29;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSubtraction_006(){
        double a = 1;
        double b = 0.00012;
        double expectedResult = 0.99988;

        double testResult = core.subtraction(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }


// Test Multiplication *****************************************
    @Test
    public void testMultiplication_001(){
        double a = 0.012;
        double b = 0.012;
        double expectedResult = 0.000144;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testMultiplication_002(){
        double a = -0.012;
        double b = 2;
        double expectedResult = -0.024;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testMultiplication_003(){
        double a = -3;
        double b = -3;
        double expectedResult = 9;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testMultiplication_004(){
        double a = 0;
        double b = 0.0123456789;
        double expectedResult = 0;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testMultiplication_005(){
        double a = 18;
        double b = 1.25;
        double expectedResult = 22.5;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testMultiplication_006(){
        double a = 10;
        double b = 100;
        double expectedResult = 1000;

        double testResult = core.multiplication(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }

// Test Division /////////////////////////////////////////

    @Test
    public void testDivision(){
        double a = 1.2;
        double b = 0;
        Object result = new ArithmeticException();
        Object fact = new Core().division(a , b);
        Assert.assertEquals( result , fact );
    }




    @Test
    public void testDivision_001(){
        double a = 16;
        double b = -0.1;
        double expectedResult = -160;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDivision_002(){
        double a = 16;
        double b = 2;
        double expectedResult = 8;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDivision_003(){
        double a = 0;
        double b = 2;
        double expectedResult = 0;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDivision_004(){
        double a = 1;
        double b = 2;
        double expectedResult = 0.5;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDivision_005(){
        double a = 0.1;
        double b = 3;
        double expectedResult = 0.03333333333333333;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDivision_006(){
        double a = 16;
        double b = 0.5;
        double expectedResult = 32;

        double testResult = core.division(a, b);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
// Test Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt Sqrt
    @Test
    public void testSqrt_001(){
        double a = 16;

        double expectedResult = 4;
        double testResult = core.sqrt(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSqrt_002(){
        double a = 100;
        //double a = 0;
        double expectedResult = 10;
        double testResult = core.sqrt(a);
        //Assert.assertEquals(new ArithmeticException(), testResult);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSqrt_003(){
        double a = 1;

        double expectedResult = 1;
        double testResult = core.sqrt(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSqrt_004(){
        double a = 0;

        double expectedResult = 0;
        double testResult = core.sqrt(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testSqrt_005(){
        double a = 0.1;

        double expectedResult = 0.31622776601683794;
        double testResult = core.sqrt(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
//Test Positive/Negative +/- /+/- /+/-/+/-/+/-/+/-/+/-/+/-/+/-/+/-/+/-
    @Test
    public void testReverse_001(){
        double a = 5;
        double expectedResult = -5;
        double testResult = core.reverse(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testReverse_002(){
        double a = -3;
        double expectedResult = 3;
        double testResult = core.reverse(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testReverse_003(){
        double a = 0;
        double expectedResult = 0;
        double testResult = core.reverse(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testReverse_004(){
        double a = 5.05;
        double expectedResult = -5.05;
        double testResult = core.reverse(a);
        Assert.assertEquals(expectedResult, testResult, 0);
    }
    @Test
    public void testDeleteLastDigit_001(){
        double a = 987654.0;
        String expectedResult = "987654.";
        String testResult = core.deleteLastDigit(a);

        Assert.assertEquals(expectedResult, testResult);

    }
}
