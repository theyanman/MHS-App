package com.codeforcharity.michaelyanyoga.mhsappredesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {


    public static final String TAG = "TimeLineActivity";

    private static final String baseURl = "https://twitter.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" data-theme=\"dark\" data-link-color=\"#19CF86\" href=\"https://twitter.com/ONEMHS\">Tweets by ONEMHS</a>" + "<script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Start Push Notifications

        MixpanelAPI mMixpanel = MixpanelAPI.getInstance(this, "beb7feb51cfb6c46d0e2446586b90dcb");
        MixpanelAPI mixpanel = MixpanelAPI.getInstance(this, "beb7feb51cfb6c46d0e2446586b90dcb");
        MixpanelAPI.People people = mMixpanel.getPeople();

        if (mMixpanel.getPeople().getDistinctId() == "13793" || mMixpanel.getPeople().getDistinctId() == "32031598"||
            mMixpanel.getPeople().getDistinctId() == "3d6c3bb8-b44e-4337-989a-1f091be2bf04") {
            mMixpanel.reset();
        }

        people.identify(mMixpanel.getDistinctId());
        people.initPushHandling("674312721497");


    try {
        JSONObject props = new JSONObject();
        props.put("Gender", "Male");
        props.put("Logged in", false);
        mixpanel.track("MainActivity - onCreate called", props);
    } catch (JSONException e) {
        Log.e("MYAPP", "Unable to add properties to JSONObject", e);
    }

        //End Push Notifications

        load_background_color();


        ImageButton bellButton = (ImageButton) findViewById(R.id.bell);
        ImageButton engradeButton = (ImageButton) findViewById(R.id.engrade);
        ImageButton facultyButton = (ImageButton) findViewById(R.id.faculty);
        ImageButton sportsButton = (ImageButton) findViewById(R.id.sports);
        ImageButton sponsorsButton = (ImageButton) findViewById(R.id.sponsors);
        ImageButton announcementsButton = (ImageButton) findViewById(R.id.announcements);
        ImageButton calendarButton = (ImageButton) findViewById(R.id.calendar);
        ImageButton clubsButton = (ImageButton) findViewById(R.id.clubs);


        engradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EngradeActivity.class);
                startActivity(intent);

            }
        });

        sponsorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);

            }
        });

        bellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BellActivity.class);
                startActivity(intent);

            }
        });

        facultyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FacultyActivity.class);
                startActivity(intent);

            }
        });
        announcementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnnouncementsActivity.class);
                startActivity(intent);

            }
        });
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
        clubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClubsActivity.class);
                startActivity(intent);
            }
        });
        sportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SportsActivity.class);
                startActivity(intent);

            }
        });

        WebView webView = (WebView) findViewById(R.id.webView5);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);




    }

    private void load_background_color() {
        WebView webView = (WebView) findViewById(R.id.webView5);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }


}