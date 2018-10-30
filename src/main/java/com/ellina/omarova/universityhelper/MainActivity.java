package com.ellina.omarova.universityhelper;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.mainToolbar);
        toolbar.setTitle("University Helper");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite, getTheme()));
        setSupportActionBar(toolbar);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.Theme_AppCompat_Light_Dialog);
        builder.setMessage("Elina Omarova \nomarova.e@nisa.edu.kz ").setTitle("University Helper v 1.0");
        dialog = builder.create();

        Button unviersitiesButton = findViewById(R.id.universitiesButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_info_main) {
            Log.i("test", "TEST");


            dialog.show();
        }
        return true;
    }
}
