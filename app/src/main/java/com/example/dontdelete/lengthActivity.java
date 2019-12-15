package com.example.dontdelete;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.math.BigDecimal;

public class lengthActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        final TextView tv1 = findViewById(R.id.len_textView_1);
        final TextView tv2 = findViewById(R.id.len_textView_2);

       final Spinner p1 = findViewById(R.id.spinner_first);
       final Spinner p2 = findViewById(R.id.spinner_second);

       final StringBuffer s = new StringBuffer();

       Button bt0 = findViewById(R.id.len_btn_0);
       bt0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               s.append("0");
               tv1.setText(s);
           }
       });

        Button bt1 = findViewById(R.id.len_btn_1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.append("1");
                tv1.setText(s);
            }
        });

        Button bt2 = findViewById(R.id.len_btn_2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.append("2");
                tv1.setText(s);
            }
        });

        Button bt3 = findViewById(R.id.len_btn_3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("3");
                tv1.setText(s);
            }
        });

        Button bt4 = findViewById(R.id.len_btn_4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("4");
                tv1.setText(s);
            }
        });

        Button bt5 = findViewById(R.id.len_btn_5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("5");
                tv1.setText(s);
            }
        });

        Button bt6 = findViewById(R.id.len_btn_6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("6");
                tv1.setText(s);
            }
        });

        Button bt7 = findViewById(R.id.len_btn_7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("7");
                tv1.setText(s);
            }
        });

        Button bt8 = findViewById(R.id.len_btn_8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("8");
                tv1.setText(s);
            }
        });

        Button bt9 = findViewById(R.id.len_btn_9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.append("9");
                tv1.setText(s);
            }
        });

        Button bt_del = findViewById(R.id.len_btn_del);
        bt_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.delete(s.length()-1,s.length());
                tv1.setText(s);
            }
        });

        Button bt_ce = findViewById(R.id.len_btn_ce);
        bt_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.delete(0,s.length());
                tv1.setText("");
                tv2.setText("");
            }
        });

        Button bt_equal = findViewById(R.id.len_btn_equal);
        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = p1.getSelectedItemPosition();
                int j = p2.getSelectedItemPosition();

                String st = s.toString();
                BigDecimal bd ;
                String out = "";
                int n = Integer.parseInt(st);
                BigDecimal a = new BigDecimal(n);

                if(i==0 && j ==0) {
                    tv2.setText(s);
                }
                if(i==0 && j==1) {
                    bd = a.divide(new BigDecimal(1000));
                    out = bd.toString();
                    tv2.setText(out);
                }
                if(i==0 && j==2) {
                    bd = a.divide(new BigDecimal(1000000));
                    out = bd.toString();
                    tv2.setText(out);
                }
                if(i==0 && j==3) {
                    bd = a.divide(new BigDecimal(1000000000));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==0 && j==4) {
                    bd = a.divide(new BigDecimal("1000000000000"));
                    out =bd.toString();
                    tv2.setText(out);
                }
                if(i==0 && j==5) {
                    bd = a.divide(new BigDecimal("1000000000000000"));
                    out =bd.toString();
                    tv2.setText(out);
                }

                if(i==1 && j==0) {
                    bd = a.multiply(new BigDecimal(1000));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==1 && j==1) {
                    tv2.setText(s);
                }

                if(i==1 && j==2) {
                    bd = a.divide(new BigDecimal(1000));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==1 && j==3) {
                    bd = a.divide(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==1 && j==4) {
                    bd = a.divide(new BigDecimal("1000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==1 && j==5) {
                    bd = a.divide(new BigDecimal("1000000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==2 && j==0) {
                    bd = a.multiply(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==2 && j==1) {
                    bd = a.divide(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==2 && j==2) {
                    tv2.setText(s);
                }

                if(i==2 && j==3) {
                    bd = a.multiply(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==2 && j==4) {
                    bd = a.multiply(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==2 && j==5) {
                    bd = a.multiply(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==3 && j==0) {
                    bd = a.multiply(new BigDecimal("1000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==3 && j==1) {
                    bd = a.multiply(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==3 && j==2) {
                    bd = a.multiply(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==3 && j==3) {
                    tv2.setText(s);
                }

                if(i==3 && j==4) {
                    bd = a.divide(new BigDecimal(1000));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==3 && j==5) {
                    bd = a.divide(new BigDecimal(1000000));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==0) {
                    bd = a.multiply(new BigDecimal("1000000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==1) {
                    bd = a.multiply(new BigDecimal("1000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==2) {
                    bd = a.multiply(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==3) {
                    bd = a.multiply(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==4) {
                    tv2.setText(s);
                }

                if(i==4 && j==5) {
                    bd = a.divide(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==4 && j==2) {
                    bd = a.divide(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==0) {
                    bd = a.multiply(new BigDecimal("1000000000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==1) {
                    bd = a.multiply(new BigDecimal("1000000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==2) {
                    bd = a.multiply(new BigDecimal("1000000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==3) {
                    bd = a.multiply(new BigDecimal("1000000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==4) {
                    bd = a.multiply(new BigDecimal("1000"));
                    out = bd.toString();
                    tv2.setText(out);
                }

                if(i==5 && j==5) {
                    tv2.setText(s);
                }
            }
        });
    }
}
