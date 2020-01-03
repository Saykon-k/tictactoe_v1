package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public   EditText e1, e2;
    public  TextView w1,w2;
    String S,S1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainActivity m = new MainActivity();
        final int matr[][] = new int[3][3];
        final int[] check = {1};
        final int[] c= {0};
        final ImageView f = (ImageView)findViewById(R.id.imageView);
       final Button res = (Button)findViewById(R.id.button25);
       final  TextView x = (TextView)findViewById(R.id.textView2);//енто первый игрок
        final KAK a0 = new KAK((Button)findViewById(R.id.el00),0,0,0);
        final KAK a1 = new KAK((Button)findViewById(R.id.el01),0,0,1);
        final  KAK a2 = new KAK((Button)findViewById(R.id.el02),0,0,2);
        final KAK b0 = new KAK((Button)findViewById(R.id.el10),0,1,0);
        final KAK b1 = new KAK((Button)findViewById(R.id.el11),0,1,1);
        final   KAK b2 = new KAK((Button)findViewById(R.id.el12),0,1,2);
        final KAK c0 = new KAK((Button)findViewById(R.id.el20),0,2,0);
        final  KAK c1 = new KAK((Button)findViewById(R.id.el21),0,2,1);
        final KAK c2 =  new KAK((Button)findViewById(R.id.el22),0,2,2);
        final Button mat[]= new Button[9];
        w1 = (TextView)findViewById(R.id.gam1);
        w2 = (TextView)findViewById(R.id.gam2);
         S = getIntent().getStringExtra("name1");
        S1 = getIntent().getStringExtra("name2");
        w1.setText(S);
        w2.setText(S1);
        res.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pods(matr);
                        a0.tap.setText("");
                        a1.tap.setText("");
                        a2.tap.setText("");
                        b0.tap.setText("");
                        b1.tap.setText("");
                        b2.tap.setText("");
                        c0.tap.setText("");
                        c1.tap.setText("");
                        c2.tap.setText("");
                        x.setVisibility(x.INVISIBLE);
                        f.setVisibility(f.INVISIBLE);
                        a0.tap.setClickable(true);
                        a1.tap.setClickable(true);
                        a2.tap.setClickable(true);
                        b0.tap.setClickable(true);
                        b1.tap.setClickable(true);
                        b2.tap.setClickable(true);
                        c0.tap.setClickable(true);
                        c1.tap.setClickable(true);
                        c2.tap.setClickable(true);
                        check[0]=1;
                        c[0]=0;
                    }
                }
        );
        a0.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] = bupUSA1(a0.tap,a0.place1,a0.place2, matr,check[0] ,f,x,c[0],S,S1);

                    }
                }
        );
        a1.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0]= bupUSA1(a1.tap,a1.place1,a1.place2, matr,check[0] ,f,x,c[0],S,S1);

                    }
                }
        );
        a2.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] =  bupUSA1(a2.tap,a2.place1,a2.place2, matr,check[0],f ,x,c[0],S,S1);

                    }
                }
        );
        b0.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                       c[0]= bupUSA1(b0.tap,b0.place1,b0.place2, matr,check[0],f,x,c[0] ,S,S1);

                    }
                }
        );
        b1.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] = bupUSA1(b1.tap,b1.place1,b1.place2, matr,check[0],f ,x,c[0],S,S1);

                    }
                }
        );
        b2.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                       c[0]= bupUSA1(b2.tap,b2.place1,b2.place2, matr,check[0] ,f,x,c[0],S,S1);
                    }
                }
        );
        c0.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] =  bupUSA1(c0.tap,c0.place1,c0.place2, matr,check[0],f, x,c[0],S,S1);

                    }
                }
        );
        c1.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] =  bupUSA1(c1.tap,c1.place1,c1.place2, matr,check[0] ,f,x,c[0],S,S1);

                    }
                }
        );
        c2.tap.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check[0]++;
                        c[0] =  bupUSA1(c2.tap,c2.place1,c2.place2, matr,check[0] ,f,x,c[0],S,S1);

                    }
                }
        );
    }
    int   bupUSA1( Button bt,int place1,int place2,int mat[][],int ch,ImageView f,TextView RES,int c,String s,String s1  ) {// енто второй игрок
        if (c == 0) {
            if (ch % 2 == 0) {//енто первый игрок
                mat[place1][place2] = 1;
                bt.setText("X");
                if ((
                        mat[0][0] + mat[0][1] + mat[0][2] == 3) ||
                        (mat[1][0] + mat[1][1] + mat[1][2] == 3) ||
                        (mat[2][0] + mat[2][1] + mat[2][2] == 3) ||
                        (mat[0][0] + mat[1][0] + mat[2][0] == 3) ||
                        (mat[0][1] + mat[1][1] + mat[2][1] == 3) ||
                        (mat[0][2] + mat[1][2] + mat[2][2] == 3) ||
                        (mat[0][0] + mat[1][1] + mat[2][2] == 3) ||
                        (mat[0][2] + mat[1][1] + mat[2][0] == 3)) {
                    c++;
                    f.setVisibility(f.VISIBLE);
                    RES.setVisibility(RES.VISIBLE);
                    RES.setText(S+" - победитель \n " + " И ВОТ ЕГО ПРИЗ !");

                }
                bt.setClickable(false);
            } else {
                mat[place1][place2] = 4;
                bt.setText("O");
                if ((
                        mat[0][0] + mat[0][1] + mat[0][2] == 12) ||
                        (mat[1][0] + mat[1][1] + mat[1][2] == 12) ||
                        (mat[2][0] + mat[2][1] + mat[2][2] == 12) ||
                        (mat[0][0] + mat[1][0] + mat[2][0] == 12) ||
                        (mat[0][1] + mat[1][1] + mat[2][1] == 12) ||
                        (mat[0][2] + mat[1][2] + mat[2][2] == 12) ||
                        (mat[0][0] + mat[1][1] + mat[2][2] == 12) ||
                        (mat[0][2] + mat[1][1] + mat[2][0] == 12)) {
                    c++;
                    f.setVisibility(f.VISIBLE);
                    RES.setVisibility(RES.VISIBLE);
                    RES.setText(S1+" - победитель\n " + " И ВОТ ЕГО ПРИЗ ");
                }
                bt.setClickable(false);
            }

        }
        bt.setClickable(false);
        return c;
    }
    public static class KAK {
        Button tap;
        int zz ;
        int place1;
        int place2;

        public KAK(Button tap,int zz ,int place1,int place2) {
            this.tap = tap;
            this.place1 = place1;
            this.place2 = place2;
            this.zz=zz;
        }
    }
    public void pods(int matr[][]){
        for(int x = 0 ;x<3;x++) {
            for (int x1 = 0; x1 < 3; x1++) {
                matr[x][x1] = 0;
            }
        }


    }
}