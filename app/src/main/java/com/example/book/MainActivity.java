package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.soreo);
        button2=(Button)findViewById(R.id.kkho);
        button3=(Button)findViewById(R.id.abc);
        button4=(Button)findViewById(R.id.digit);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.soreo){
            String[] data=getResources().getStringArray(R.array.vowels);
            String[] data2=getResources().getStringArray(R.array.vowelsdetails);

            Intent intent=new Intent(MainActivity.this,Details.class);
            intent.putExtra("data",data);
            intent.putExtra("data2",data2);
            startActivity(intent);
        }
        if(v.getId()==R.id.kkho){
            String[] data=getResources().getStringArray(R.array.consonant);
            String[] data2=getResources().getStringArray(R.array.consonantdetails);

            Intent intent=new Intent(MainActivity.this,Details.class);
            intent.putExtra("data",data);
            intent.putExtra("data2",data2);
            startActivity(intent);

        }
        if(v.getId()==R.id.abc){
            String[] data=getResources().getStringArray(R.array.abc);
            String[] data2=getResources().getStringArray(R.array.abcdetails);

            Intent intent=new Intent(MainActivity.this,Details.class);
            intent.putExtra("data",data);
            intent.putExtra("data2",data2);
            startActivity(intent);

        }
        if(v.getId()==R.id.digit){
            String[] data=getResources().getStringArray(R.array.digit);
            String[] data2=getResources().getStringArray(R.array.digitdetails);

            Intent intent=new Intent(MainActivity.this,Details.class);
            intent.putExtra("data",data);
            intent.putExtra("data2",data2);
            startActivity(intent);

        }
    }
}
