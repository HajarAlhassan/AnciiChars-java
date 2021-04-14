package com.tts;
public class AsciiChars
{
    public static void printNumbers(String text)
    {
        char[] charArray = text.toCharArray();
        String result="";
        for(int i=0; i < charArray.length; i++){
            if( Character.isDigit( charArray[i] )){
                result+=charArray[i]+", ";
            }}
            if(result==""){
                System.out.println("No Numbers!!!");
            }else
            {
                System.out.println("The Numbers are:");
                System.out.println(result);
            }

        }

    public static void printLowerCase(String text)
    {
        char[] charArray = text.toCharArray();
        String result="";
        for(int i=0; i < charArray.length; i++){
            if( Character.isLowerCase( charArray[i] )){
                result+=charArray[i]+", ";
            }}
            if(result==""){
                System.out.println("No LowerCase Letters!!!");
            }else
            {
                System.out.println("LowerCase Letters are:");
                System.out.println(result);
            }

        }

    public static void printUpperCase(String text)
    {
        char[] charArray = text.toCharArray();
        String result="";
        for(int i=0; i < charArray.length; i++){
            if( Character.isUpperCase( charArray[i] )){
                result+=charArray[i]+", ";
            }}
            if(result==""){
                System.out.println("No UpperCase Letters!!!!!");
            }else
            {
                System.out.println("UpperCase Letters are:");
                System.out.println(result);
            }

        }
    }
