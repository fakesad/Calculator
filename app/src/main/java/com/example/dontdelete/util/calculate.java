package com.example.dontdelete.util;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculate {
    public static StringBuffer toPostfixString(String infix){
        Stack<String> stack = new SeqStack<String>(infix.length());
        StringBuffer postfix=new StringBuffer(infix.length());
        String[] newstr = stringToStringArrays(infix);
        int i=0;
        while(i<newstr.length){
            String ch = newstr[i];
            switch (ch){
                case "+": case"-":
                    while(!stack.isEmpty()&&!stack.peek().equals("("))
                        postfix.append(stack.pop());
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case "*": case"/":
                    while(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case "(":
                    ((SeqStack) stack).pushStack(ch+"");
                    i++;
                    break;
                case ")":
                    String out = stack.pop();
                    while(out!=null && !out.equals("(")){
                        postfix.append(out);
                        out=stack.pop();
                    }

                    i++;
                    break;
                case "none":
                    i++;
                    break;
                default:
                    while(i<infix.length()&&isNumberic(ch)){
                        postfix.append(ch);
                        i++;
                        if(i<infix.length()){
                            ch=newstr[i];
                        }
                        postfix.append(" ");
                    }

            }

        }
        while(!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix;
    }
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new SeqStack<Double>(postfix.length());
        String[] strArr= new String[postfix.length()];
        strArr=stringToStringArrays(postfix.toString());
//    	for (int i = 0; i < strArr.length; i++) {
//			System.out.print(strArr[i]);
//		}
        Double value=0.00;
        for(int i=0;i<postfix.length();i++){
            String ch = strArr[i];
            if(isNumberic((ch))){
                value=0.00;
                value=Double.parseDouble(ch);
//        			value=value*10+ch - '0';
                i++;
                ch=strArr[i];

                ((SeqStack<String>) stack).pushStack(value);
            }
            else
            if(ch!= " "&&ch!="none"){
                double y = stack.pop();
                double x = stack.pop();
                switch(ch){
                    case"+":value=x+y;break;
                    case"-":value=x-y;break;
                    case"*":value=x*y;break;
                    case"/":value=x/y;break;
                }
//        			System.out.print(x+(ch+"")+y+"="+value+",");
                ((SeqStack<String>) stack).pushStack(value);
            }
        }
        return stack.pop();

    }

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

    public static boolean isNumberic(String str) {//
        //Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+");//这个有问题，一位的整数不能通过
        if(str!=null){
            Pattern pattern = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");//这个是对的
            Matcher isNum = pattern.matcher(str);
            if (!isNum.matches()) {
                return false;
            }
            else
                return true;
        }

        else
            return false;
    }
}
