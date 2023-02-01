package com.example.warcaby;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView button1;
    private ImageView button2;
    private ImageView button3;
    private ImageView button4;
    private ImageView button5;
    private ImageView button6;
    private ImageView button7;
    private ImageView button8;
    private ImageView button9;
    private ImageView button10;
    private ImageView button11;
    private ImageView button12;
    private ImageView button13;
    private ImageView button14;
    private ImageView button15;
    private ImageView button16;
    private ImageView button17;
    private ImageView button18;
    private ImageView button19;
    private ImageView button20;
    private ImageView button21;
    private ImageView button22;
    private ImageView button23;
    private ImageView button24;
    private ImageView button25;
    private ImageView button26;
    private ImageView button27;
    private ImageView button28;
    private ImageView button29;
    private ImageView button30;
    private ImageView button31;
    private ImageView button32;
    private ImageView button33;
    private ImageView button34;
    private ImageView button35;
    private ImageView button36;
    private ImageView button37;
    private ImageView button38;
    private ImageView button39;
    private ImageView button40;
    private ImageView button41;
    private ImageView button42;
    private ImageView button43;
    private ImageView button44;
    private ImageView button45;
    private ImageView button46;
    private ImageView button47;
    private ImageView button48;
    private ImageView button49;
    private ImageView button50;
    private ImageView button51;
    private ImageView button52;
    private ImageView button53;
    private ImageView button54;
    private ImageView button55;
    private ImageView button56;
    private ImageView button57;
    private ImageView button58;
    private ImageView button59;
    private ImageView button60;
    private ImageView button61;
    private ImageView button62;
    private ImageView button63;
    private ImageView button64;
    private TableLayout tableLayout;
    private Button button;
    private Integer[][] board;
    private int running;
    private int iks;
    private int ygrek;
    private int limit;

    private TextView textView0;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = new Integer[8][8];

        running=1;
        iks=100;
        ygrek=100;
        limit=0;

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.imageView1);
        button2 = findViewById(R.id.imageView2);
        button3 = findViewById(R.id.imageView3);
        button4 = findViewById(R.id.imageView4);
        button5 = findViewById(R.id.imageView5);
        button6 = findViewById(R.id.imageView6);
        button7 = findViewById(R.id.imageView7);
        button8 = findViewById(R.id.imageView8);
        button9 = findViewById(R.id.imageView9);
        button10 = findViewById(R.id.imageView10);
        button11 = findViewById(R.id.imageView11);
        button12 = findViewById(R.id.imageView12);
        button13 = findViewById(R.id.imageView13);
        button14 = findViewById(R.id.imageView14);
        button15 = findViewById(R.id.imageView15);
        button16 = findViewById(R.id.imageView16);
        button17 = findViewById(R.id.imageView17);
        button18 = findViewById(R.id.imageView18);
        button19 = findViewById(R.id.imageView19);
        button20 = findViewById(R.id.imageView20);
        button21 = findViewById(R.id.imageView21);
        button22 = findViewById(R.id.imageView22);
        button23 = findViewById(R.id.imageView23);
        button24 = findViewById(R.id.imageView24);
        button25 = findViewById(R.id.imageView25);
        button26 = findViewById(R.id.imageView26);
        button27 = findViewById(R.id.imageView27);
        button28 = findViewById(R.id.imageView28);
        button29 = findViewById(R.id.imageView29);
        button30 = findViewById(R.id.imageView30);
        button31 = findViewById(R.id.imageView31);
        button32 = findViewById(R.id.imageView32);
        button33 = findViewById(R.id.imageView33);
        button34 = findViewById(R.id.imageView34);
        button35 = findViewById(R.id.imageView35);
        button36 = findViewById(R.id.imageView36);
        button37 = findViewById(R.id.imageView37);
        button38 = findViewById(R.id.imageView38);
        button39 = findViewById(R.id.imageView39);
        button40 = findViewById(R.id.imageView40);
        button41 = findViewById(R.id.imageView41);
        button42 = findViewById(R.id.imageView42);
        button43 = findViewById(R.id.imageView43);
        button44 = findViewById(R.id.imageView44);
        button45 = findViewById(R.id.imageView45);
        button46 = findViewById(R.id.imageView46);
        button47 = findViewById(R.id.imageView47);
        button48 = findViewById(R.id.imageView48);
        button49 = findViewById(R.id.imageView49);
        button50 = findViewById(R.id.imageView50);
        button51 = findViewById(R.id.imageView51);
        button52 = findViewById(R.id.imageView52);
        button53 = findViewById(R.id.imageView53);
        button54 = findViewById(R.id.imageView54);
        button55 = findViewById(R.id.imageView55);
        button56 = findViewById(R.id.imageView56);
        button57 = findViewById(R.id.imageView57);
        button58 = findViewById(R.id.imageView58);
        button59 = findViewById(R.id.imageView59);
        button60 = findViewById(R.id.imageView60);
        button61 = findViewById(R.id.imageView61);
        button62 = findViewById(R.id.imageView62);
        button63 = findViewById(R.id.imageView63);
        button64 = findViewById(R.id.imageView64);

        tableLayout = findViewById(R.id.tableLayout);
        textView0 = findViewById(R.id.textView0);

        reset();
        //test();
        //test2();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                //test();
                //test2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=0;
                int yy=1;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button2.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button2.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=0;
                int yy=3;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button4.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button4.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=0;
                int yy=5;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button6.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button6.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=0;
                int yy=7;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button8.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button8.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=1;
                int yy=0;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button9.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button9.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=1;
                int yy=2;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button11.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button11.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=1;
                int yy=4;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button13.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button13.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=1;
                int yy=6;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button15.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button15.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=2;
                int yy=1;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button18.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button18.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=2;
                int yy=3;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button20.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button20.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=2;
                int yy=5;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button22.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button22.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=2;
                int yy=7;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button24.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button24.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=3;
                int yy=0;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button25.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button25.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=3;
                int yy=2;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button27.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button27.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=3;
                int yy=4;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button29.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button29.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=3;
                int yy=6;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button31.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button31.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=4;
                int yy=1;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button34.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button34.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=4;
                int yy=3;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button36.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button36.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=4;
                int yy=5;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button38.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button38.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=4;
                int yy=7;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button40.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button40.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=5;
                int yy=0;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button41.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button41.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=5;
                int yy=2;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button43.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button43.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=5;
                int yy=4;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button45.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button45.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=5;
                int yy=6;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button47.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button47.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=6;
                int yy=1;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button50.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button50.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=6;
                int yy=3;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button52.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button52.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=6;
                int yy=5;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button54.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button54.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=6;
                int yy=7;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button56.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button56.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=7;
                int yy=0;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button57.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button57.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=7;
                int yy=2;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button59.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button59.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=7;
                int yy=4;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button61.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button61.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx=7;
                int yy=6;
                if (running==1 && iks==100 && ygrek==100 && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    button63.setBackgroundColor(Color.parseColor("#FF0000"));
                    iks=xx;
                    ygrek=yy;
                    return;
                }
                if (running==1 && iks==xx && ygrek==yy && (board[xx][yy]==1 || board[xx][yy]==3)) {
                    iks=100;
                    ygrek=100;
                    button63.setBackgroundColor(Color.parseColor("#00B000"));
                    return;
                }
                if (running==1 && iks!=100 && ygrek!=100 && board[xx][yy]==0) {
                    possibleMoves(xx,yy);
                    count();
                }
            }
        });
    }

    public void changeToGreen(int x, int y) {
        if (x==0 && y==1) {
            board[x][y]=0;
            button2.setBackgroundColor(Color.parseColor("#00B000"));
            button2.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==0 && y==3) {
            board[x][y]=0;
            button4.setBackgroundColor(Color.parseColor("#00B000"));
            button4.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==0 && y==5) {
            board[x][y]=0;
            button6.setBackgroundColor(Color.parseColor("#00B000"));
            button6.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==0 && y==7) {
            board[x][y]=0;
            button8.setBackgroundColor(Color.parseColor("#00B000"));
            button8.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==1 && y==0) {
            board[x][y]=0;
            button9.setBackgroundColor(Color.parseColor("#00B000"));
            button9.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==1 && y==2) {
            board[x][y]=0;
            button11.setBackgroundColor(Color.parseColor("#00B000"));
            button11.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==1 && y==4) {
            board[x][y]=0;
            button13.setBackgroundColor(Color.parseColor("#00B000"));
            button13.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==1 && y==6) {
            board[x][y]=0;
            button15.setBackgroundColor(Color.parseColor("#00B000"));
            button15.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==2 && y==1) {
            board[x][y]=0;
            button18.setBackgroundColor(Color.parseColor("#00B000"));
            button18.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==2 && y==3) {
            board[x][y]=0;
            button20.setBackgroundColor(Color.parseColor("#00B000"));
            button20.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==2 && y==5) {
            board[x][y]=0;
            button22.setBackgroundColor(Color.parseColor("#00B000"));
            button22.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==2 && y==7) {
            board[x][y]=0;
            button24.setBackgroundColor(Color.parseColor("#00B000"));
            button24.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==3 && y==0) {
            board[x][y]=0;
            button25.setBackgroundColor(Color.parseColor("#00B000"));
            button25.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==3 && y==2) {
            board[x][y]=0;
            button27.setBackgroundColor(Color.parseColor("#00B000"));
            button27.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==3 && y==4) {
            board[x][y]=0;
            button29.setBackgroundColor(Color.parseColor("#00B000"));
            button29.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==3 && y==6) {
            board[x][y]=0;
            button31.setBackgroundColor(Color.parseColor("#00B000"));
            button31.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==4 && y==1) {
            board[x][y]=0;
            button34.setBackgroundColor(Color.parseColor("#00B000"));
            button34.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==4 && y==3) {
            board[x][y]=0;
            button36.setBackgroundColor(Color.parseColor("#00B000"));
            button36.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==4 && y==5) {
            board[x][y]=0;
            button38.setBackgroundColor(Color.parseColor("#00B000"));
            button38.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==4 && y==7) {
            board[x][y]=0;
            button40.setBackgroundColor(Color.parseColor("#00B000"));
            button40.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==5 && y==0) {
            board[x][y]=0;
            button41.setBackgroundColor(Color.parseColor("#00B000"));
            button41.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==5 && y==2) {
            board[x][y]=0;
            button43.setBackgroundColor(Color.parseColor("#00B000"));
            button43.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==5 && y==4) {
            board[x][y]=0;
            button45.setBackgroundColor(Color.parseColor("#00B000"));
            button45.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==5 && y==6) {
            board[x][y]=0;
            button47.setBackgroundColor(Color.parseColor("#00B000"));
            button47.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==6 && y==1) {
            board[x][y]=0;
            button50.setBackgroundColor(Color.parseColor("#00B000"));
            button50.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==6 && y==3) {
            board[x][y]=0;
            button52.setBackgroundColor(Color.parseColor("#00B000"));
            button52.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==6 && y==5) {
            board[x][y]=0;
            button54.setBackgroundColor(Color.parseColor("#00B000"));
            button54.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==6 && y==7) {
            board[x][y]=0;
            button56.setBackgroundColor(Color.parseColor("#00B000"));
            button56.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==7 && y==0) {
            board[x][y]=0;
            button57.setBackgroundColor(Color.parseColor("#00B000"));
            button57.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==7 && y==2) {
            board[x][y]=0;
            button59.setBackgroundColor(Color.parseColor("#00B000"));
            button59.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==7 && y==4) {
            board[x][y]=0;
            button61.setBackgroundColor(Color.parseColor("#00B000"));
            button61.setImageResource(R.drawable.ic_green_circle_foreground);
        }
        if (x==7 && y==6) {
            board[x][y]=0;
            button63.setBackgroundColor(Color.parseColor("#00B000"));
            button63.setImageResource(R.drawable.ic_green_circle_foreground);
        }
    }

    public void changeToBlack (int x, int y) {
        if (x==0 && y==1) {
            board[x][y]=2;
            button2.setBackgroundColor(Color.parseColor("#00B000"));
            button2.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==0 && y==3) {
            board[x][y]=2;
            button4.setBackgroundColor(Color.parseColor("#00B000"));
            button4.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==0 && y==5) {
            board[x][y]=2;
            button6.setBackgroundColor(Color.parseColor("#00B000"));
            button6.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==0 && y==7) {
            board[x][y]=2;
            button8.setBackgroundColor(Color.parseColor("#00B000"));
            button8.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==1 && y==0) {
            board[x][y]=2;
            button9.setBackgroundColor(Color.parseColor("#00B000"));
            button9.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==1 && y==2) {
            board[x][y]=2;
            button11.setBackgroundColor(Color.parseColor("#00B000"));
            button11.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==1 && y==4) {
            board[x][y]=2;
            button13.setBackgroundColor(Color.parseColor("#00B000"));
            button13.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==1 && y==6) {
            board[x][y]=2;
            button15.setBackgroundColor(Color.parseColor("#00B000"));
            button15.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==2 && y==1) {
            board[x][y]=2;
            button18.setBackgroundColor(Color.parseColor("#00B000"));
            button18.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==2 && y==3) {
            board[x][y]=2;
            button20.setBackgroundColor(Color.parseColor("#00B000"));
            button20.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==2 && y==5) {
            board[x][y]=2;
            button22.setBackgroundColor(Color.parseColor("#00B000"));
            button22.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==2 && y==7) {
            board[x][y]=2;
            button24.setBackgroundColor(Color.parseColor("#00B000"));
            button24.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==3 && y==0) {
            board[x][y]=2;
            button25.setBackgroundColor(Color.parseColor("#00B000"));
            button25.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==3 && y==2) {
            board[x][y]=2;
            button27.setBackgroundColor(Color.parseColor("#00B000"));
            button27.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==3 && y==4) {
            board[x][y]=2;
            button29.setBackgroundColor(Color.parseColor("#00B000"));
            button29.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==3 && y==6) {
            board[x][y]=2;
            button31.setBackgroundColor(Color.parseColor("#00B000"));
            button31.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==4 && y==1) {
            board[x][y]=2;
            button34.setBackgroundColor(Color.parseColor("#00B000"));
            button34.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==4 && y==3) {
            board[x][y]=2;
            button36.setBackgroundColor(Color.parseColor("#00B000"));
            button36.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==4 && y==5) {
            board[x][y]=2;
            button38.setBackgroundColor(Color.parseColor("#00B000"));
            button38.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==4 && y==7) {
            board[x][y]=2;
            button40.setBackgroundColor(Color.parseColor("#00B000"));
            button40.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==5 && y==0) {
            board[x][y]=2;
            button41.setBackgroundColor(Color.parseColor("#00B000"));
            button41.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==5 && y==2) {
            board[x][y]=2;
            button43.setBackgroundColor(Color.parseColor("#00B000"));
            button43.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==5 && y==4) {
            board[x][y]=2;
            button45.setBackgroundColor(Color.parseColor("#00B000"));
            button45.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==5 && y==6) {
            board[x][y]=2;
            button47.setBackgroundColor(Color.parseColor("#00B000"));
            button47.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==6 && y==1) {
            board[x][y]=2;
            button50.setBackgroundColor(Color.parseColor("#00B000"));
            button50.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==6 && y==3) {
            board[x][y]=2;
            button52.setBackgroundColor(Color.parseColor("#00B000"));
            button52.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==6 && y==5) {
            board[x][y]=2;
            button54.setBackgroundColor(Color.parseColor("#00B000"));
            button54.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==6 && y==7) {
            board[x][y]=2;
            button56.setBackgroundColor(Color.parseColor("#00B000"));
            button56.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==7 && y==0) {
            board[x][y]=2;
            button57.setBackgroundColor(Color.parseColor("#00B000"));
            button57.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==7 && y==2) {
            board[x][y]=2;
            button59.setBackgroundColor(Color.parseColor("#00B000"));
            button59.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==7 && y==4) {
            board[x][y]=2;
            button61.setBackgroundColor(Color.parseColor("#00B000"));
            button61.setImageResource(R.drawable.ic_black_circle_foreground);
        }
        if (x==7 && y==6) {
            board[x][y]=2;
            button63.setBackgroundColor(Color.parseColor("#00B000"));
            button63.setImageResource(R.drawable.ic_black_circle_foreground);
        }
    }

    public void changeToWhite(int x, int y) {
        if (x==0 && y==1) {
            board[x][y]=1;
            button2.setBackgroundColor(Color.parseColor("#00B000"));
            button2.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==0 && y==3) {
            board[x][y]=1;
            button4.setBackgroundColor(Color.parseColor("#00B000"));
            button4.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==0 && y==5) {
            board[x][y]=1;
            button6.setBackgroundColor(Color.parseColor("#00B000"));
            button6.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==0 && y==7) {
            board[x][y]=1;
            button8.setBackgroundColor(Color.parseColor("#00B000"));
            button8.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==1 && y==0) {
            board[x][y]=1;
            button9.setBackgroundColor(Color.parseColor("#00B000"));
            button9.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==1 && y==2) {
            board[x][y]=1;
            button11.setBackgroundColor(Color.parseColor("#00B000"));
            button11.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==1 && y==4) {
            board[x][y]=1;
            button13.setBackgroundColor(Color.parseColor("#00B000"));
            button13.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==1 && y==6) {
            board[x][y]=1;
            button15.setBackgroundColor(Color.parseColor("#00B000"));
            button15.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==2 && y==1) {
            board[x][y]=1;
            button18.setBackgroundColor(Color.parseColor("#00B000"));
            button18.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==2 && y==3) {
            board[x][y]=1;
            button20.setBackgroundColor(Color.parseColor("#00B000"));
            button20.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==2 && y==5) {
            board[x][y]=1;
            button22.setBackgroundColor(Color.parseColor("#00B000"));
            button22.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==2 && y==7) {
            board[x][y]=1;
            button24.setBackgroundColor(Color.parseColor("#00B000"));
            button24.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==3 && y==0) {
            board[x][y]=1;
            button25.setBackgroundColor(Color.parseColor("#00B000"));
            button25.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==3 && y==2) {
            board[x][y]=1;
            button27.setBackgroundColor(Color.parseColor("#00B000"));
            button27.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==3 && y==4) {
            board[x][y]=1;
            button29.setBackgroundColor(Color.parseColor("#00B000"));
            button29.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==3 && y==6) {
            board[x][y]=1;
            button31.setBackgroundColor(Color.parseColor("#00B000"));
            button31.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==4 && y==1) {
            board[x][y]=1;
            button34.setBackgroundColor(Color.parseColor("#00B000"));
            button34.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==4 && y==3) {
            board[x][y]=1;
            button36.setBackgroundColor(Color.parseColor("#00B000"));
            button36.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==4 && y==5) {
            board[x][y]=1;
            button38.setBackgroundColor(Color.parseColor("#00B000"));
            button38.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==4 && y==7) {
            board[x][y]=1;
            button40.setBackgroundColor(Color.parseColor("#00B000"));
            button40.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==5 && y==0) {
            board[x][y]=1;
            button41.setBackgroundColor(Color.parseColor("#00B000"));
            button41.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==5 && y==2) {
            board[x][y]=1;
            button43.setBackgroundColor(Color.parseColor("#00B000"));
            button43.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==5 && y==4) {
            board[x][y]=1;
            button45.setBackgroundColor(Color.parseColor("#00B000"));
            button45.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==5 && y==6) {
            board[x][y]=1;
            button47.setBackgroundColor(Color.parseColor("#00B000"));
            button47.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==6 && y==1) {
            board[x][y]=1;
            button50.setBackgroundColor(Color.parseColor("#00B000"));
            button50.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==6 && y==3) {
            board[x][y]=1;
            button52.setBackgroundColor(Color.parseColor("#00B000"));
            button52.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==6 && y==5) {
            board[x][y]=1;
            button54.setBackgroundColor(Color.parseColor("#00B000"));
            button54.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==6 && y==7) {
            board[x][y]=1;
            button56.setBackgroundColor(Color.parseColor("#00B000"));
            button56.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==7 && y==0) {
            board[x][y]=1;
            button57.setBackgroundColor(Color.parseColor("#00B000"));
            button57.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==7 && y==2) {
            board[x][y]=1;
            button59.setBackgroundColor(Color.parseColor("#00B000"));
            button59.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==7 && y==4) {
            board[x][y]=1;
            button61.setBackgroundColor(Color.parseColor("#00B000"));
            button61.setImageResource(R.drawable.ic_white_circle_foreground);
        }
        if (x==7 && y==6) {
            board[x][y]=1;
            button63.setBackgroundColor(Color.parseColor("#00B000"));
            button63.setImageResource(R.drawable.ic_white_circle_foreground);
        }
    }

    public void changeToDWhite(int x, int y) {
        if (x==0 && y==1) {
            board[x][y]=3;
            button2.setBackgroundColor(Color.parseColor("#00B000"));
            button2.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==0 && y==3) {
            board[x][y]=3;
            button4.setBackgroundColor(Color.parseColor("#00B000"));
            button4.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==0 && y==5) {
            board[x][y]=3;
            button6.setBackgroundColor(Color.parseColor("#00B000"));
            button6.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==0 && y==7) {
            board[x][y]=3;
            button8.setBackgroundColor(Color.parseColor("#00B000"));
            button8.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==1 && y==0) {
            board[x][y]=3;
            button9.setBackgroundColor(Color.parseColor("#00B000"));
            button9.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==1 && y==2) {
            board[x][y]=3;
            button11.setBackgroundColor(Color.parseColor("#00B000"));
            button11.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==1 && y==4) {
            board[x][y]=3;
            button13.setBackgroundColor(Color.parseColor("#00B000"));
            button13.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==1 && y==6) {
            board[x][y]=3;
            button15.setBackgroundColor(Color.parseColor("#00B000"));
            button15.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==2 && y==1) {
            board[x][y]=3;
            button18.setBackgroundColor(Color.parseColor("#00B000"));
            button18.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==2 && y==3) {
            board[x][y]=3;
            button20.setBackgroundColor(Color.parseColor("#00B000"));
            button20.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==2 && y==5) {
            board[x][y]=3;
            button22.setBackgroundColor(Color.parseColor("#00B000"));
            button22.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==2 && y==7) {
            board[x][y]=3;
            button24.setBackgroundColor(Color.parseColor("#00B000"));
            button24.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==3 && y==0) {
            board[x][y]=3;
            button25.setBackgroundColor(Color.parseColor("#00B000"));
            button25.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==3 && y==2) {
            board[x][y]=3;
            button27.setBackgroundColor(Color.parseColor("#00B000"));
            button27.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==3 && y==4) {
            board[x][y]=3;
            button29.setBackgroundColor(Color.parseColor("#00B000"));
            button29.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==3 && y==6) {
            board[x][y]=3;
            button31.setBackgroundColor(Color.parseColor("#00B000"));
            button31.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==4 && y==1) {
            board[x][y]=3;
            button34.setBackgroundColor(Color.parseColor("#00B000"));
            button34.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==4 && y==3) {
            board[x][y]=3;
            button36.setBackgroundColor(Color.parseColor("#00B000"));
            button36.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==4 && y==5) {
            board[x][y]=3;
            button38.setBackgroundColor(Color.parseColor("#00B000"));
            button38.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==4 && y==7) {
            board[x][y]=3;
            button40.setBackgroundColor(Color.parseColor("#00B000"));
            button40.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==5 && y==0) {
            board[x][y]=3;
            button41.setBackgroundColor(Color.parseColor("#00B000"));
            button41.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==5 && y==2) {
            board[x][y]=3;
            button43.setBackgroundColor(Color.parseColor("#00B000"));
            button43.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==5 && y==4) {
            board[x][y]=3;
            button45.setBackgroundColor(Color.parseColor("#00B000"));
            button45.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==5 && y==6) {
            board[x][y]=3;
            button47.setBackgroundColor(Color.parseColor("#00B000"));
            button47.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==6 && y==1) {
            board[x][y]=3;
            button50.setBackgroundColor(Color.parseColor("#00B000"));
            button50.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==6 && y==3) {
            board[x][y]=3;
            button52.setBackgroundColor(Color.parseColor("#00B000"));
            button52.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==6 && y==5) {
            board[x][y]=3;
            button54.setBackgroundColor(Color.parseColor("#00B000"));
            button54.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==6 && y==7) {
            board[x][y]=3;
            button56.setBackgroundColor(Color.parseColor("#00B000"));
            button56.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==7 && y==0) {
            board[x][y]=3;
            button57.setBackgroundColor(Color.parseColor("#00B000"));
            button57.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==7 && y==2) {
            board[x][y]=3;
            button59.setBackgroundColor(Color.parseColor("#00B000"));
            button59.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==7 && y==4) {
            board[x][y]=3;
            button61.setBackgroundColor(Color.parseColor("#00B000"));
            button61.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
        if (x==7 && y==6) {
            board[x][y]=3;
            button63.setBackgroundColor(Color.parseColor("#00B000"));
            button63.setImageResource(R.drawable.ic_white_with_d_circle_foreground);
        }
    }

    public void changeToDBlack(int x, int y) {
        if (x==0 && y==1) {
            board[x][y]=4;
            button2.setBackgroundColor(Color.parseColor("#00B000"));
            button2.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==0 && y==3) {
            board[x][y]=4;
            button4.setBackgroundColor(Color.parseColor("#00B000"));
            button4.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==0 && y==5) {
            board[x][y]=4;
            button6.setBackgroundColor(Color.parseColor("#00B000"));
            button6.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==0 && y==7) {
            board[x][y]=4;
            button8.setBackgroundColor(Color.parseColor("#00B000"));
            button8.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==1 && y==0) {
            board[x][y]=4;
            button9.setBackgroundColor(Color.parseColor("#00B000"));
            button9.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==1 && y==2) {
            board[x][y]=4;
            button11.setBackgroundColor(Color.parseColor("#00B000"));
            button11.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==1 && y==4) {
            board[x][y]=4;
            button13.setBackgroundColor(Color.parseColor("#00B000"));
            button13.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==1 && y==6) {
            board[x][y]=4;
            button15.setBackgroundColor(Color.parseColor("#00B000"));
            button15.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==2 && y==1) {
            board[x][y]=4;
            button18.setBackgroundColor(Color.parseColor("#00B000"));
            button18.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==2 && y==3) {
            board[x][y]=4;
            button20.setBackgroundColor(Color.parseColor("#00B000"));
            button20.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==2 && y==5) {
            board[x][y]=4;
            button22.setBackgroundColor(Color.parseColor("#00B000"));
            button22.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==2 && y==7) {
            board[x][y]=4;
            button24.setBackgroundColor(Color.parseColor("#00B000"));
            button24.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==3 && y==0) {
            board[x][y]=4;
            button25.setBackgroundColor(Color.parseColor("#00B000"));
            button25.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==3 && y==2) {
            board[x][y]=4;
            button27.setBackgroundColor(Color.parseColor("#00B000"));
            button27.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==3 && y==4) {
            board[x][y]=4;
            button29.setBackgroundColor(Color.parseColor("#00B000"));
            button29.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==3 && y==6) {
            board[x][y]=4;
            button31.setBackgroundColor(Color.parseColor("#00B000"));
            button31.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==4 && y==1) {
            board[x][y]=4;
            button34.setBackgroundColor(Color.parseColor("#00B000"));
            button34.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==4 && y==3) {
            board[x][y]=4;
            button36.setBackgroundColor(Color.parseColor("#00B000"));
            button36.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==4 && y==5) {
            board[x][y]=4;
            button38.setBackgroundColor(Color.parseColor("#00B000"));
            button38.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==4 && y==7) {
            board[x][y]=4;
            button40.setBackgroundColor(Color.parseColor("#00B000"));
            button40.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==5 && y==0) {
            board[x][y]=4;
            button41.setBackgroundColor(Color.parseColor("#00B000"));
            button41.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==5 && y==2) {
            board[x][y]=4;
            button43.setBackgroundColor(Color.parseColor("#00B000"));
            button43.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==5 && y==4) {
            board[x][y]=4;
            button45.setBackgroundColor(Color.parseColor("#00B000"));
            button45.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==5 && y==6) {
            board[x][y]=4;
            button47.setBackgroundColor(Color.parseColor("#00B000"));
            button47.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==6 && y==1) {
            board[x][y]=4;
            button50.setBackgroundColor(Color.parseColor("#00B000"));
            button50.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==6 && y==3) {
            board[x][y]=4;
            button52.setBackgroundColor(Color.parseColor("#00B000"));
            button52.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==6 && y==5) {
            board[x][y]=4;
            button54.setBackgroundColor(Color.parseColor("#00B000"));
            button54.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==6 && y==7) {
            board[x][y]=4;
            button56.setBackgroundColor(Color.parseColor("#00B000"));
            button56.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==7 && y==0) {
            board[x][y]=4;
            button57.setBackgroundColor(Color.parseColor("#00B000"));
            button57.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==7 && y==2) {
            board[x][y]=4;
            button59.setBackgroundColor(Color.parseColor("#00B000"));
            button59.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==7 && y==4) {
            board[x][y]=4;
            button61.setBackgroundColor(Color.parseColor("#00B000"));
            button61.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
        if (x==7 && y==6) {
            board[x][y]=4;
            button63.setBackgroundColor(Color.parseColor("#00B000"));
            button63.setImageResource(R.drawable.ic_black_with_d_circle_foreground);
        }
    }

    public void possibleMoves(int x1, int y1) {

        if (running==1) {
            boolean bicie=false;

            for (int x=0; x<8 ; x++) {
                for (int y = 0; y < 8; y++) {
                    if (board[x][y]==1) {
                        if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                            if (board[x - 1][y - 1] == 2 && board[x - 2][y - 2] == 0) {
                                bicie = true;
                                break;
                            }
                        }
                        if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                            if (board[x - 1][y + 1] == 2 && board[x - 2][y + 2] == 0) {
                                bicie = true;
                                break;
                            }
                        }
                        if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                            if (board[x - 1][y - 1] == 4 && board[x - 2][y - 2] == 0) {
                                bicie = true;
                                break;
                            }
                        }
                        if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                            if (board[x - 1][y + 1] == 4 && board[x - 2][y + 2] == 0) {
                                bicie = true;
                                break;
                            }
                        }
                    }
                    if (board[x][y]==3) {
                        if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                            if (board[x - 1][y - 1] == 2 && board[x - 2][y - 2] == 0) {
                                bicie = true;
                                break;
                            }
                            if (board[x - 1][y - 1] == 4 && board[x - 2][y - 2] == 0) {
                                bicie=true;
                                break;
                            }
                        }
                        if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                            if (board[x - 1][y + 1] == 2 && board[x - 2][y + 2] == 0) {
                                bicie = true;
                                break;
                            }
                            if (board[x - 1][y + 1] == 4 && board[x - 2][y + 2] == 0) {
                                bicie=true;
                                break;
                            }
                        }
                        if (x + 2 <= 7 && x + 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                            if (board[x + 1][y - 1] == 2 && board[x + 2][y - 2] == 0) {
                                bicie = true;
                                break;
                            }
                            if (board[x + 1][y - 1] == 4 && board[x + 2][y - 2] == 0) {
                                bicie=true;
                                break;
                            }
                        }
                        if (x + 2 <= 7 && x + 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                            if (board[x + 1][y + 1] == 2 && board[x + 2][y + 2] == 0) {
                                bicie=true;
                                break;
                            }
                            if (board[x + 1][y + 1] == 4 && board[x + 2][y + 2] == 0) {
                                bicie=true;
                                break;
                            }
                        }
                    }
                }
            }

            if (bicie==true) {
                ArrayList <Pair> list = new <Pair> ArrayList();
                moves.add(new Pair(iks,ygrek));
                limit=0;
                bicie(iks,ygrek);
                for (int i=0; i<moves.size(); i++) {
                    list.add(moves.get(i));
                }
                moves.clear();

                Pair pair = new Pair(x1,y1);
                if (list.contains(pair)) {
                    if (board[iks][ygrek]==1) {
                        changeToWhite(x1,y1);
                    }
                    if (board[iks][ygrek]==3) {
                        changeToDWhite(x1,y1);
                    }
                    if (x1==0) {
                        changeToDWhite(x1,y1);
                    }
                    for (int i=0; i<list.indexOf(pair) ;i++) {
                        Pair pair2 = list.get(i);
                        changeToGreen(Integer.parseInt(pair2.first.toString()),Integer.parseInt(pair2.second.toString()));
                    }
                    winner();
                    opponent();
                    winner();
                    iks = 100;
                    ygrek = 100;

                    return;
                }
                else {
                    Toast.makeText(this, "Masz bicie do wykonania", Toast.LENGTH_LONG).show();
                    return;
                }
            }
            else {
                if (board[iks][ygrek] == 1) {
                    if (x1 >= 0 && x1 <= 7 && 0 <= y1 && y1 <= 7) {
                        if (iks == x1 + 1 && (ygrek + 1 == y1 || ygrek - 1 == y1)) {
                            if (x1 == 0) {
                                changeToGreen(iks, ygrek);
                                changeToDWhite(x1, y1);
                                winner();
                                opponent();
                                winner();
                                iks = 100;
                                ygrek = 100;
                                return;
                            } else {
                                changeToGreen(iks, ygrek);
                                changeToWhite(x1, y1);
                                winner();
                                opponent();
                                winner();
                                iks = 100;
                                ygrek = 100;
                                return;
                            }
                        }
                    }
                }
                if (board[iks][ygrek] == 3) {
                    if (0 <= x1 && x1 <= 7 && 0 <= y1 && y1 <= 7) {
                        if ((iks == x1 + 1 || iks == x1 - 1) && (ygrek + 1 == y1 || ygrek - 1 == y1)) {
                            changeToGreen(iks, ygrek);
                            changeToDWhite(x1, y1);
                            winner();
                            opponent();
                            winner();
                            iks = 100;
                            ygrek = 100;
                            return;
                        }
                    }
                }
            }
        }
    }

    public void reset() {

        button2.setImageResource(R.drawable.ic_black_circle_foreground);
        button2.setBackgroundColor(Color.parseColor("#00B000"));
        board[0][0]=8;
        board[0][1]=2;
        board[0][2]=8;
        button4.setImageResource(R.drawable.ic_black_circle_foreground);
        button4.setBackgroundColor(Color.parseColor("#00B000"));
        board[0][3]=2;
        board[0][4]=8;
        button6.setImageResource(R.drawable.ic_black_circle_foreground);
        button6.setBackgroundColor(Color.parseColor("#00B000"));
        board[0][5]=2;
        board[0][6]=8;
        button8.setImageResource(R.drawable.ic_black_circle_foreground);
        button8.setBackgroundColor(Color.parseColor("#00B000"));
        board[0][7]=2;
        button9.setImageResource(R.drawable.ic_black_circle_foreground);
        button9.setBackgroundColor(Color.parseColor("#00B000"));
        board[1][0]=2;
        board[1][1]=8;
        button11.setImageResource(R.drawable.ic_black_circle_foreground);
        button11.setBackgroundColor(Color.parseColor("#00B000"));
        board[1][2]=2;
        board[1][3]=8;
        button13.setImageResource(R.drawable.ic_black_circle_foreground);
        button13.setBackgroundColor(Color.parseColor("#00B000"));
        board[1][4]=2;
        board[1][5]=8;
        button15.setImageResource(R.drawable.ic_black_circle_foreground);
        button15.setBackgroundColor(Color.parseColor("#00B000"));
        board[1][6]=2;
        board[1][7]=8;
        button18.setImageResource(R.drawable.ic_black_circle_foreground);
        button18.setBackgroundColor(Color.parseColor("#00B000"));
        board[2][0]=8;
        board[2][1]=2;
        board[2][2]=8;
        button20.setImageResource(R.drawable.ic_black_circle_foreground);
        button20.setBackgroundColor(Color.parseColor("#00B000"));
        board[2][3]=2;
        board[2][4]=8;
        button22.setImageResource(R.drawable.ic_black_circle_foreground);
        button22.setBackgroundColor(Color.parseColor("#00B000"));
        board[2][5]=2;
        board[2][6]=8;
        button24.setImageResource(R.drawable.ic_black_circle_foreground);
        button24.setBackgroundColor(Color.parseColor("#00B000"));
        board[2][7]=2;

        board[3][0]=0;
        button25.setImageResource(R.drawable.ic_green_circle_foreground);
        button25.setBackgroundColor(Color.parseColor("#00B000"));
        board[3][1]=8;
        board[3][2]=0;
        button27.setImageResource(R.drawable.ic_green_circle_foreground);
        button27.setBackgroundColor(Color.parseColor("#00B000"));
        board[3][3]=8;
        board[3][4]=0;
        button29.setImageResource(R.drawable.ic_green_circle_foreground);
        button29.setBackgroundColor(Color.parseColor("#00B000"));
        board[3][5]=8;
        board[3][6]=0;
        button31.setImageResource(R.drawable.ic_green_circle_foreground);
        button31.setBackgroundColor(Color.parseColor("#00B000"));
        board[3][7]=8;
        board[4][0]=8;
        board[4][1]=0;
        button34.setImageResource(R.drawable.ic_green_circle_foreground);
        button34.setBackgroundColor(Color.parseColor("#00B000"));
        board[4][2]=8;
        board[4][3]=0;
        button36.setImageResource(R.drawable.ic_green_circle_foreground);
        button36.setBackgroundColor(Color.parseColor("#00B000"));
        board[4][4]=8;
        board[4][5]=0;
        button38.setImageResource(R.drawable.ic_green_circle_foreground);
        button38.setBackgroundColor(Color.parseColor("#00B000"));
        board[4][6]=8;
        board[4][7]=0;
        button40.setImageResource(R.drawable.ic_green_circle_foreground);
        button40.setBackgroundColor(Color.parseColor("#00B000"));

        button41.setImageResource(R.drawable.ic_white_circle_foreground);
        button41.setBackgroundColor(Color.parseColor("#00B000"));
        board[5][0]=1;
        board[5][1]=8;
        button43.setImageResource(R.drawable.ic_white_circle_foreground);
        button43.setBackgroundColor(Color.parseColor("#00B000"));
        board[5][2]=1;
        board[5][3]=8;
        button45.setImageResource(R.drawable.ic_white_circle_foreground);
        button45.setBackgroundColor(Color.parseColor("#00B000"));
        board[5][4]=1;
        board[5][5]=8;
        button47.setImageResource(R.drawable.ic_white_circle_foreground);
        button47.setBackgroundColor(Color.parseColor("#00B000"));
        board[5][6]=1;
        board[5][7]=8;
        button50.setImageResource(R.drawable.ic_white_circle_foreground);
        button50.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][0]=8;
        board[6][1]=1;
        board[6][2]=8;
        button52.setImageResource(R.drawable.ic_white_circle_foreground);
        button52.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][3]=1;
        board[6][4]=8;
        button54.setImageResource(R.drawable.ic_white_circle_foreground);
        button54.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][5]=1;
        board[6][6]=8;
        button56.setImageResource(R.drawable.ic_white_circle_foreground);
        button56.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][7]=1;
        button57.setImageResource(R.drawable.ic_white_circle_foreground);
        button57.setBackgroundColor(Color.parseColor("#00B000"));
        board[7][0]=1;
        board[7][1]=8;
        button59.setImageResource(R.drawable.ic_white_circle_foreground);
        button59.setBackgroundColor(Color.parseColor("#00B000"));
        board[7][2]=1;
        board[7][3]=8;
        button61.setImageResource(R.drawable.ic_white_circle_foreground);
        button61.setBackgroundColor(Color.parseColor("#00B000"));
        board[7][4]=1;
        board[7][5]=8;
        button63.setImageResource(R.drawable.ic_white_circle_foreground);
        button63.setBackgroundColor(Color.parseColor("#00B000"));
        board[7][6]=1;
        board[7][7]=8;

        textView0.setVisibility(View.GONE);
        running=1;
        count();
    }

    public void count() {
        Integer white = 0;
        Integer black = 0;
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                if(board[i][j]==1) {
                    white++;
                }
                if(board[i][j]==2) {
                    black++;
                }
                if(board[i][j]==3) {
                    white++;
                }
                if(board[i][j]==4) {
                    black++;
                }
            }
        }
        textView1.setText(black.toString());
        textView2.setText(white.toString());
    }

    ArrayList<Pair> moves = new <Pair> ArrayList();

    public void opponent() {
        if (running==1) {
            ArrayList<Pair> whiteList = new <Pair>ArrayList();
            ArrayList<Pair> whiteDList = new <Pair>ArrayList();
            ArrayList<Pair> blackList = new <Pair>ArrayList();
            ArrayList<Pair> blackDList = new <Pair>ArrayList();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 1) {
                        whiteList.add(new Pair(i, j));
                    }
                    if (board[i][j] == 2) {
                        blackList.add(new Pair(i, j));
                    }
                    if (board[i][j] == 3) {
                        whiteDList.add(new Pair(i, j));
                    }
                    if (board[i][j] == 4) {
                        blackDList.add(new Pair(i, j));
                    }
                }
            }

        /*
        ArrayList bestWhiteArray = new ArrayList();
        ArrayList worstWhiteArray = new ArrayList();
        for (int i=0; i<whiteList.size(); i++) {
            moves.add(new Pair(Integer.parseInt(whiteList.get(i).first.toString()),Integer.parseInt(whiteList.get(i).second.toString())));
            bicie(Integer.parseInt(whiteList.get(i).first.toString()),Integer.parseInt(whiteList.get(i).second.toString()));
            if (moves.size()> bestWhiteArray.size()) {
                bestWhiteArray = moves;
            }
            if (moves.size()< worstWhiteArray.size()) {
                worstWhiteArray = moves;
            }
            moves.clear();
        }

        ArrayList bestDWhiteArray = new ArrayList();
        ArrayList worstDWhiteArray = new ArrayList();
        for (int i=0; i<whiteDList.size(); i++) {
            moves.add(new Pair(Integer.parseInt(whiteDList.get(i).first.toString()),Integer.parseInt(whiteDList.get(i).second.toString())));
            bicie(Integer.parseInt(whiteDList.get(i).first.toString()),Integer.parseInt(whiteDList.get(i).second.toString()));
            if (moves.size()> bestDWhiteArray.size()) {
                bestDWhiteArray = moves;
            }
            if (moves.size()< worstDWhiteArray.size()) {
                worstDWhiteArray = moves;
            }
            moves.clear();
        }
        */
            ArrayList<Pair> bestBlackArray = new ArrayList();
            ArrayList<Pair> worstBlackArray = new ArrayList();
            for (int i = 0; i < blackList.size(); i++) {
                moves.add(new Pair(Integer.parseInt(blackList.get(i).first.toString()), Integer.parseInt(blackList.get(i).second.toString())));
                limit=0;
                bicie(Integer.parseInt(blackList.get(i).first.toString()), Integer.parseInt(blackList.get(i).second.toString()));
                if (moves.size() > bestBlackArray.size()) {
                    bestBlackArray.clear();
                    for (Pair p : moves) {
                        bestBlackArray.add(p);
                    }
                }
                if (moves.size() < worstBlackArray.size()) {
                    worstBlackArray.clear();
                    for (Pair p : moves) {
                        worstBlackArray.add(p);
                    }
                }
                moves.clear();
            }
            for (int j = 0; j < blackDList.size(); j++) {
                moves.add(new Pair(Integer.parseInt(blackDList.get(j).first.toString()), Integer.parseInt(blackDList.get(j).second.toString())));
                limit=0;
                bicie(Integer.parseInt(blackDList.get(j).first.toString()), Integer.parseInt(blackDList.get(j).second.toString()));
                if (moves.size() > bestBlackArray.size()) {
                    bestBlackArray.clear();
                    for (Pair p : moves) {
                        bestBlackArray.add(p);
                    }
                }
                if (moves.size() < worstBlackArray.size()) {
                    worstBlackArray.clear();
                    for (Pair p : moves) {
                        worstBlackArray.add(p);
                    }
                }
                moves.clear();
            }

        /*

        Pair pair = new Pair(x1,y1);
            if (list.contains(pair)) {
                if (board[iks][ygrek]==1) {
                    changeToWhite(x1,y1);
                }
                if (board[iks][ygrek]==3) {
                    changeToDWhite(x1,y1);
                }
                if (x1==0) {
                    changeToDWhite(x1,y1);
                }
                for (int i=0; i<list.indexOf(pair) ;i++) {
                    Pair pair2 = list.get(i);
                    changeToGreen(Integer.parseInt(pair2.first.toString()),Integer.parseInt(pair2.second.toString()));
                }
                iks = 100;
                ygrek = 100;
                opponent();

                return;
         */

            if (bestBlackArray.size() > 1) {
                Pair pair2 = bestBlackArray.get(bestBlackArray.size() - 1);
                if (board[Integer.parseInt(bestBlackArray.get(0).first.toString())][Integer.parseInt(bestBlackArray.get(0).second.toString())] == 2) {
                    changeToBlack(Integer.parseInt(pair2.first.toString()), Integer.parseInt(pair2.second.toString()));
                }
                if (board[Integer.parseInt(bestBlackArray.get(0).first.toString())][Integer.parseInt(bestBlackArray.get(0).second.toString())] == 4 || Integer.parseInt(pair2.first.toString()) == 7) {
                    changeToDBlack(Integer.parseInt(pair2.first.toString()), Integer.parseInt(pair2.second.toString()));
                }
                for (int i = 0; i < bestBlackArray.size() - 1; i++) {
                    Pair pair1 = bestBlackArray.get(i);
                    changeToGreen(Integer.parseInt(pair1.first.toString()), Integer.parseInt(pair1.second.toString()));
                }
                return;
            } else {
                ArrayList<Pair> myMoves = new ArrayList<>();
                ArrayList<Pair> myDMoves = new ArrayList<>();
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if (board[x][y] == 2) {
                            if (0 <= x + 1 && x + 1 < +7 && 0 <= y - 1 && y - 1 <= 7) {
                                if (board[x + 1][y - 1] == 0) {
                                    myMoves.add(new Pair(x + 1, y - 1));
                                }
                            }
                            if (0 <= x + 1 && x + 1 < +7 && 0 <= y + 1 && y + 1 <= 7) {
                                if (board[x + 1][y + 1] == 0) {
                                    myMoves.add(new Pair(x + 1, y + 1));
                                }
                            }
                        }
                        if (board[x][y] == 4) {
                            if (0 <= x - 1 && x - 1 < +7 && 0 <= y - 1 && y - 1 <= 7) {
                                if (board[x - 1][y - 1] == 0) {
                                    myDMoves.add(new Pair(x - 1, y - 1));
                                }
                            }
                            if (0 <= x - 1 && x - 1 < +7 && 0 <= y + 1 && y + 1 <= 7) {
                                if (board[x - 1][y + 1] == 0) {
                                    myDMoves.add(new Pair(x - 1, y + 1));
                                }
                            }
                            if (0 <= x + 1 && x + 1 < +7 && 0 <= y - 1 && y - 1 <= 7) {
                                if (board[x + 1][y - 1] == 0) {
                                    myDMoves.add(new Pair(x + 1, y - 1));
                                }
                            }
                            if (0 <= x + 1 && x + 1 < +7 && 0 <= y + 1 && y + 1 <= 7) {
                                if (board[x + 1][y + 1] == 0) {
                                    myDMoves.add(new Pair(x + 1, y + 1));
                                }
                            }
                        }
                    }
                }
                if (myMoves.size() >= myDMoves.size()) {
                    Pair myMove = myMoves.get(new Random().nextInt(myMoves.size()));
                    int xxx = Integer.parseInt(myMove.first.toString());
                    int yyy = Integer.parseInt(myMove.second.toString());
                    boolean pom = false;
                    if (0 <= xxx - 1 && xxx - 1 < +7 && 0 <= yyy - 1 && yyy - 1 <= 7 && pom == false) {
                        if (board[xxx - 1][yyy - 1] == 2) {
                            changeToGreen(xxx - 1, yyy - 1);
                            pom = true;
                        }
                    }
                    if (0 <= xxx - 1 && xxx - 1 < +7 && 0 <= yyy + 1 && yyy + 1 <= 7 & pom == false) {
                        if (board[xxx - 1][yyy + 1] == 2) {
                            changeToGreen(xxx - 1, yyy + 1);
                            pom = true;
                        }
                    }
                    if (pom == true) {
                        changeToBlack(xxx, yyy);
                    } else opponent();
                } else {
                    Pair myDMove = myDMoves.get(new Random().nextInt(myDMoves.size()));
                    int xD = Integer.parseInt(myDMove.first.toString());
                    int yD = Integer.parseInt(myDMove.second.toString());
                    boolean pom2 = false;
                    if (0 <= xD - 1 && xD - 1 < +7 && 0 <= yD - 1 && yD - 1 <= 7 && pom2 == false) {
                        if (board[xD - 1][yD - 1] == 4) {
                            changeToGreen(xD - 1, yD - 1);
                            pom2 = true;
                        }
                    }
                    if (0 <= xD - 1 && xD - 1 < +7 && 0 <= yD + 1 && yD + 1 <= 7 & pom2 == false) {
                        if (board[xD - 1][yD + 1] == 4) {
                            changeToGreen(xD - 1, yD + 1);
                            pom2 = true;
                        }
                    }
                    if (0 <= xD + 1 && xD + 1 < +7 && 0 <= yD - 1 && yD - 1 <= 7 & pom2 == false) {
                        if (board[xD + 1][yD - 1] == 4) {
                            changeToGreen(xD + 1, yD - 1);
                            pom2 = true;
                        }
                    }
                    if (0 <= xD + 1 && xD + 1 < +7 && 0 <= yD + 1 && yD + 1 <= 7 & pom2 == false) {
                        if (board[xD + 1][yD + 1] == 4) {
                            changeToGreen(xD + 1, yD + 1);
                            pom2 = true;
                        }
                    }
                    if (pom2 == true) {
                        changeToDBlack(xD, yD);
                    } else opponent();
                }
            }
        }
    }

    public void bicie(Integer x, Integer y) {
        if (limit<=4) {
            if (board[x][y] == 1 || board[iks][ygrek] == 1) {
                if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x - 1][y - 1] == 2 || board[x - 1][y - 1] == 4) && board[x - 2][y - 2] == 0) {
                        moves.add(new Pair(x - 1, y - 1));
                        moves.add(new Pair(x - 2, y - 2));
                        limit=limit+1;
                        bicie(x - 2, y - 2);
                    }
                }
                if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x - 1][y + 1] == 2 || board[x - 1][y + 1] == 4) && board[x - 2][y + 2] == 0) {
                        moves.add(new Pair(x - 1, y + 1));
                        moves.add(new Pair(x - 2, y + 2));
                        limit=limit+1;
                        bicie(x - 2, y + 2);
                    }
                }
            }
            if (board[x][y] == 2) {
                if (x + 2 <= 7 && x + 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x + 1][y - 1] == 1 || board[x + 1][y - 1] == 3) && board[x + 2][y - 2] == 0) {
                        moves.add(new Pair(x + 1, y - 1));
                        moves.add(new Pair(x + 2, y - 2));
                        if (x + 2 == 7) {
                            changeToDBlack(x + 2, y - 2);
                        } else {
                            changeToBlack(x + 2, y - 2);
                        }
                        limit=limit+1;
                        bicie(x + 2, y - 2);
                    }
                }
                if (x + 2 <= 7 && x + 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x + 1][y + 1] == 1 || board[x + 1][y + 1] == 3) && board[x + 2][y + 2] == 0) {
                        moves.add(new Pair(x + 1, y + 1));
                        moves.add(new Pair(x + 2, y + 2));
                        if (x + 2 == 7) {
                            changeToDBlack(x + 2, y + 2);
                        } else {
                            changeToBlack(x + 2, y + 2);
                        }
                        limit=limit+1;
                        bicie(x + 2, y + 2);
                    }
                }
            }
            if (board[x][y] == 3 || board[iks][ygrek] == 3) {
                if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x - 1][y - 1] == 2 || board[x - 1][y - 1] == 4) && board[x - 2][y - 2] == 0) {
                        moves.add(new Pair(x - 1, y - 1));
                        moves.add(new Pair(x - 2, y - 2));
                        limit=limit+1;
                        bicie(x - 2, y - 2);
                    }
                }
                if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x - 1][y + 1] == 2 || board[x - 1][y + 1] == 4) && board[x - 2][y + 2] == 0) {
                        moves.add(new Pair(x - 1, y + 1));
                        moves.add(new Pair(x - 2, y + 2));
                        limit=limit+1;
                        bicie(x - 2, y + 2);
                    }
                }
                if (x + 2 <= 7 && x + 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x + 1][y - 1] == 2 || board[x + 1][y - 1] == 4) && board[x + 2][y - 2] == 0) {
                        moves.add(new Pair(x + 1, y - 1));
                        moves.add(new Pair(x + 2, y - 2));
                        limit=limit+1;
                        bicie(x + 2, y - 2);
                    }
                }
                if (x + 2 <= 7 && x + 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x + 1][y + 1] == 2 || board[x + 1][y + 1] == 4) && board[x + 2][y + 2] == 0) {
                        moves.add(new Pair(x + 1, y + 1));
                        moves.add(new Pair(x + 2, y + 2));
                        limit=limit+1;
                        bicie(x + 2, y + 2);
                    }
                }
            }
            if (board[x][y] == 4) {
                if (x + 2 <= 7 && x + 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x + 1][y - 1] == 1 || board[x + 1][y - 1] == 3) && board[x + 2][y - 2] == 0) {
                        moves.add(new Pair(x + 1, y - 1));
                        moves.add(new Pair(x + 2, y - 2));
                        changeToDBlack(x + 2, y - 2);
                        limit=limit+1;
                        bicie(x + 2, y - 2);
                    }
                }
                if (x + 2 <= 7 && x + 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x + 1][y + 1] == 1 || board[x + 1][y + 1] == 3) && board[x + 2][y + 2] == 0) {
                        moves.add(new Pair(x + 1, y + 1));
                        moves.add(new Pair(x + 2, y + 2));
                        changeToDBlack(x + 2, y + 2);
                        limit=limit+1;
                        bicie(x + 2, y + 2);
                    }
                }
                if (x - 2 <= 7 && x - 2 >= 0 && y - 2 <= 7 && y - 2 >= 0) {
                    if ((board[x - 1][y - 1] == 1 || board[x - 1][y - 1] == 3) && board[x - 2][y - 2] == 0) {
                        moves.add(new Pair(x - 1, y - 1));
                        moves.add(new Pair(x - 2, y - 2));
                        changeToDBlack(x - 2, y - 2);
                        limit=limit+1;
                        bicie(x - 2, y - 2);
                    }
                }
                if (x - 2 <= 7 && x - 2 >= 0 && y + 2 <= 7 && y + 2 >= 0) {
                    if ((board[x - 1][y + 1] == 1 || board[x - 1][y + 1] == 3) && board[x - 2][y + 2] == 0) {
                        moves.add(new Pair(x - 1, y + 1));
                        moves.add(new Pair(x - 2, y + 2));
                        changeToDBlack(x - 2, y + 2);
                        limit=limit+1;
                        bicie(x - 2, y + 2);
                    }
                }
            }
        }
        else return;
    }

    public String isMove() {

        int jeden=0;
        int dwa=0;
        int trzy=0;
        int cztery=0;

        for (int x=0; x<8 ; x++) {
            for (int y=0; y<8; y++) {
                    if (board[x][y]==1) {
                        if (0<=x-1 && x-1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x - 1][y - 1] == 0) {
                                jeden++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x - 1][y - 1] == 2 || board[x - 1][y - 1] == 4) && board[x - 2][y - 2] == 0) {
                                jeden++;
                            }
                        }
                        if (0<=x-1 && x-1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x - 1][y + 1] == 0) {
                                jeden++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x - 1][y + 1] == 2 || board[x - 1][y + 1] == 4) && board[x - 2][y + 2] == 0) {
                                jeden++;
                            }
                        }
                    }
                    if (board[x][y]==2) {
                        if (0<=x+1 && x+1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x + 1][y - 1] == 0) {
                                dwa++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x + 1][y - 1] == 1 || board[x + 1][y - 1] == 3) && board[x + 2][y - 2] == 0) {
                                dwa++;
                            }
                        }
                        if (0<=x+1 && x+1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x + 1][y + 1] == 0) {
                                dwa++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x + 1][y + 1] == 1 || board[x + 1][y + 1] == 3) && board[x + 2][y + 2] == 0) {
                                dwa++;
                            }
                        }
                    }
                    if (board[x][y]==3 ){
                        if (0<=x-1 && x-1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x - 1][y - 1] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x - 1][y - 1] == 2 || board[x - 1][y - 1] == 4) && board[x - 2][y - 2] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x-1 && x-1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x - 1][y + 1] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x - 1][y + 1] == 2 || board[x - 1][y + 1] == 4) && board[x - 2][y + 2] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x+1 && x+1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x + 1][y - 1] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x + 1][y - 1] == 2 || board[x + 1][y - 1] == 4) && board[x + 2][y - 2] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x+1 && x+1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x + 1][y + 1] == 0) {
                                trzy++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x + 1][y + 1] == 2 || board[x + 1][y + 1] == 4) && board[x + 2][y + 2] == 0) {
                                trzy++;
                            }
                        }
                    }
                    if (board[x][y]==4 ){
                        if (0<=x-1 && x-1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x - 1][y - 1] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x - 1][y - 1] == 1 || board[x - 1][y - 1] == 3) && board[x - 2][y - 2] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x-1 && x-1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x - 1][y + 1] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x-2 && x-2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x - 1][y + 1] == 1 || board[x - 1][y + 1] == 3) && board[x - 2][y + 2] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x+1 && x+1<+7 && 0<=y-1 && y-1<=7) {
                            if (board[x + 1][y - 1] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y-2 && y-2<=7) {
                            if ((board[x + 1][y - 1] == 1 || board[x + 1][y - 1] == 3) && board[x + 2][y - 2] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x+1 && x+1<+7 && 0<=y+1 && y+1<=7) {
                            if (board[x + 1][y + 1] == 0) {
                                cztery++;
                            }
                        }
                        if (0<=x+2 && x+2<+7 && 0<=y+2 && y+2<=7) {
                            if ((board[x + 1][y + 1] == 1 || board[x + 1][y + 1] == 3) && board[x + 2][y + 2] == 0) {
                                cztery++;
                            }
                        }
                    }
            }
        }
        if ((jeden>0 || trzy>0) && (cztery==0 && dwa==0)) {
            return "white";
        }
        if ((jeden==0 && trzy==0) && (cztery>0 || dwa>0)) {
            return "black";
        }
        else    return "brak";
    }

    public void winner() {
        Integer white = 0;
        Integer black = 0;
        String winner="";
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                if(board[i][j]==1) {
                    white++;
                }
                if(board[i][j]==2) {
                    black++;
                }
                if(board[i][j]==3) {
                    white++;
                }
                if(board[i][j]==4) {
                    black++;
                }
            }
        }
        if (white==0 && black>0) {
            winner="black";
        }
        if (black==0 && white>0) {
            winner="white";
        }
        if (isMove()=="black") {
            winner="black";
        }
        if (isMove()=="white") {
            winner="white";
        }
        if (winner=="black") {
            running=0;
            textView0.setText("Wygrywają czarne");
            textView0.setVisibility(View.VISIBLE);
        }
        if (winner=="white") {
            running=0;
            textView0.setText("Wygrywają białe");
            textView0.setVisibility(View.VISIBLE);
        }
    }

    public void test() {

        board[0][0]=8;
        board[0][1]=0;
        board[0][2]=8;
        board[0][3]=0;
        board[0][4]=8;
        board[0][5]=0;
        board[0][6]=8;
        board[0][7]=0;

        board[1][0]=0;
        board[1][1]=8;
        board[1][2]=0;
        board[1][3]=8;
        board[1][4]=0;
        board[1][5]=8;
        board[1][6]=0;
        board[1][7]=8;

        board[2][0]=8;
        board[2][1]=0;
        board[2][2]=8;
        board[2][3]=0;
        board[2][4]=8;
        board[2][5]=0;
        board[2][6]=8;
        board[2][7]=0;

        board[3][0]=0;
        board[3][1]=8;
        board[3][2]=0;
        board[3][3]=8;
        board[3][4]=0;
        board[3][5]=8;
        board[3][6]=0;
        board[3][7]=8;

        board[4][0]=8;
        board[4][1]=0;
        board[4][2]=8;
        board[4][3]=0;
        board[4][4]=8;
        board[4][5]=0;
        board[4][6]=8;
        board[4][7]=0;

        board[5][0]=0;
        board[5][1]=8;
        board[5][2]=0;
        board[5][3]=8;
        board[5][4]=0;
        board[5][5]=8;
        board[5][6]=0;
        board[5][7]=8;

        board[6][0]=8;
        board[6][1]=0;
        board[6][2]=8;
        board[6][3]=0;
        board[6][4]=8;
        board[6][5]=0;
        board[6][6]=8;
        board[6][7]=0;

        board[7][0]=0;
        board[7][1]=8;
        board[7][2]=0;
        board[7][3]=8;
        board[7][4]=0;
        board[7][5]=8;
        board[7][6]=0;
        board[7][7]=8;


        button22.setImageResource(R.drawable.ic_black_circle_foreground);
        button22.setBackgroundColor(Color.parseColor("#00B000"));
        board[2][5]=2;

        button36.setImageResource(R.drawable.ic_black_circle_foreground);
        button36.setBackgroundColor(Color.parseColor("#00B000"));
        board[4][3]=2;

        button50.setImageResource(R.drawable.ic_black_circle_foreground);
        button50.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][1]=2;

        button57.setImageResource(R.drawable.ic_white_circle_foreground);
        button57.setBackgroundColor(Color.parseColor("#00B000"));
        board[7][0]=1;


        textView0.setVisibility(View.GONE);
        running=1;
        count();
    }

    public void test2() {

        board[0][0]=8;
        board[0][1]=0;
        board[0][2]=8;
        board[0][3]=0;
        board[0][4]=8;
        board[0][5]=0;
        board[0][6]=8;
        board[0][7]=0;

        board[1][0]=0;
        board[1][1]=8;
        board[1][2]=0;
        board[1][3]=8;
        board[1][4]=0;
        board[1][5]=8;
        board[1][6]=0;
        board[1][7]=8;

        board[2][0]=8;
        board[2][1]=0;
        board[2][2]=8;
        board[2][3]=0;
        board[2][4]=8;
        board[2][5]=0;
        board[2][6]=8;
        board[2][7]=0;

        board[3][0]=0;
        board[3][1]=8;
        board[3][2]=0;
        board[3][3]=8;
        board[3][4]=0;
        board[3][5]=8;
        board[3][6]=0;
        board[3][7]=8;

        board[4][0]=8;
        board[4][1]=0;
        board[4][2]=8;
        board[4][3]=0;
        board[4][4]=8;
        board[4][5]=0;
        board[4][6]=8;
        board[4][7]=0;

        board[5][0]=0;
        board[5][1]=8;
        board[5][2]=0;
        board[5][3]=8;
        board[5][4]=0;
        board[5][5]=8;
        board[5][6]=0;
        board[5][7]=8;

        board[6][0]=8;
        board[6][1]=0;
        board[6][2]=8;
        board[6][3]=0;
        board[6][4]=8;
        board[6][5]=0;
        board[6][6]=8;
        board[6][7]=0;

        board[7][0]=0;
        board[7][1]=8;
        board[7][2]=0;
        board[7][3]=8;
        board[7][4]=0;
        board[7][5]=8;
        board[7][6]=0;
        board[7][7]=8;


        button15.setImageResource(R.drawable.ic_green_circle_foreground);
        button15.setBackgroundColor(Color.parseColor("#00B000"));
        board[0][7]=0;

        button15.setImageResource(R.drawable.ic_black_circle_foreground);
        button15.setBackgroundColor(Color.parseColor("#00B000"));
        board[1][6]=2;

        button29.setImageResource(R.drawable.ic_black_circle_foreground);
        button29.setBackgroundColor(Color.parseColor("#00B000"));
        board[3][4]=2;

        button43.setImageResource(R.drawable.ic_black_circle_foreground);
        button43.setBackgroundColor(Color.parseColor("#00B000"));
        board[5][2]=2;

        button50.setImageResource(R.drawable.ic_white_circle_foreground);
        button50.setBackgroundColor(Color.parseColor("#00B000"));
        board[6][1]=1;


        textView0.setVisibility(View.GONE);
        running=1;
        count();
    }
}