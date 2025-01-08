/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happy.mathutil.core;

/**
 *
 * @author ThanhVui
 */
public class MathUtil {
//    In this class for a lot of functions to calculator
//    Clone class Math of JDK
//    Function use for someone but not store status of value then design it is static function
    
    public static long getFractorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("In valid argument n must be between 0 to 20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
