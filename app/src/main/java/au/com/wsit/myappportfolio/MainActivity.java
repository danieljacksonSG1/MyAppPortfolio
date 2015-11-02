package au.com.wsit.myappportfolio;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{

    // Define Buttons and TextView
    Button mSpotifyStreamer;
    Button mScoresApp;
    Button mLibraryApp;
    Button mBuildItBigger;
    Button mXYZReader;
    Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a handle on the UI elements
        mSpotifyStreamer = (Button) findViewById(R.id.spotifyStreamerButton);
        mScoresApp = (Button) findViewById(R.id.scoresAppButton);
        mLibraryApp = (Button) findViewById(R.id.libraryAppButton);
        mBuildItBigger = (Button) findViewById(R.id.buildItBiggerButton);
        mXYZReader = (Button) findViewById(R.id.xyzReaderButton);
        mCapstone = (Button) findViewById(R.id.capstoneButton);


        // Set up the button listeners
        mSpotifyStreamer.setOnClickListener(spotifyListener);
        mScoresApp.setOnClickListener(scoresAppListener);
        mLibraryApp.setOnClickListener(libraryAppListener);
        mBuildItBigger.setOnClickListener(buildItBiggerAppListener);
        mXYZReader.setOnClickListener(XYZListener);
        mCapstone.setOnClickListener(capstoneListener);


    }

    // Listeners
    View.OnClickListener spotifyListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching the Spotify Streamer App", Toast.LENGTH_LONG).show();
        }
    };

    // Scores App listener
    View.OnClickListener scoresAppListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching the Scores App", Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener libraryAppListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching the Library App", Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener buildItBiggerAppListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching Build It Bigger", Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener XYZListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching XYZ Reader", Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener capstoneListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Launching my Capstone App", Toast.LENGTH_LONG).show();
        }
    };

    public void displayAbout()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("By Guy Bridge")
                .setPositiveButton(android.R.string.ok, null)
                .setTitle("About");

        AlertDialog dialog = builder.create();
        dialog.show();
    }



    // Menu items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id)
        {
            case R.id.action_about:
                // Launch the about
                displayAbout();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
