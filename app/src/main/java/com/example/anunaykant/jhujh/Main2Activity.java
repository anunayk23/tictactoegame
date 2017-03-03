package com.example.anunaykant.jhujh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
public static int as=0;
    Button bt1=(Button)findViewById(R.id.bt1);
    Button bt2=(Button)findViewById(R.id.bt2);
    Button bt3=(Button)findViewById(R.id.bt3);
    Button bt4=(Button)findViewById(R.id.bt4);
    Button bt5=(Button)findViewById(R.id.bt5);
    Button bt6=(Button)findViewById(R.id.bt6);
    Button bt7=(Button)findViewById(R.id.bt7);
    Button bt8=(Button)findViewById(R.id.bt8);
    Button bt9=(Button)findViewById(R.id.bt9);
    public void b1(View view) {



        if(as%2==0){bt1.setText("O");as++;}

        else{bt1.setText("X");as++;}

    }

    public void b9(View view) { if(as%2==0){bt9.setText("O");as++;}else{bt9.setText("X");as++;}
    }

    public void b8(View view) { if(as%2==0){bt8.setText("O");as++;}else{bt8.setText("X");as++;}
    }

    public void b7(View view) { if(as%2==0){bt7.setText("O");as++;}else{bt7.setText("X");as++;}
    }

    public void b6(View view) { if(as%2==0){bt6.setText("O");as++;}else{bt6.setText("X");as++;}
    }

    public void b5(View view) { if(as%2==0){bt5.setText("O");as++;}else{bt5.setText("X");as++;}
    }

    public void b4(View view) { if(as%2==0){bt4.setText("O");as++;}
        else{bt4.setText("X");as++;}
    }

    public void b3(View view) { if(as%2==0){bt3.setText("O");as++;}else{bt3.setText("X");as++;}
    }

    public void b2(View view) {
        if (as % 2 == 0) {
            bt2.setText("O");
            as++;
        }else{bt2.setText("X");as++;}
    }
}
