package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b7,b8,b9,b4,b5,b6,b1,b2,b3,b0,bcl,bti,bpeng,bpen,bper,bpem,bhas;
    TextView tview;
    double var1,var2;
    boolean peng,pen,pem,per;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.bt4);
        b5=(Button) findViewById(R.id.bt5);
        b6=(Button) findViewById(R.id.bt6);
        b7=(Button) findViewById(R.id.bt7);
        b8=(Button) findViewById(R.id.bt8);
        b9=(Button) findViewById(R.id.bt9);
        b0=(Button) findViewById(R.id.bt0);
        bcl=(Button) findViewById(R.id.btcl);
        bti=(Button) findViewById(R.id.btti);
        bpen=(Button) findViewById(R.id.btpen);
        bpeng=(Button) findViewById(R.id.btpeng);
        bper=(Button) findViewById(R.id.btper);
        bper=(Button) findViewById(R.id.btper);
        bpem=(Button) findViewById(R.id.btpem);
        bhas=(Button) findViewById(R.id.bthas);
        tview=(TextView)findViewById(R.id.txview);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"3");
            }
        }); b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+"0");
            }
        });
        bti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText(tview.getText()+".");
            }
        });
        bpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(tview.getText()+"");
                pen=true;
                tview.setText(null);
            }
        });
        bpem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(tview.getText()+"");
                pem=true;
                tview.setText(null);
            }
        });
        bpeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(tview.getText()+"");
                peng=true;
                tview.setText(null);
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(tview.getText()+"");
                per=true;
                tview.setText(null);
            }
        });
        bhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(tview.getText()+"");
                if (pen==true)
                {
                    tview.setText(var1+var2+"");
                    pen=false;
                }
                if (peng==true)
                {
                    tview.setText(var1-var2+"");
                    peng=false;
                }
                if (pem==true)
                {
                    tview.setText(var1/var2+"");
                    pem=false;
                }
                if (per==true)
                {
                    tview.setText(var1*var2+"");
                    per=false;
                }
            }
        });
        bcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tview.setText("");
            }
        });

    }
}
