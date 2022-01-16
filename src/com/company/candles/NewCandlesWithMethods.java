package com.company.candles;

import java.util.*;

public class NewCandlesWithMethods {
    static int[] candlesOnCake;
    static int varableForScanner;
    final static int LAST_LIMIT = 1000;
    final static int MIN_LIMIT = 1;
    static Scanner sc;
    static String testLine;
    static char[] charsFromTestString;


    public static void main(String[] args) {
        birthdayCakeCandles();

    }


    public static int inputSetValueLengthArrayforCanndles() {
        sc = new Scanner(System.in);
        try {
            while (sc.hasNextLine()) {
                if (sc.hasNextInt()) {
                    try {
                        while (sc.hasNextInt()) {
                            varableForScanner = sc.nextInt();
                            if (varableForScanner >= MIN_LIMIT && varableForScanner < LAST_LIMIT) {
                                System.out.println("You set data from array");
                                System.out.println(varableForScanner);
                                candlesOnCake = new int[varableForScanner];
                                System.out.println("Length to array = " + candlesOnCake.length);

                                inputSetValuesFromArray();

                                if (candlesOnCake.length > 0) {
                                    sc.close();
                                }
                            } else {
                                System.out.println("You must input more 1 or low 1000");
                            }
                        }
                    } catch (IllegalStateException e) {
//                        System.out.println("Exp");
                    } finally {
                        sc.close();
                    }
                } else if (!sc.hasNextInt()) {
                    System.out.println("Input numbers");
                    sc.reset();
                    sc.nextLine();
                }
            }
        } catch (IllegalStateException e) {
//            System.out.println("To clouse");
        } finally {
            sc.close();
        }
        return candlesOnCake.length;
    }


    public static void inputSetValuesFromArray() {
        sc = new Scanner(System.in);
        try {
            while (sc.hasNextLine()) {
                testLine = sc.nextLine().replaceAll("[^0-9]", "");
                charsFromTestString = testLine.toCharArray();

                if (charsFromTestString.length == candlesOnCake.length) {

                    for (int i = 0; i < charsFromTestString.length; i++) {
                        candlesOnCake[i] = Character.getNumericValue(charsFromTestString[i]);
                    }
                    for (int i : candlesOnCake) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    sortArray(candlesOnCake);

                    sc.close();
                } else if (charsFromTestString.length > candlesOnCake.length || charsFromTestString.length < candlesOnCake.length) {
                    int length = charsFromTestString.length - candlesOnCake.length;
                    if (length > 0) {
                        System.out.println("You need input text again. Because to much symbols " + length);
                    }
                    sc.reset();
                    if (length < 0) {
                        System.out.println("You need input text again. Because to Few symbols " + length);

                        sc.reset();
                    }
                }

            }
        } catch (IllegalStateException i) {

        } finally {
            sc.close();
        }

    }

    public static void sortArray(int[] arr) {
        arr = candlesOnCake;
        OptionalInt max = Arrays.stream(arr).max();
        int maxvalue = max.getAsInt();
        System.out.println("Count bigest cindles");
        Arrays.stream(arr).filter(n -> (n == maxvalue)).forEach(System.out::println);
    }


    public static void birthdayCakeCandles() {
        inputSetValueLengthArrayforCanndles();
        inputSetValuesFromArray();


    }
}



