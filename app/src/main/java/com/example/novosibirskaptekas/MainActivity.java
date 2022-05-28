package com.example.novosibirskaptekas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animShowFab = AnimationUtils.loadAnimation(this, R.anim.btn_append);
        Animation animShowFab1 = AnimationUtils.loadAnimation(this, R.anim.btn_append1);
        Animation animShowFab2 = AnimationUtils.loadAnimation(this, R.anim.btn_append2);
        Animation animShowFab3 = AnimationUtils.loadAnimation(this, R.anim.btn_append3);
        Animation animHideFab = AnimationUtils.loadAnimation(this, R.anim.scale);

        Button btnShowFab = (Button) findViewById(R.id.btnAppend);
        Button scale1 = (Button) findViewById(R.id.scale1);
        Button scale2 = (Button) findViewById(R.id.scale2);
        Button scale3 = (Button) findViewById(R.id.scale3);
        Button scale4 = (Button) findViewById(R.id.scale4);


        btnShowFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnShowFab.setClickable(false);
                btnShowFab.startAnimation(animHideFab);
                scale1.startAnimation(animShowFab);
                scale2.startAnimation(animShowFab1);
                scale3.startAnimation(animShowFab2);
                scale4.startAnimation(animShowFab3);
            }
        });

    }
    public void search1(View view){
        Intent intent = new Intent(this, firstZapros.class);
        startActivity(intent);
    }
    public void search2(View view){
        Intent intent = new Intent(this, findMedical.class);
        startActivity(intent);
    }
    public void post1(View view){
        Intent intent = new Intent(this, newPharmacy.class);
        startActivity(intent);
    }
    public void post2(View view){
        Intent intent = new Intent(this, NewMedical.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Intent intent =null;
        switch (item.getItemId())
        {
            case R.id.m1: intent = new Intent(this, firstZapros.class);
                break;
            case R.id.m2: intent = new Intent(this, findMedical.class);
                break;
            case R.id.m3: intent = new Intent(this, newPharmacy.class);
                break;
            case R.id.m4: intent = new Intent(this, NewMedical.class);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

}