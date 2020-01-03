package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  public   EditText v2, v1;
   public  Button start;
   public TextView w,w1;
    String S,S1;
    private int y = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v2 = (EditText) findViewById(R.id.editText3);
        v1 = (EditText) findViewById(R.id.editText4);
        start = (Button) findViewById(R.id.button2);
        w = (TextView)findViewById(R.id.gam1);
        w1 = (TextView)findViewById(R.id.gam2);
        start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        S = v2.getText().toString();
                        S1 = v1.getText().toString();
                        rar(start, v2, v1,S,S1);
                    }
                }
        );
    }
    public  void rar(Button bb, EditText text1, EditText text2,String s,String s1) {

        if (s1.equals("") && s.equals("")) {
            Toast.makeText(
                    MainActivity.this, "введите имена двух игроков", Toast.LENGTH_LONG
            ).show();
        } else {
            if (s.equals("")) {
                Toast.makeText(
                        MainActivity.this, "введите имя первого игрока", Toast.LENGTH_LONG
                ).show();

            } else {
                if (s1.equals("")) {
                    Toast.makeText(
                            MainActivity.this, "введите имя второго игрока", Toast.LENGTH_LONG
                    ).show();
                } else {
                    Intent t = new Intent(getBaseContext(),Main2Activity.class);
                    t.putExtra("name1",s);
                    t.putExtra("name2",s1);
                    startActivity(t);
                }
            }
        }
    }
}

