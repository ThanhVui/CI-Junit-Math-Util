/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.happy.mathutil.main;

import com.happy.mathutil.core.MathUtil;

/**
 *
 * @author ThanhVui
 */
public class Main {
    public static void main(String[] args) {
//        Use function fractorual test
        long expective = 120;
        int n = 5;
        long actual = MathUtil.getFractorial(n);
        System.out.println(n + " = " + expective + " Expective");
        System.out.println(n + " = " + actual + " Actual");
    }
}
