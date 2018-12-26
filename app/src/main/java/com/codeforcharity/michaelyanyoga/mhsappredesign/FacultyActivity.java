package com.codeforcharity.michaelyanyoga.mhsappredesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class FacultyActivity extends AppCompatActivity {

    String androidListViewStrings[] = {"Kristine Alvarez:\nkalvarez@k12.wv.us",
            "Brandi Ammons:\nbammons@k12.wv.us",
            "Hannah Barnes:\nhebarnes@k12.wv.us",
            "Joel Barrett:\njcbarret@k12.wv.us",
            "Daniela Battaglia:\ndaniela.battaglia@k12.wv.us",
            "Sue Begunich:\nsbegunic@k12.wv.us",
            "Tom Belden:\ntbelden@k12.wv.us",
            "Robin Belmear:\nrljohnso@k12.wv.us",
            "Jason Bennett:\njason.t.bennett@k12.wv.us",
            "Becky Berry:\nbaberry@k12.wv.us",
            "Dan Berry:\ndnlberry@k12.wv.us",
            "Pam Berryman:\npaberryma@k12.wv.us",
            "Steve Blinco:\nsblinco@k12.wv.us",
            "Barbara Born:\nbborn@k12.wv.us",
            "Randi Bourne:\nrbourne@k12.wv.us",
            "Kristin Brewster:\nkbrewster@k12.wv.us",
            "Linda Brosky:\nlbrosky@k12.wv.us",
            "Sam Brunette:\nsjbrunet@k12.wv.us",
            "Drew Calandrelli:\ndrew.calandrelli@k12.wv.us",
            "Caitlin Campbell:\nc.r.campbell@k12.wv.us",
            "Regina Chisler:\nrchisler@k12.wv.us",
            "Kevin Colistra:\nkcolistra@k12.wv.us",
            "Matt Cooper:\nmdcooper@k12.wv.us",
            "Joel Cotter:\njcotter@k12.wv.us",
            "Dennie Crouso:\ndcrouso@k12.wv.us",
            "Sherry Cumpston:\nscumpsto@k12.wv.us",
            "Greg Dausch:\ngdausch@k12.wv.us",
            "Kimberly Dawson:\nkimberly.dawson@k12.wv.us",
            "Rita Denton:\nrdenton@k12.wv.us",
            "Anna Fleming:\nanflemin@k12.wv.us",
            "John Fowkes:\njfowkes@k12.wv.us",
            "Gail Friend:\ngrfriend@k12.wv.us",
            "Bill Gibson:\nwgibson@k12.wv.us",
            "Gretchen Gibson:\nggibson@k12.wv.us",
            "Kristin Green:\nkristin.green@k12.wv.us",
            "Audra Hamrick:\na.hamrick@k12.wv.us",
            "Nathan Haynes:\nndhaynes@k12.wv.us",
            "Bill Hedrick:\nwdhedric@k12.wv.us",
            "Bob Hendricks:\njrhendri@k12.wv.us",
            "David Hohmann:\ndhohmann@k12.wv.us",
            "Pam Hoover:\nplhoover@k12.wv.us",
            "Sharon Hovland:\nshovland@k12.wv.us",
            "Brian Jackson:\nbtjackso@k12.wv.us",
            "Erica Janes:\nejanes@k12.wv.us",
            "Alaska Jimenez:\najimenez@k12.wv.us",
            "Shana Karnes:\nskarnes@k12.wv.us",
            "Matt Kelly:\nmmkelly@k12.wv.us",
            "Eric Kincaid:\nekincaid@k12.wv.us",
            "Stacey Knaggs:\nsknaggs@k12.wv.us",
            "Steve Kovac:\nskovac@k12.wv.us",
            "Jason Kruger:\njkruger@k12.wv.us",
            "Linda Laishley:\nlinda.laishley@k12.wv.us",
            "Brenda Lawrence:\nblawrenc@k12.wv.us",
            "Matt Lemine:\nmlemine@k12.wv.us",
            "Deanna Luci:\ndeanna.luci@k12.wv.us",
            "Rhonda Marshall:\nrmarshall@k12.wv.us",
            "Dan Martinelli:\ndmartine@k12.wv.us",
            "Crissy McCabe:\ncmccabe@k12.wv.us",
            "Kim McCarty:\nkmccarty@k12.wv.us",
            "Mark McCarty:\nmamccart@k12.wv.us",
            "Joe Melia:\njmelia@k12.wv.us",
            "Kim Mellie:\nlmellie@k12.wv.us",
            "Paul Mihalko:\npjmihalko@k12.wv.us",
            "Donna Monahan:\ndmonahan@k12.wv.us",
            "Eddie Morlino:\nemorlino@k12.wv.us",
            "Ashley Neal:\nanneal@k12.wv.us",
            "Lillie Nicholson:\nlnicholson@k12.wv.us",
            "Kristina Palumbo:\nkpalumbo@k12.wv.us",
            "Jennifer Poland:\njpoland@k12.wv.us",
            "Tom Powers:\ntpowers@k12.wv.us",
            "Keith Reed:\nakreed@k12.wv.us",
            "Kevin Riggleman:\nkdriggleman@k12.wv.us",
            "Christian Root View Website:\ncroot@k12.wv.us",
            "Holly Rucker:\nholiann.rucker@k12.wv.us",
            "Jeremy Ruckman:\njruckman@k12.wv.us",
            "Brian Ruehle:\nbruehle@k12.wv.us",
            "Scott Ryan:\nspryan@k12.wv.us",
            "Tiffany Schap:\ntschap@k12.wv.u",
            "Elaine Schwing:\neschwing@k12.wv.us",
            "Jenny Secreto:\njsecreto@k12.wv.us",
            "Jenny Seibert:\njseibert@k12.wv.us",
            "Katherine Sherald:\nksherald@k12.wv.us",
            "Amber Smith:\nabsmith@k12.wv.us",
            "Lauren Smith:\nlauren.smith@k12.wv.us",
            "Barb Solly:\nbsolly@k12.wv.us",
            "Melanie Sprenger:\nmsprenge@k12.wv.us",
            "Elvira Stanescu:\nestanescu@k12.wv.us",
            "Dammon Stimmel:\ndstimmel@k12.wv.us",
            "Dave Tallman:\ndstallman@k12.wv.us",
            "Nathan Tallman:\nntallman@k12.wv.us",
            "Colleen Titus:\nctitus@k12.wv.us",
            "Wendy Trump:\nwtrump@k12.wv.us",
            "Rebecca Tucker:\nrtucker@k12.wv.us",
            "Sandy Twig:\nstwigg@k12.wv.us",
            "Danielle Uglik:\nduglik@k12.wv.us",
            "Joshua Underdonk:\njunderdonk@k12.wv.us",
            "Chris Urban:\ncurban@k12.wv.us",
            "Rich Vidulich:\nrvidulic@k12.wv.us",
            "Mary Vincent:\nmmvincen@k12.wv.us",
            "Run Wang:\n191039788@qq.com",
            "Adam Warbel:\nawarbel@k12.wv.us",
            "Megan Ward:\nmmward@k12.wv.us",
            "Jennifer Waugh:\njgwaugh@k12.wv.us",
            "Linda Weber:\nljweber@k12.wv.us",
            "Sherry Williamson:\nshawilli@k12.wv.us",
            "Michelle Wolfe:\nmkwolfe@k12.wv.us",
            "Stacey Yuhase:\nsyuhase@k12.wv.us",};

        Integer image_id[] = {R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher, R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
                R.drawable.teacher,R.drawable.teacher};


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.backbutton3));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyActivity.this, MainActivity.class);
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
