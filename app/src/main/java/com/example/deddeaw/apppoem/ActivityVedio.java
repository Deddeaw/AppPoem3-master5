package com.example.deddeaw.apppoem;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActivityVedio extends AppCompatActivity {

    private VideoView videoView1;
    //private Button btn11,btn12;
    ImageView imgpaImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);

        //imgpaImageView = findViewById(R.id.img01);


        VideoView myVideoV = (VideoView)findViewById(R.id.vdo1);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.test));
        myVideoV.setMediaController(new MediaController(this));
        myVideoV.requestFocus();
        myVideoV.start();

    }
}
