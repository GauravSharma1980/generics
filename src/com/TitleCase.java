package com;

public class TitleCase {

    public static void main(String[] args) {

        String str = "I am working in Ibm";
        //O/p expected --> IAmWorkingInIbm;

        String outStr = convertToTitleCase(str);
        System.out.println(outStr);
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
