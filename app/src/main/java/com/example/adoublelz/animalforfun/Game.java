package com.example.adoublelz.animalforfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    //Explicit
    Button btn1 , btn2 , btn3 , btn4 ;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumeImageButton;
    int questionCount = 1; //num question
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Intitail view
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumeImageButton = (ImageButton) findViewById(R.id.imvvolume);

        for (int i = 1;i<=questionCount;i++) {

            qID.add(i);//จองพื้นที่หน่วยความจำจำนวนข้อคำถาม
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));

    } //main Method

    public void playSound(){

        mediaPlayer.start();

    }   //End playSound Method

    private void setQuestion(Integer qID) {

        if(qID == 1){
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("แกะ");
            choice.add("หมู");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }

    }  //End setQuestion Method

}//Main Class
