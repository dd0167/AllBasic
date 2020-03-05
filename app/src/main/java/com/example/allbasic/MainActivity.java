package com.example.allbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd=new Random();

    Button clear;
    TextView counter;
    TextView tof;
    TextView fn;
    TextView sn;
    ImageView k;
    ImageView s;
    ImageView g;
    Button pfn;
    int n1;
    int n2;
    int c;
    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear=(Button) findViewById(R.id.clear);
        counter=(TextView) findViewById(R.id.counter);
        tof=(TextView) findViewById(R.id.tof);
        fn=(TextView) findViewById(R.id.fn);
        sn=(TextView) findViewById(R.id.sn);
        k=(ImageView) findViewById(R.id.k);
        s=(ImageView) findViewById(R.id.s);
        g=(ImageView) findViewById(R.id.g);
        pfn=(Button) findViewById(R.id.pfn);
    }

    public void Clear(View view) {
        counter.setText("counter");
        tof.setText("true / false");
        fn.setText("number 1");
        sn.setText("number 2");
        c=0;
        t=0;
    }

    public void katan(View view) {
        if(n1<n2)
        {
            tof.setText("true");
            c++;
            t++;
            counter.setText(t+"/"+c);
        }
        else
        {
            tof.setText("false");
            c++;
            counter.setText(t+"/"+c);
        }
    }

    public void shave(View view) {
        if(n1==n2)
        {
            tof.setText("true");
            c++;
            t++;
            counter.setText(t+"/"+c);
        }
        else
        {
            tof.setText("false");
            c++;
            counter.setText(t+"/"+c);
        }
    }

    public void gadol(View view) {
        if(n1>n2)
        {
            tof.setText("true");
            c++;
            t++;
            counter.setText(t+"/"+c);
        }
        else
        {
            tof.setText("false");
            c++;
            counter.setText(t+"/"+c);
        }
    }

    public void prfonu(View view) {
        n1= (int) (Math.random()*(100-1+1)+1);
        n2= (int) (Math.random()*(100-1+1)+1);
        fn.setText(" "+n1);
        sn.setText(" "+n2);
    }
}
