package monty.tscf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by monty on 13/9/16.
 */
public class Welcome extends AppCompatActivity {

    LinearLayout line;
    ListView mDrawerList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawerList = (ListView) findViewById(R.id.nav_list);
        line = (LinearLayout) findViewById(R.id.linear1);
        addDraweritems();

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Welcome.this, "Time for an upgrade!", Toast.LENGTH_SHORT).show();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    private void addDraweritems() {

        String[] itArray = {"Home", "AboutUs", "Feedback", "GetScore", "Exit"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itArray);
        mDrawerList.setAdapter(adapter);
    }
}
