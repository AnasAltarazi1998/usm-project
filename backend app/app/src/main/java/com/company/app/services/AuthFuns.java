package com.company.app.services;

public class AuthFuns {
   public static String encodePass(String value){
    String res = "";
    for (int i = 0; i < value.length(); i++) {
        res+=value.charAt(i)-3;
    }
    return res;
   } 
   public static String decodePass(String value)
   {
       String res = "";
       for (int i = 0; i < value.length(); i++) {
           res+=value.charAt(i)+3;
       }
       return res;
   }
}
