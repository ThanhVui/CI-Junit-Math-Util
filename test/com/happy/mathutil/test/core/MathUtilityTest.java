/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.happy.mathutil.test.core;

//import org.junit.jupiter.api.Test;
import com.happy.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author ThanhVui
 */
public class MathUtilityTest {

    public MathUtilityTest() {
    }

    @Test // @Test is a JUnit colaboration with JVM to run this function, actual it is a main public static void main()
    public void testGetFractorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        // long actual = 1;
        long actual = MathUtil.getFractorial(n);

        // Compare actual and expected with framework
        Assert.assertEquals(expected, actual); // It will compare two value if right then ruturn blue collum, else return red collum

        // Groups
        Assert.assertEquals(1, MathUtil.getFractorial(1)); // It will compare two value if right then ruturn blue collum, else return red collum
        Assert.assertEquals(2, MathUtil.getFractorial(2)); // It will compare two value if right then ruturn blue collum, else return red collum
        Assert.assertEquals(6, MathUtil.getFractorial(3)); // It will compare two value if right then ruturn blue collum, else return red collum
        Assert.assertEquals(24, MathUtil.getFractorial(4)); // It will compare two value if right then ruturn blue collum, else return red collum
        Assert.assertEquals(120, MathUtil.getFractorial(5)); // It will compare two value if right then ruturn blue collum, else return red collum
        Assert.assertEquals(720, MathUtil.getFractorial(6)); // It will compare two value if right then ruturn blue collum, else return red collum
    }

    //    // Test numer format exception 
    //    @Test(expected = NumberFormatException.class) // @Test is a JUnit colaboration with JVM to run this function, actual it is a main public static void main()
    //    public void testGetFractorialGivenWrongArgumentThrowException() {
    //        MathUtil.getFractorial(-5);
    //    }
    // Way 1 to catch exception
    // Test Illegal exception 
    @Test(expected = IllegalArgumentException.class) // @Test is a JUnit colaboration with JVM to run this function, actual it is a main public static void main()
    public void testGetFractorialGivenWrongArgumentThrowException() {
        MathUtil.getFractorial(-5);
    }

    // Way 1 to catch exception
    // Test Illegal exception 
    @Test // (expected = IllegalArgumentException.class) // @Test is a JUnit colaboration with JVM to run this function, actual it is a main public static void main()
    public void testGetFractorialGivenWrongArgumentThrowException_LambdaVersion() {
        // Assert.assertThrows(expectedThrowable, runnable);
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFractorial(-5));
    }

    // Way 1 to catch exception
    // Test Illegal exception 
    @Test // (expected = IllegalArgumentException.class) // @Test is a JUnit colaboration with JVM to run this function, actual it is a main public static void main()
    public void testGetFractorialGivenWrongArgumentThrowException_TryCatch() {
        try {
            MathUtil.getFractorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("N must be from 0 to 20!", e.getMessage());
        }
    }
}
