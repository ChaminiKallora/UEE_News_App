package com.example.newsapp;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send, R.id.add_to_home)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

//    @Override
//    public boolean onNavigationItemSelected (MenuItem item) {
//        int id = item.getItemId();
//
//        Fragment fragment - null;
//
//        if (id == R.id.add_to_home){
//            fragment = new AddToHome();
//        }
//
//        if (fragment != null)
//
//
//
//    }


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }




//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    public void displayToast(View view) {
        switch (view.getId()) {
            case R.id.btn_business:
                Toast.makeText(this, "Shourtcut business created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_entertainment:
                Toast.makeText(this, "Shourtcut entertainment created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_fashion:
                Toast.makeText(this, "Shourtcut fashion created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_health:
                Toast.makeText(this, "Shourtcut health created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_main_news:
                Toast.makeText(this, "Shourtcut main news created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_politics:
                Toast.makeText(this, "Shourtcut politics created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_science:
                Toast.makeText(this, "Shourtcut science created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_sports:
                Toast.makeText(this, "Shourtcut sports created!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_world:
                Toast.makeText(this, "Shourtcut world created!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
