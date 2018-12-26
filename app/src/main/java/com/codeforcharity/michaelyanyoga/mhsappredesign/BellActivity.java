package com.codeforcharity.michaelyanyoga.mhsappredesign;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class BellActivity extends AppCompatActivity {
    private String[] schedule;
    private Spinner spinner;
    private TextView textview;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.backbutton3));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BellActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        final ImageView content = (ImageView) findViewById(R.id.content);

        schedule = getResources().getStringArray(R.array.schedule);
        spinner = (Spinner) findViewById(R.id.bellSpinner);
        //textview = (TextView) findViewById(R.id.textView2);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, schedule);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setScrollBarSize(25);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner.getSelectedItemPosition() == 0) {
                    //Normal
                    content.setImageResource(R.drawable.regular);

                }
                if (spinner.getSelectedItemPosition() == 1) {
                    //Wednesday
                    content.setImageResource(R.drawable.wednesday);

                }
                if (spinner.getSelectedItemPosition() == 2) {
                    //Delay
                    content.setImageResource(R.drawable.delay);

                }
                if (spinner.getSelectedItemPosition() == 3) {
                    //Dismissal
                    content.setImageResource(R.drawable.dismissal);

                }
                if (spinner.getSelectedItemPosition() == 4) {
                    //3 Hour delay
                    content.setImageResource(R.drawable.delay2);

                }
                if (spinner.getSelectedItemPosition() == 5) {
                    //Lunch
                    content.setImageResource(R.drawable.lunches);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
