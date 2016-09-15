package monty.tscf.Fragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import monty.tscf.LoginActivity;
import monty.tscf.R;
import monty.tscf.Welcome;

/**
 * Created by monty on 14/9/16.
 */
public class BaseNavActivity extends AppCompatActivity {

    ListView mDrawerList;
    ArrayAdapter<String> adapter;
    DrawerLayout mdrawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    //adding images on the background frame to select among student,teacher,parent,staff


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navmainactivity);
        Firebase.setAndroidContext(this);
        //back = (ImageView) findViewById(R.id.back);
        //back.setBackgroundResource(R.drawable.final_options_02);
        mDrawerList = (ListView) findViewById(R.id.nav_list);
        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        addDraweritems();

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, mdrawerLayout, R.string.openDrawer, R.string.closeDrawer) {

            /**
             * Called when a drawer has settled in a completely open state.
             */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("Navigating");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /**
             * Called when a drawer has settled in a completely closed state.
             */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(getTitle().toString());
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        /*
        includes the segment of code for the frame containing the images selection here.According to the selected image
        the user will be sent to that section of the code only
        eg a student can rate anyone but a teacher can rate only the management staff
         */

    }


    public void bringthis(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new TopRatedFragment();
                break;
            case 1:
                fragment = new GamesFragment();
                break;
            case 2:
                fragment = new TeacherFragment();
                break;
            case 3:
                fragment = new Exit();
                break;
            case 4:
                finish();
                break;

        }

        if (fragment != null) {
            FragmentManager fragmentmanager = getSupportFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            mdrawerLayout.closeDrawer(mDrawerList);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menu) {

        int id = menu.getItemId();
        switch (id) {
            case R.id.action_Developer:
                Toast.makeText(this, "Developed by Drmanhattan", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "Shows the Settings in Dialog box", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        if (actionBarDrawerToggle.onOptionsItemSelected(menu))
        {
            return true;
        }
        return super.onOptionsItemSelected(menu);
    }



    private void addDraweritems() {

        String[] itArray = {"General Feedback", "StaffFeedback", "Teachers Feedback", "GetTscore", "Exit"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itArray);
        mDrawerList.setAdapter(adapter);
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            bringthis(i);
        }
    }
}
