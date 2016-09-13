package monty.tscf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import monty.tscf.Fragments.Aboutus;
import monty.tscf.Fragments.Exit;
import monty.tscf.Fragments.GamesFragment;
import monty.tscf.Fragments.TeacherFragment;
import monty.tscf.Fragments.TopRatedFragment;

/**
 * Created by monty on 13/9/16.
 */
public class Welcome extends AppCompatActivity {

    LinearLayout line;
    ListView mDrawerList;
    ArrayAdapter<String> adapter;

    // Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navidrawer);
        mDrawerList = (ListView) findViewById(R.id.nav_list);
        line = (LinearLayout) findViewById(R.id.linear1);
        addDraweritems();

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                bringthis(position);

            }
        });


    }

    public void bringthis(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                break;
            case 1:
                fragment = new Aboutus();
                break;
            case 2:
                fragment = new TopRatedFragment();
                break;
            case 3:
                fragment = new GamesFragment();
                break;
            case 4:
                fragment = new TeacherFragment();
                break;
            case 5:
                fragment = new Exit();
                break;
            default:
                break;

        }

        if (fragment != null) {
            FragmentManager fragmentmanager = getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            // mDrawerList.closeDrawer(mDrawerList);
        }

    }

    private void addDraweritems() {

        String[] itArray = {"Home", "AboutUs", "General Feedback", "StaffFeedback", "Teachers Feedback", "Exit"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itArray);
        mDrawerList.setAdapter(adapter);
    }
}
