package com.darwinjacob;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min Value : " + myMinIntValue);
        System.out.println("Max Value : " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Buseted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        byte myMinByteValue = 50;
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

        byte myByteValue = 100;
        short myShortValue = 10000;
        int myIntValue = 1000000;
        long myLongTotal = 50000+(10*(myByteValue+myShortValue+myIntValue));

        System.out.println(myLongTotal);
    }
}
