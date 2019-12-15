package com.example.dontdelete.util;

    public class deleteLastN {

        public static String deleteStrings (String[] strings , int n) {
            int m =0 ;

            for(int j = 0;j<strings.length;j++) {
                if(strings[j]=="none") {
                    m++;
                }
            }
            System.out.println(m);
            String[] strings2 = new String[strings.length - n - m] ;

            for(int i = 0 ; i <strings2.length ; i++) {
                strings2[i] = strings[i];
            }

            String sbuffer = "";

            for(int i = 0 ; i<strings2.length ; i++) {
                sbuffer= sbuffer+strings2[i];
            }
            return sbuffer;
        }

        public static String getLastN(String[] strings ,int n) {
            int m = 0 ;
            int k = n;

            for(int j = 0;j<strings.length;j++) {
                if(strings[j]=="none") {
                    m++;
                }
            }

            String[] strings2 = new String[strings.length- m] ;

            for(int i = 0 ; i <strings2.length ; i++) {
                strings2[i] = strings[i];
            }
            String[] strings3 = new String[k];
            for(int i = 0 ; i<k;i++) {
                strings3[i]=strings2[strings2.length-1-i];
            }

            String sbuffer ="";

            for(int i = strings3.length-1; i >= 0 ; i--) {
                sbuffer = sbuffer+strings3[i];
            }
            return sbuffer;
        }

//	public static void main(String[] args) {
//		String string = "123+123+11-22";
//		String[] strings = stringToStringArrays(string);
//		StringBuffer s2 = deleteStrings(strings,2);
//		for(int i = 0 ; i < strings.length ;i++ ) {
//			System.out.print(strings[i] + " ");
//		}
//		System.out.println();
//		System.out.println(s2);
//		for(int i = 0 ; i < s2.length ;i++ ) {
//			System.out.print(s2[i] + " ");
//		}


//	}



    }

