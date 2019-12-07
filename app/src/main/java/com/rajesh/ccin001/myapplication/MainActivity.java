package com.rajesh.ccin001.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView menu_ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_ImageView = (ImageView) findViewById(R.id.menu);
        menu_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myOnClickMethod();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void  myOnClickMethod() {
        openOptionsMenu();
    }
}
