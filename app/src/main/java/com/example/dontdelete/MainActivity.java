package com.example.dontdelete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dontdelete.util.calculate;

import static com.example.dontdelete.util.deleteLastN.deleteStrings;
import static com.example.dontdelete.util.deleteLastN.getLastN;
import static com.example.dontdelete.util.toStringArrays.stringToStringArrays;

public class MainActivity extends AppCompatActivity  {

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main,menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.lengthChange:
                Intent intent = new Intent(MainActivity.this, lengthActivity.class);
                startActivity(intent);
                break;
            case R.id.Change:
                Intent intent1 = new Intent(MainActivity.this, sActivity.class);
                startActivity(intent1);
                break;
            case R.id.help:
                Toast.makeText(this, "You clicked help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                finish();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final StringBuffer toCal = new StringBuffer();

       /* final EditText et = findViewById(R.id.text_input);*/
        final calculate newCal = new calculate();

       final TextView tv = findViewById(R.id.text_input);

        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("0");
                tv.setText(toCal);
            }
        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("1");
                tv.setText(toCal);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("2");
                tv.setText(toCal);
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("3");
                tv.setText(toCal);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("4");
                tv.setText(toCal);
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("5");
                tv.setText(toCal);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("6");
                tv.setText(toCal);
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("7");
                tv.setText(toCal);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("8");
                tv.setText(toCal);
            }
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("9");
                tv.setText(toCal);
            }
        });

        Button button_AC = findViewById(R.id.button_AC);
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                tv.setText("请输入");
                toCal.delete(0, toCal.length());
            }
        });

        Button button_ride = findViewById(R.id.button_ride);
        button_ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("*");
                tv.setText(toCal);
            }
        });

        Button button_div = findViewById(R.id.button_div);
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("/");
                tv.setText(toCal);
            }
        });

        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                if (toCal.length() - 1 > 0) {
                    /*toCal.deleteCharAt(toCal.length() - 1);
                    tv.setText(toCal);*/
                    int n = toCal.length() - 1;
                    String s0 = toCal.toString();
                    String[] s = stringToStringArrays(s0);
                    String s2 =deleteStrings(s,1);
                    toCal.setLength(0);
                    toCal.append(s2);
                    tv.setText(s2);
                } else {
                    tv.setText("请输入");      //在输入面板中没有对象时不会闪退
                }
            }
        });

        Button button_sub = findViewById(R.id.button_sub);
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("-");
                tv.setText(toCal);
            }
        });

        Button button_add = findViewById(R.id.button_add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("+");
                tv.setText(toCal);
            }
        });

        Button button_percent = findViewById(R.id.button_percent);
        button_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("%");
                tv.setText(toCal);
            }
        });

        Button button_p = findViewById(R.id.button小数点);
        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append(".");
                tv.setText(toCal);
            }
        });

        Button button_equ = findViewById(R.id.button_equ);
        button_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String st = toCal.toString();
                if(st.length()>0) {
                StringBuffer sb = newCal.toPostfixString(st);
                Double res = newCal.toValue(sb);
                String strDouble = String.valueOf(res);
                toCal.delete(0, toCal.length());
                toCal.append(strDouble);
                tv.setText(strDouble);
                }else {
                    Toast.makeText(MainActivity.this,"请输入",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button button_lf = findViewById(R.id.button_lf);
        button_lf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("^3");
                tv.setText(toCal);
                toCal.delete(toCal.length()-2,toCal.length());
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = d*d*d;
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
            }
        });

        Button button_pf = findViewById(R.id.button_pf);
        button_pf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("^2");
                tv.setText(toCal);
                toCal.delete(toCal.length()-2,toCal.length());
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = d*d;
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
            }
        });

        Button button_ds = findViewById(R.id.button_ds);
        button_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = 1/d;
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_jc = findViewById(R.id.button_jc);
        button_jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = 1.0;
                for(int i = 1 ; i <= d ; i++) {
                    b=b*i;
                }
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_gh = findViewById(R.id.button_gh);
        button_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.sqrt(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_zf = findViewById(R.id.button_zf);
        button_zf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,2);
                Double d = Double.parseDouble(s);
                Double b = Math.abs(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,2);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_e = findViewById(R.id.button_e);
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                Double d = Math.E;
                toCal.append(d.toString());
                tv.setText(toCal);
            }
        });

        Button button_ln = findViewById(R.id.button_ln);
        button_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.log(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_log = findViewById(R.id.button_log);
        button_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.log10(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_cos = findViewById(R.id.button_cos);
        button_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.cos(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_sin = findViewById(R.id.button_sin);
        button_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.sin(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_tan = findViewById(R.id.button_tan);
        button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                String s0 = toCal.toString();
                String[] s1 = stringToStringArrays(s0);
                String s = getLastN(s1,1);
                Double d = Double.parseDouble(s);
                Double b = Math.tan(d);
                Log.d("tag","b的值是："+b);
                String s2 = deleteStrings(s1,1);
                toCal.setLength(0);
                toCal.append(s2);
                toCal.append( b.toString());
                tv.setText(toCal);
            }
        });

        Button button_zkh = findViewById(R.id.button_zkh);
        button_zkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append("(");
                tv.setText(toCal);
            }
        });

        Button button_ykh = findViewById(R.id.button_ykh);
        button_ykh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                toCal.append(")");
                tv.setText(toCal);
            }
        });

        Button button_pi = findViewById(R.id.button_pi);
        button_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //处理事件
                Double d = Math.PI;
                toCal.append(d.toString());
                tv.setText(toCal);
            }
        });

    }


}
