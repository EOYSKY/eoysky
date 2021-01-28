/*
  EOYSKY.COM Inc. Copyright (c) 2014-2021 All Rights Reserved.
 */
package com.eoysky.config;

import java.util.Arrays;
import java.util.List;

/**
 * Test
 *
 * @author jonny
 * @version Test.java, v 0.1 2021年01月28日 10:55 下午 jonny
 */
public class Test {
    public static void main(String[] args) {
        String str = "a,b,c";
        String[] split = str.split(",");
        List<String> list = Arrays.asList(split);
        System.out.println(list.toString());
    }
}
