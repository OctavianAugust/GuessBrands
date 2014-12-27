package mironyuk.roma.guessbrands.guessbrandsm;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import mironyuk.roma.guessbrands.guessbrandsm.Models.ItemProgress;

import java.util.ArrayList;


public class ProgressList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_progress);

        // Set up your ActionBar
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.abs_layout);

        // You customization
        final int actionBarColor = getResources().getColor(R.color.holo_orange_dark);
        actionBar.setBackgroundDrawable(new ColorDrawable(actionBarColor));


        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);

        ItemProgress[] list_progress = new ItemProgress[]{new ItemProgress("Level 1", 20),
                new ItemProgress("Level 2", 60), new ItemProgress("Level 3", 80),
                new ItemProgress("Level 4", 10), new ItemProgress("Level 5", 20),
                new ItemProgress("Level 6", 20), new ItemProgress("Level 7", 20)};


        ListArrayAdapter adapt = new ListArrayAdapter(this, R.layout.progress_item, list_progress);
        menuList.setAdapter(adapt);


        /*

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {

                // Note: if the list was built "by hand" the id could be used.
                // As-is, though, each item has the same id

                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    // Launch the Game Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizGameActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    // Launch the Help Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizHelpActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    // Launch the Settings Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizSettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    // Launch the Scores Activity
                    startActivity(new Intent(QuizMenuActivity.this, QuizScoresActivity.class));
                }

            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_progress_list, menu);
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
}
