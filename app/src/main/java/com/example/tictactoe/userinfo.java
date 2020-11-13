package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class userinfo extends AppCompatActivity {

    EditText player1, player2;
    Button button1, button2, button_rules;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        player1 = (EditText) findViewById(R.id.player1name);
        player2 = (EditText) findViewById(R.id.player2name);
        button_rules = (Button) findViewById(R.id.button_rules);
        button2 = (Button) findViewById(R.id.button_qt);
        button1 = (Button) findViewById(R.id.button_st);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
        button_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(userinfo.this, rules_activity.class);
                startActivity(in);
            }
        });


    }
    
    public void openact() {
            String text1=player1.getText().toString();
            String text2=player2.getText().toString();
            if(text1.length()==0 || text2.length()==0)
            {
                Toast.makeText(this, "Please Enter the Player Name(0-9 Characters)", Toast.LENGTH_SHORT).show();
            }
            else if(text1.length()>=9 || text2.length()>=9)
            {
                Toast.makeText(this, "Please Enter Valid Player Name(0-9 Characters)", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent in =new Intent(userinfo.this,MainActivity.class);
                in=in.putExtra("ply11",text1);
                in=in.putExtra("ply22",text2);
                startActivity(in);
            }
    }
}

