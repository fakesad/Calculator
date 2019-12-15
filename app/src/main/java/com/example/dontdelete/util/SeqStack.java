package com.example.dontdelete.util;

import java.util.Stack;

    public class SeqStack<T> extends Stack {
        public Object[] data;
        public long maxSize;
        public int top;
        public SeqStack(int initialSize) {
            if (initialSize > 0) {
                this.data = new Object[initialSize];
                this.maxSize = initialSize;
                this.top = -1;
            }
        }
        public boolean isEmpty(){
            if(top==-1)
                return true;

            else
                return false;

        }
        public boolean isFull(){
            if(this.top==maxSize-1)
                return true;
            else
                return false;
        }
        public void pushStack(Object value){
            if(!isFull()){
                data[++top]=value;
            }

            else
                System.out.println("栈满，无法入栈");
//	            Log.d("Stack_preblem","栈满，无法入栈");
        }

        public Object pop(){
            Object num = null;
            if(!isEmpty()){
                num=data[top--];

            }
            else
                System.out.println("栈空，无法出栈");
//	            Log.d("Stack_problem","栈空，无法出栈");
            return num;
        }
        public Object peek(){
            Object num = null;
            if(top>=0){
                num=data[top];
            }
            else
                System.out.println("栈空，无法获取栈顶元素");
//	                Log.d("Stack_problem","栈空，无法获取栈顶元素");
            return num;
        }
    }
