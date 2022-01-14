package com.company.candles;

import java.util.Scanner;

public class FuckingCandles {
    static int [] candlesOnCake;
    static int first;
    static int lastLimit = (int)Math.pow(10,3);
    static char[] chars;



    public static int birthdayCakeCandles(Scanner sc){

       while (!sc.hasNextInt()){
            System.out.println("Введите число");
            sc.nextLine();

        }
        while (sc.hasNextInt()){
            first = sc.nextInt();
            System.out.println(first);
            if (first <1 || first >lastLimit){
                System.out.println("Число меньше или больше, и оно не подходит");
                sc.nextLine();
            } else  {
                candlesOnCake = new int[first];
                System.out.println("Длина массива для хранения свечей= "+candlesOnCake.length);
                sc.nextLine();
                String line = sc.nextLine();
                String newLine = line.replaceAll("[^0-9]", "");

                System.out.println("Отформатировали строку "+newLine);
                chars =  newLine.toCharArray();
                System.out.println("Получили массив символов только из цифр =");
                for(Character c: chars){
                    System.out.print(c);


                }
                System.out.println();
                if(chars.length>candlesOnCake.length){
                    System.out.println("ВЫ что то накидали дофига символов, а ну введите еще раз");
                    sc.nextLine();
                }else {
                    break;
                }
                break;
                }

            }
                            System.out.println("Начали глобальную проверку");

                      for(Character c:chars){
                          System.out.println(c);
                      }


        return 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        birthdayCakeCandles(sc);
    }
}
