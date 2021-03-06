package com.example.adoublelz.animalforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explict
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnStart);
        final EditText editText = (EditText) findViewById(R.id.txtName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length()==0){ //if edittext free isn't input name
                    Toast.makeText(getApplicationContext(),"ใส่ชื่อให้ด้วยนะ",Toast.LENGTH_SHORT).show();

                }
                else {
                    nameString = editText.getText().toString().trim();
                    Toast.makeText(getApplicationContext(),"ดีจ้า "+nameString,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Game.class);
                    startActivity(intent);

                }
            }
        }); // Button Start

    } //Main Method


} //EndMainClass
