package com.example.mathcal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.mathcal.FragmentSlideBar.calculatorFragment;
import com.example.mathcal.FragmentSlideBar.converterFragment;
import com.example.mathcal.recViewBDatar.Frag1;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new calculatorFragment(this)).commit();
            navigationView.setCheckedItem(R.id.nav_calculator);
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_calculator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new calculatorFragment(this)).commit();
                getSupportActionBar().setTitle("Calculator");
                break;
            case R.id.nav_convert:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new converterFragment()).commit();
                getSupportActionBar().setTitle("Converter Money");
                break;
            case R.id.nav_bruang:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Frag1()).commit();
                getSupportActionBar().setTitle("Bangun Ruang");
                break;
           /* case R.id.logout:
                AlertDialog.Builder logout = new AlertDialog.Builder(this);        //this//
                logout.setTitle("Logout?");
                logout.setMessage("Are you sure?");
                logout.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, login.class);
                        startActivity(intent);
                        finish();
                    }
                });
                logout.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Canceled", Toast.LENGTH_SHORT).show();
                    }
                });
                logout.create().show();
                break; */
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
