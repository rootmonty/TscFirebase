package monty.tscf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;


/**
 * Created by monty on 13/9/16.
 */
public class Welcome extends Fragment {

    LinearLayout line;
    // ListView mDrawerList;
    //  ArrayAdapter<String> adapter;
    //  ActionBarDrawerToggle actionBarDrawerToggle;


    // Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.navidrawer, container, false);
      /*  Firebase.setAndroidContext(root.getContext());
        mDrawerList = (ListView) root.findViewById(R.id.nav_list);
        line = (LinearLayout) root.findViewById(R.id.linear1);
        addDraweritems();

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        */

        return root;
    }

/*
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
            FragmentManager fragmentmanager = getFragmentManager();
            fragmentmanager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            mDrawerList.closeDrawer(mDrawerList);
        }

    }

    private void addDraweritems() {

        String[] itArray = {"Home", "AboutUs", "General Feedback", "StaffFeedback", "Teachers Feedback", "Exit"};
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, itArray);
        mDrawerList.setAdapter(adapter);
    }
   */

}
