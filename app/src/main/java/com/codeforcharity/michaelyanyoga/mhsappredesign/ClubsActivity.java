package com.codeforcharity.michaelyanyoga.mhsappredesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ClubsActivity extends AppCompatActivity {
    String androidListViewStrings[] = {"Code4Charity", "Adventure Club",
            "African American Awareness Club", "Anime Club", "Art Club", "Art Honorary",
            "Beta Club", "Board Game Club", "Chinese Club", "Club India", "Creative Arts History Club",
            "Dance Team", "Environmentors", "ETC: Experiences through Competition", "Faith Fellowship", "FCCLA",
            "Fishing and Outdoor Club", "French Club", "Future Problem Solving Program International (FPSPI)",
            "Geography Awareness Club", "German Club", "Green Initiative Club", "Habitat for Humanity", "Hi-Y",
            "HSTA", "Images", "Italian Heritage Club", "Jewish Culture Club", "Key club",
            "Library Media Specialists Club", "MHS Book Club", "MHS Thespian Troupe 27/Drama Club",
            "Mu Alpha Theta", "National History Club", "National Honor Society", "National Spanish Honorary",
            "Nuru International Club", "Peer Education", "Photo Club", "Physics Club", "Ping-Pong club",
            "Red and Blue Spectrum Club", "Rowdie Society", "Science Honor", "Social Studies Club",
            "Speech and Debate Club", "Ski Club", "TATU - Teens Against Tobacco Use",
            "Technology Student Association (TSA)", "Video Gaming Club", "Young Democrats"};

    Integer image_id[] = {R.drawable.c4clogosmall, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, R.drawable.clubspic, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, R.drawable.clubspic, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, R.drawable.clubspic, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, R.drawable.clubspic, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, R.drawable.clubspic, R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,
            R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic,  R.drawable.clubspic,R.drawable.clubspic,R.drawable.clubspic, };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.backbutton3));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        AndroidListAdapter androidListAdapter = new AndroidListAdapter(this, image_id, androidListViewStrings);
        ListView androidListView = (ListView) findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);


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
