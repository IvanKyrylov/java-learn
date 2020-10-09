package com.vannsha;

import com.vannsha.leetcode.task.array.ContainsDuplicate;
import com.vannsha.leetcode.task.array.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int[] test = {3,1};
//
//        RotateArray rotateArray = new RotateArray();
//        rotateArray.rotateMyStupidMode(test, 3);
//        System.out.println(Arrays.toString(test));

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(test));
    }
}
