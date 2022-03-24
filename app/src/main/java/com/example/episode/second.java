package com.example.episode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class second extends AppCompatActivity {
    ArrayList<eps> arraycontact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RecyclerView k=findViewById(R.id.recycle);
        k.setLayoutManager(new LinearLayoutManager(this));
        arraycontact.add(new eps(R.drawable.img_1, "New Adventure","550mb"));
        arraycontact.add(new eps(R.drawable.img, "Exploration Five ","470mb"));
        arraycontact.add(new eps(R.drawable.img_2, "Animal Adventure","1.1gb"));
        arraycontact.add(new eps(R.drawable.img_3, "Robote and Nobita","360mb"));
        arraycontact.add(new eps(R.drawable.img_4, "Wind Wizard","999mb"));
        arraycontact.add(new eps(R.drawable.img_5, "Green Giant Legend","440mb"));
        arraycontact.add(new eps(R.drawable.img_6, "Rbotic Kingdom","989mb"));
        arraycontact.add(new eps(R.drawable.img_7, "Birth of japan","958mb"));
        arraycontact.add(new eps(R.drawable.img_8, "Arabian Nights","2gb"));
        arraycontact.add(new eps(R.drawable.img_9, "Nobita's Dinosaur","3.6gb"));
        arraycontact.add(new eps(R.drawable.img_10, "Massive Hit in china","3.6gb"));
        arraycontact.add(new eps(R.drawable.img_11, "Nobi or Anktarish daku","3.6gb"));
        arraycontact.add(new eps(R.drawable.img_12, "Nobi or Hotel ","3.6gb"));


        RecyclerContactAdapter adapter= new RecyclerContactAdapter(this, arraycontact);
        k.setAdapter(adapter);
    }
}