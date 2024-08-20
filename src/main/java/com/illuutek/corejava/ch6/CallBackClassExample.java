package com.illuutek.corejava.ch6;


import javax.swing.*;
import java.util.Arrays;

public class CallBackClassExample {
    public static void main(String[] args) {
//        var timerExampleForCallbackExample = new TimerExampleForCallbackExample();
//        Timer timer = new Timer(3000, timerExampleForCallbackExample);
//        timer.start();
//        JOptionPane.showMessageDialog(null,"End the loop?");
//        System.exit(0);
        comparator();
    }
    private static void comparator(){
        var comparator = new LengthComparator();
        String[] sortedArray = new String[]{"hello world","nima","karimian","hello beautiful world"};
         Arrays.sort(sortedArray,comparator);
        System.out.println(Arrays.toString(sortedArray));
    }
}
