package com.example.finalx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton Eating;
    ImageButton Exercises;
    ImageButton Info;
    ImageButton Calculators;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Eating going
        Eating = findViewById(R.id.Eating);
        Eating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,com.example.finalx.Eating.class);
                startActivity(intent);
            }
        });

        Exercises = findViewById(R.id.Exercises);
        Exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,com.example.finalx.Exercises.class);
                startActivity(intent);
            }
        });

        Calculators = findViewById(R.id.Calculators);
        Calculators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,com.example.finalx.Calculators.class);
                startActivity(intent);
            }
        });

        Info = findViewById(R.id.Info);
        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,com.example.finalx.Info.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.exercises) {

            Intent intent = new Intent(MainActivity.this, com.example.finalx.Exercises.class);
            startActivity(intent);

        } else if (id == R.id.Info) {
            Intent intent = new Intent(MainActivity.this, com.example.finalx.Info.class);
            startActivity(intent);

        } else if (id == R.id.Eating) {

            Intent intent = new Intent(MainActivity.this, com.example.finalx.Eating.class);
            startActivity(intent);

        } else if (id == R.id.Calculators) {

            Intent intent = new Intent(MainActivity.this, com.example.finalx.CalculatorCalories.class);
            startActivity(intent);

        } else if (id == R.id.contact) {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:22572344"));
            startActivity(intent);

        } else if (id == R.id.gym) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0q?=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);
        }

        else if (id == R.id.rate) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0q?=61 Egegårdsvej, Rødovre, Denmark"));
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

}
