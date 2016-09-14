package monty.tscf.Fragments;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.firebase.client.Firebase;

import monty.tscf.R;
import monty.tscf.Welcome;

/**
 * Created by monty on 14/9/16.
 */
public class BaseNavActivity extends AppCompatActivity {

    ListView mDrawerList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navmainactivity);
        Firebase.setAndroidContext(this);
        //back = (ImageView) findViewById(R.id.back);
        //back.setBackgroundResource(R.drawable.final_options_02);
        mDrawerList = (ListView) findViewById(R.id.nav_list);
        addDraweritems();

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    public void bringthis(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Welcome();
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
            //mDrawerList.closeDrawer(mDrawerList);
        }

    }

    private void addDraweritems() {

        String[] itArray = {"Home", "AboutUs", "General Feedback", "StaffFeedback", "Teachers Feedback", "Exit"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itArray);
        mDrawerList.setAdapter(adapter);
    }

    private class DrawerItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            bringthis(i);
        }
    }
}
