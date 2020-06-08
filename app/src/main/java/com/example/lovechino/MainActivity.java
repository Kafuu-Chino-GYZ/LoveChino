package com.example.lovechino;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=30;
    public void bigger(View v)
    {
        TextView txv=(TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }
    public void smaller(View v)
    {
        if(size>30) {
            TextView txv = (TextView) findViewById(R.id.txv);
            txv.setTextSize(--size);
        }
    }
    public void sayHello(View v)
    {
        EditText name=(EditText) findViewById(R.id.name);
        TextView txv1=(TextView) findViewById(R.id.txv1);
        String str=name.getText().toString();
        if(str.length()==0)
        {
            txv1.setText("请告诉我你他妈的叫什么！");
        }
        else{
            txv1.setText("这个叫"+str+"的傻逼就是你啊？");
        }
    }
    public void showlove(View v)
    {
        TextView txv1=(TextView) findViewById(R.id.txv1);
        txv1.setText("别看了，香风智乃是我的");
    }
}
