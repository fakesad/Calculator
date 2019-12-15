package com.example.dontdelete.util;

public class toStringArrays {
    public static  String[] stringToStringArrays(String str){//字符串转化
        String[] newStr = new String[str.length()];
        int j=0;
        StringBuffer strbuf = new StringBuffer();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(i)=='.'){
                strbuf.append(str.charAt(i));
            }
            else {//if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='('||str.charAt(i)==')'){
                //newStr[i]=Character.toString(str.charAt(i));
                if(strbuf.length()!=0){
                    newStr[j]=strbuf.toString();
                    strbuf=new StringBuffer();
                    j++;
                }
                newStr[j]=str.charAt(i)+"";
                j++;
            }
            if(i==str.length()-1){
                if(strbuf.length()!=0){
                    newStr[j]=strbuf.toString();
                    strbuf=new StringBuffer();
                    j++;
                }
            }
            for(int s = 0;s<newStr.length;s++){
                if(newStr[s]==null){
                    newStr[s]="none";
                }
            }

        }

        return newStr;

    }
}
