package com.example.auser.demofloatingbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] items;
    int[] iconRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();////////////////for(int i=0;i<items.length;i++)
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    void init(){
        items = getResources().getStringArray(R.array.item);
        iconRes=new int[]{
                R.drawable.pikachu,
                R.drawable.bullbasaur,
                R.drawable.meowth,
                R.drawable.pokeball,
                R.drawable.psyduck,

        };
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu,menu);
        for(int i=0;i<items.length;i++)
        menu.add(0,(i+1)*100,0,items[i]).setIcon(iconRes[i]).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case 100:
            case 200:
            case 300:
            case 400:
            case 500:
                Toast.makeText(MainActivity.this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
