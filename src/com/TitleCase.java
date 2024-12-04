package com;

import java.util.Arrays;

public class TitleCase {

    public static void main(String[] args) {

        String str = "I am working in Ibm";
        //O/p expected --> IAmWorkingInIbm;

        String outStr = convertToTitleCase(str);
        System.out.println(outStr);

        System.out.println("***************************");
        String str1 = "I am working in Ibm";
        String strOut = convertToTitleCaseUsingStreamApi(str1);
        System.out.println(strOut);
    }

    private static String convertToTitleCaseUsingStreamApi(String inputString) {
        StringBuilder strTemp = new StringBuilder();
/*        Arrays.asList(inputString.toCharArray()).stream()
                //.filter(character -> Integer.valueOf(Arrays.toString(character)) != 32)
                //.filter(character -> Integer.valueOf(Arrays.toString(character)) >= 97 && Integer.valueOf(Arrays.toString(character)) < 123)
                .map(character -> strTemp.append(character));*/
        Arrays.asList(inputString.toCharArray()).stream()
                .filter(character ->String.valueOf(character) != " ")
                .forEach(System.out::println);
        return strTemp.toString();
    }

    private static String convertToTitleCase(String str) {

        char[] charArray = str.toCharArray();
        String strTemp="";
        for (int i = 0;i<charArray.length;i++){

            if(charArray[i] == ' ') {
                continue;
            }else{
                if((charArray[i] >= 97 && charArray[i] < 123) && !(charArray[i-1] >=65 && charArray[i] <=123))
                strTemp += (char) (charArray[i] - 32);
                else
                    strTemp += (char) (charArray[i]);
            }
        }
        return strTemp;
    }
}
